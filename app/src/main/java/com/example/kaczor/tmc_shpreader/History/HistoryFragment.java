package com.example.kaczor.tmc_shpreader.History;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.kaczor.tmc_shpreader.Others.HistoryItem;
import com.example.kaczor.tmc_shpreader.Others.HistoryItemArrayAdapter;
import com.example.kaczor.tmc_shpreader.R;

import java.util.ArrayList;


public class HistoryFragment extends ListFragment {

    private ArrayList<HistoryItem> historyItems = new ArrayList<>();
    private ArrayAdapter<HistoryItem> adapter;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.historyfragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        historyItems.add(new HistoryItem("nazwa_pliku 1","root/plik","172 polyglons"));
        historyItems.add(new HistoryItem("nazwa_pliku 2","root/plik","154 polyglons"));
        adapter = new HistoryItemArrayAdapter(getActivity(), 0, historyItems);
        setListAdapter(adapter);
    }


}