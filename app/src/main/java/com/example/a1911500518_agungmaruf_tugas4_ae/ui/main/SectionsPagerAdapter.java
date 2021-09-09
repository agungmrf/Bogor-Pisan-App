package com.example.a1911500518_agungmaruf_tugas4_ae.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.a1911500518_agungmaruf_tugas4_ae.Festival;
import com.example.a1911500518_agungmaruf_tugas4_ae.Hotel;
import com.example.a1911500518_agungmaruf_tugas4_ae.Kuliner;
import com.example.a1911500518_agungmaruf_tugas4_ae.R;
import com.example.a1911500518_agungmaruf_tugas4_ae.Wisata;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.wisata, R.string.homestay, R.string.kuliner, R.string.festival};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Wisata();
                break;
            case 1:
                fragment = new Hotel();
                break;
            case 2:
                fragment = new Kuliner();
                break;
            case 3:
                fragment = new Festival();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}