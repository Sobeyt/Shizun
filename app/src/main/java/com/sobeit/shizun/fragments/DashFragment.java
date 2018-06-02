package com.sobeit.shizun.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sobeit.shizun.activities.DashboardActivity;
import com.sobeit.shizun.R;
import com.sobeit.shizun.helpers.ActivityHelper;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class DashFragment extends Fragment {

    private View view = null;
    public DashboardActivity mainActivity;

    public static DashFragment newInstance(DashboardActivity mainActivity, Boolean mainTaxes) {
        DashFragment fragment = new DashFragment();
        fragment.mainActivity = mainActivity;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_dashboard, container, false);
        ButterKnife.bind(this, view);
        ActivityHelper.changeTitleActivity(getActivity(), getString(R.string.app_name));
        return view;
    }
}
