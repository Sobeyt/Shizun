package com.sobeit.shizun.helpers;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class FragmentHelper {

    public static void addFragment(Activity activity, Fragment fragment, int frameLayoutId) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameLayoutId, fragment);
        transaction.commit();
    }

    public static void replaceFragment(Activity activity, Fragment fragment, int frameLayoutId) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameLayoutId, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
