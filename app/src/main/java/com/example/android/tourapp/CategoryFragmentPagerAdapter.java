package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Stuart on 02/09/2017.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //gets item from position on screen which puts the category on screen
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new LandmarksFragment();
        }else if (position == 1) {
            return new MuseumsFragment();
        }else if (position == 2){
            return new EatingFragment();
        }else if (position == 3){
            return new ParksFragment();
        }else {
            return new StadiumTheatresFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_landmarks);
        }else if (position == 1){
            return mContext.getString(R.string.category_museums);
        }else if (position == 2){
            return mContext.getString(R.string.category_eating);
        }else if (position == 3){
            return mContext.getString(R.string.category_parks);
        }
        else {
            return mContext.getString(R.string.category_stadiumtheatres);
        }
    }
}
