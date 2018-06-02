package com.sobeit.shizun.helpers;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class ActivityHelper {

    public static void changeTitleActivity(Activity activity, String title){
        if(activity != null && activity instanceof AppCompatActivity && ((AppCompatActivity) activity).getSupportActionBar()!=null){
            ((AppCompatActivity) activity).getSupportActionBar().setTitle(title);
        }

    }

    public static void launchNewActivity(Activity activityBase, Class<?> classNameActivity, boolean finishOldActivity) {
        Intent intent = new Intent().setClass(activityBase.getBaseContext(), classNameActivity);
        activityBase.startActivity(intent);
        if (finishOldActivity)
            activityBase.finish();
    }

    public static void configDefaultActionBar(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getSupportActionBar() != null) {
            appCompatActivity.getSupportActionBar().setElevation(0);
        }
    }

    public static void configDefaultActionBarBack(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getSupportActionBar() != null) {
            appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            appCompatActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
            appCompatActivity.getSupportActionBar().setElevation(0);

        }
    }
}
