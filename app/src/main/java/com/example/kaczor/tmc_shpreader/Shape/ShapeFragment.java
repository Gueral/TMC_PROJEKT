package com.example.kaczor.tmc_shpreader.Shape;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kaczor.tmc_shpreader.Others.FileChooser;
import com.example.kaczor.tmc_shpreader.R;

import java.io.File;


public class ShapeFragment extends Fragment{

    private View view;
    private FileChooser fileChooser;
    private Button load;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shapefragment, container, false);

        load = (Button) view.findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fileChooser = new FileChooser(getActivity());
                fileChooser.setFileListener(new FileChooser.FileSelectedListener() {
                    @Override
                    public void fileSelected(File file) {

                    }
                }).showDialog();
            }
        });



        return view;
    }
}
