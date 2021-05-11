package com.example.alber.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alber on 25/07/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mcontext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new LeisureFragment();
        } else {
            return new ProvinceFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.category_monuments);
        } else if (position == 1) {
            return mcontext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mcontext.getString(R.string.category_leisure);
        } else {
            return mcontext.getString(R.string.category_province);
        }
    }
}
