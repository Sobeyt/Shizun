package com.sobeit.shizun.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sobeit.shizun.R;
import com.sobeit.shizun.helpers.ActivityHelper;

import butterknife.ButterKnife;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class AnimeDetailFragment extends Fragment {

    public View view;

    public static AnimeDetailFragment newInstance(){
        return new AnimeDetailFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_anime_detail, container, false);
        ButterKnife.bind(this, view);
        ActivityHelper.changeTitleActivity(getActivity(), getString(R.string.app_name));
        return view;
    }
}
