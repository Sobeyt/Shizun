package com.sobeit.shizun.helpers;

import android.view.View;
import android.widget.Button;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class DisplayLoaders {

    public static void requestStateUIElements(View view) {
        SbLoader.getInstance().showActivityIndicator(view.getContext());
    }

    // Detiene el loader
    public static void responseStateUIElements() {
        SbLoader.getInstance().hideActivityIndicator();
    }

    public static void requestStateUIElements(View view, Button btn) {
        btn.setEnabled(false);
//        SbLoader.getInstance().showActivityIndicator(view.getContext());
    }

    // Detiene el loader
    public static void responseStateUIElements(Button btn) {
        btn.setEnabled(true);
        SbLoader.getInstance().hideActivityIndicator();
    }

}
