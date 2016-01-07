package com.willycode.bito.View.FavoriteStation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.willycode.bito.Adapters.StationAdapter;
import com.willycode.bito.Model.Station;
import com.willycode.bito.Presenter.FavoriteStation.StationPresenter;
import com.willycode.bito.Presenter.FavoriteStation.StationPresenterImpl;
import com.willycode.bito.R;
import com.willycode.bito.View.StationPicker.StationPickerActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements StationListView {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar progressBar;
    private StationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new StationPresenterImpl(this,this);


        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, StationPickerActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setStations(List<Station> stations) {
        mAdapter = new StationAdapter(stations);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void showMessage(String msg) {
        ViewGroup container = (ViewGroup) findViewById(R.id.layout);
        Snackbar.make(container, msg, Snackbar.LENGTH_SHORT).show();
    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        mRecyclerView.setVisibility(View.INVISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        mRecyclerView.setVisibility(View.VISIBLE);
    }
}
