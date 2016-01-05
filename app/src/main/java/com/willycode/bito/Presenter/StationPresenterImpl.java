package com.willycode.bito.Presenter;

import android.content.Context;

import com.willycode.bito.Model.Station;
import com.willycode.bito.Utils.OnFinshListener;
import com.willycode.bito.View.StationListView;

import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public class StationPresenterImpl implements StationPresenter,OnFinshListener {
    @Override
    public void onResume() {
        stationListView.showProgress();
        stationListInteractor.loadStaions(this,context);
    }
    private StationListView stationListView;
    private StationListInteractor stationListInteractor;
    private Context context;

    public StationPresenterImpl(StationListView stationListView,Context c) {
        this.stationListView = stationListView;
        stationListInteractor = new StationListInteractorImpl();
        this.context = c;
    }

    @Override
    public void onFinished(List<Station> stations) {
        stationListView.setStations(stations);
        stationListView.hideProgress();
    }

    @Override
    public void onError(Exception error) {
        stationListView.hideProgress();
        stationListView.showMessage(error.getMessage());
    }

}
