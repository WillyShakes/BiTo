package com.willycode.bito.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.willycode.bito.Data.BusProvider;
import com.willycode.bito.Data.DataManager;
import com.willycode.bito.R;
import com.willycode.bito.UI.FavoriteStation.FavoriteStationFragment;
import com.willycode.bito.UI.StationPicker.StationPickerActivity;
import com.willycode.bito.Utils.Events.FragmentSelectedEvent;

public class StartActivity extends AppCompatActivity {


    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager viewPager;
    private static int selected = -1;
    private static int FAV = 0;
    private static int TWEET = 1;
    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.ic_menu_star,
            R.drawable.twitter
    };
    private FloatingActionButton fab;
    private Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mBus = BusProvider.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);
        setTitle(getString(R.string.favorite_stations));
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                DataManager.getInstance().postEvent(new FragmentSelectedEvent(tab.getPosition()));
                int p = tab.getPosition();
                if (p == 0) {
                    setTitle(getString(R.string.favorite_stations));
                }
                else if (p == 1) {
                    setTitle(getString(R.string.tweets));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageDrawable(getResources().getDrawable(android.R.drawable.ic_menu_add));
    }

    private void setFloatingActionButtonForTweetTab() {
        fab.setVisibility(View.GONE);
    }

    private void setFloatingActionButtonForFavTab() {
        fab.setVisibility(View.VISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(StartActivity.this, StationPickerActivity.class);
                startActivity(i);
            }
        });
    }


    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Subscribe
    public void onFragmentSelected(FragmentSelectedEvent event){
        int p = event.position;
        if (p == 0) {
            setFloatingActionButtonForFavTab();
        }
        else if (p == 1) {
            setFloatingActionButtonForTweetTab();
        }
    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    FavoriteStationFragment tab1 = new FavoriteStationFragment();
                    return tab1;
                case 1:
                    TweetFragment tab2 = new TweetFragment();
                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mBus.unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBus.register(this);
    }
}
