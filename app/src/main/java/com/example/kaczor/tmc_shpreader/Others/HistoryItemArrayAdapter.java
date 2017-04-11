package com.example.kaczor.tmc_shpreader.Others;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kaczor.tmc_shpreader.R;

import java.util.ArrayList;
import java.util.List;


public class HistoryItemArrayAdapter extends ArrayAdapter<HistoryItem> {
    private Context context;
    private List<HistoryItem> historyItems;

    public HistoryItemArrayAdapter(Context context, int resource, ArrayList<HistoryItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.historyItems = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        HistoryItem historyItem = historyItems.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.historyitem, null);

        TextView file = (TextView) view.findViewById(R.id.nazwa_pliku_value);
        TextView name = (TextView) view.findViewById(R.id.nazwa_value);
        TextView content = (TextView) view.findViewById(R.id.zawartosc_value);
        ImageView overview = (ImageView) view.findViewById(R.id.image);

        file.setText(historyItem.file);
        name.setText(historyItem.name);
        content.setText(historyItem.content);
        overview.setImageResource(R.mipmap.ic_launcher);

        return view;
    }
}
