package com.makoele.naturalbeautyremediesforafricanskin;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private Context context;
    private int numOfTabs;

    public PageAdapter(Context context, FragmentManager fm, int numOfTabs){
        super(fm);
        context = context;
        this.numOfTabs = numOfTabs;
    }

    //Fragment tabs
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                FaceFragment faceFragment = new FaceFragment();
                return faceFragment;
            case 1:
                HairFragment hairFragment = new HairFragment();
                return hairFragment;
            case 2:
                BodyFragment bodyFragment = new BodyFragment();
                return bodyFragment;
            case 3:
                HealthFragment healthFragment = new HealthFragment();
                return healthFragment;
            default:
                return null;
        }

    }

    //counts total number of tabs
    @Override
    public int getCount() {
        return numOfTabs;
    }
}
