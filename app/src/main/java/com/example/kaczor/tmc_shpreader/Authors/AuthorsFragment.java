package com.example.kaczor.tmc_shpreader.Authors;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kaczor.tmc_shpreader.R;


public class AuthorsFragment extends Fragment {
    private View view;
    private ImageView szymek;
    private ImageView mateusz;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.authorsfragment, container, false);
        szymek = (ImageView) view.findViewById(R.id.image);
        mateusz = (ImageView) view.findViewById(R.id.image2);

        szymek.setImageResource(R.mipmap.ic_launcher);
        mateusz.setImageResource(R.mipmap.ic_launcher);

        return view;
    }
}
