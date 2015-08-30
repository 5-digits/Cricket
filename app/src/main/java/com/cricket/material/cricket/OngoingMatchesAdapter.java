package com.cricket.material.cricket;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.cricket.material.cricket.cricketsummary.CricketSummary;
import com.cricket.material.cricket.cricketsummary.Series;

import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;

public class OngoingMatchesAdapter extends ArrayAdapter<OngoingMatchDetail> implements  retrofit.Callback<CricketSummary> {

    public OngoingMatchesAdapter(Context context) {
        super(context, 0);
    }
    private final String LOG_TAG = OngoingMatchesAdapter.class.getSimpleName();

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        OngoingMatchDetail match = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_ongoing_matches, parent, false);
        }

        TextView series = (TextView) convertView.findViewById(R.id.list_item_series);
        series.setText(match.series);

        return convertView;
    }


    @Override
    public void success(CricketSummary cricketSummary, Response response) {
        List<Series> series = cricketSummary.getQuery().getResults().getSeries();

        for (int i = 0; i < series.size(); i++) {
            Log.d(LOG_TAG, series.get(i).getSeriesName());
            OngoingMatchDetail seriesData = new OngoingMatchDetail(series.get(i).getSeriesName());
            add(seriesData);
        }

        Log.d(LOG_TAG, "success");
    }

    @Override
    public void failure(RetrofitError error) {

    }
}