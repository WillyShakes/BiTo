package com.willycode.bito.Presenter.StationPicker;

import android.content.Context;

import com.willycode.bito.Model.Station;
import com.willycode.bito.Utils.OnFinshListener;
import com.willycode.bito.View.FavoriteStation.StationListView;
import com.willycode.bito.View.StationPicker.StationPickerListView;

import org.json.JSONException;

import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public class StationPickerPresenterImpl implements StationPickerPresenter,OnFinshListener {
    @Override
    public void onResume() throws JSONException {
        if(stationListView != null)
            stationListView.showProgress();
        stationPickerListInteractor.loadStations(this, context);
    }

    @Override
    public void onItemCliked(Station station) {
        stationPickerListInteractor.saveStation(station,context);
    }

    @Override
    public void onDestroy() {
        this.stationListView = null;
    }

    private StationPickerListView stationListView;
    private StationPickerListInteractor stationPickerListInteractor;
    private Context context;

    public StationPickerPresenterImpl(StationPickerListView stationListView, Context c) {
        this.stationListView = stationListView;
        stationPickerListInteractor = new StationPickerListInteractorImpl();
        this.context = c;
    }

    @Override
    public void onFinished(List<Station> stations) {
        if(stationListView != null) {
            stationListView.setStations(stations);
            stationListView.hideProgress();
        }
    }

    @Override
    public void onError(Exception error) {
        if (stationListView != null) {
            stationListView.hideProgress();
            stationListView.showMessage(error.getMessage());
        }
    }
}
