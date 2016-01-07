package com.willycode.bito.View.StationPicker;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.willycode.bito.Adapters.StationAdapter;
import com.willycode.bito.Model.Station;
import com.willycode.bito.Presenter.FavoriteStation.StationPresenter;
import com.willycode.bito.Presenter.FavoriteStation.StationPresenterImpl;
import com.willycode.bito.Presenter.StationPicker.StationPickerPresenter;
import com.willycode.bito.Presenter.StationPicker.StationPickerPresenterImpl;
import com.willycode.bito.R;
import com.willycode.bito.Utils.ItemClickSupport;
import com.willycode.bito.View.FavoriteStation.StationListView;

import org.json.JSONException;

import java.util.List;

/**
 * Created by Manuel ELO'O on 07/01/2016.
 */
public class StationPickerActivity extends AppCompatActivity implements StationPickerListView {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar progressBar;
    private StationPickerPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new StationPickerPresenterImpl(this, this);
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
        try {
            presenter.onResume();
        } catch (JSONException e) {
            Log.e("StationPicker",e.toString(),e);
            showMessage(e.toString());
        }
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
    public void setStations(final List<Station> stations) {
        mAdapter = new StationAdapter(stations);
        mRecyclerView.setAdapter(mAdapter);
        ItemClickSupport.addTo(mRecyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                presenter.onItemCliked(stations.get(position));
                finish();
            }
        });
    }

    @Override
    public void showMessage(String msg) {
        ViewGroup container = (ViewGroup) findViewById(R.id.layout);
        Snackbar.make(container, msg, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        mRecyclerView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
