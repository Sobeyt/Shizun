package com.sobeit.shizun.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.sobeit.shizun.R;
import com.sobeit.shizun.fragments.AnimeDetailFragment;
import com.sobeit.shizun.helpers.ActivityHelper;
import com.sobeit.shizun.helpers.FragmentHelper;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class AnimeDetailActivity extends AppCompatActivity{

    private AnimeDetailFragment recoverPasswordFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        recoverPasswordFragment = AnimeDetailFragment.newInstance();
        ActivityHelper.configDefaultActionBarBack(this);
        FragmentHelper.addFragment(this, recoverPasswordFragment, R.id.fl_new_launch);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
