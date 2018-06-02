package com.sobeit.shizun.helpers;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class DialogHelper {

    public static void showDialog(Fragment fragment, DialogFragment dialogFragment) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        dialogFragment.show(fragmentManager,"DialogHelper");
    }
    public static void showDialog(Activity activity, DialogFragment dialogFragment) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        dialogFragment.show(fragmentManager,"DialogHelper");
    }

}
