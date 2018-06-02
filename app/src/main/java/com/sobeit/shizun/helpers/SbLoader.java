package com.sobeit.shizun.helpers;

import android.content.Context;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class SbLoader {
    private static SbLoader instance = null;
    private KProgressHUD hud;
    private SbLoader() {}

    public static SbLoader getInstance() {
        if (instance == null) {
            synchronized (SbLoader.class) {
                if (instance == null) {
                    instance = new SbLoader();
                }
            }
        }
        return instance;
    }

    public void showActivityIndicator(Context context){
        hud = KProgressHUD.create(context)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();
    }
    public void hideActivityIndicator(){
        hud.dismiss();
    }
}
