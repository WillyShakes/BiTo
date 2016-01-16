package com.willycode.bito.UI.FavoriteStation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.willycode.bito.Data.BusProvider;
import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Data.SyncService;
import com.willycode.bito.R;
import com.willycode.bito.UI.Adapters.StationAdapter;
import com.willycode.bito.Utils.Events.GetListStationEvent;
import com.willycode.bito.Utils.Events.SyncFinishedEvent;

import java.util.List;

/**
 * Created by Manuel ELO'O on 11/01/2016.
 */
public class FavoriteStationFragment  extends Fragment implements StationListView {
    private RecyclerView mRecyclerView;
    private StationAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar progressBar;
    private StationPresenter presenter;
    private List<Station> mStations;
    private SwipeRefreshLayout swipeContainer;
    private Bus mBus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            Activity a = getActivity();
            View v = inflater.inflate(R.layout.content_main, container, false);
            mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(a);
            mRecyclerView.setLayoutManager(mLayoutManager);

            swipeContainer = (SwipeRefreshLayout) v.findViewById(R.id.swipeRefreshLayout);
            // Setup refresh listener which triggers new data loading
            swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    // Your code to refresh the list here.
                    // Make sure you call swipeContainer.setRefreshing(false)
                    // once the network request has completed successfully.
                    syncFavoriteStations();
                }
            });

            // Configure the refreshing colors
            swipeContainer.setColorSchemeResources(R.color.accent, R.color.primary,
                    R.color.primary_dark,
                    R.color.primary_light);
            return v;
        }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mBus = BusProvider.getInstance();
        presenter = new StationPresenterImpl(this, context);
    }

    @Override
    public void onResume() {
        super.onResume();
        mBus.register(this);
        presenter.onResume();
        swipeContainer.setRefreshing(true);
        syncFavoriteStations();
    }

    private void syncFavoriteStations() {
        getActivity().startService(new Intent(getActivity(), SyncService.class));
    }

    @Subscribe
    public void onGetListStationEvent(GetListStationEvent event) {
        setStations(event.stations);
    }

    @Subscribe
    public void onSyncFinishedEvent(SyncFinishedEvent event) {
        swipeContainer.setRefreshing(false);
    }

    @Override
    public void setStations(List<Station> stations) {
        mStations = stations;
        mAdapter = new StationAdapter(stations, getContext());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void showProgress() {
        swipeContainer.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        swipeContainer.setRefreshing(false);
    }

    @Override
    public void onPause() {
        super.onPause();
        mBus.unregister(this);
    }

    @Override
    public void showMessage(String msg) {
        ViewGroup container = (ViewGroup) swipeContainer;
        Snackbar.make(container, msg, Snackbar.LENGTH_LONG).show();
    }
}
