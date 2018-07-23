package com.example.bharatmk257.guide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context fragmentContext;
    int totalTabs;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fragmentManager,int totalTab){
        super(fragmentManager);
        fragmentContext = context;
        this.totalTabs = totalTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                KakariyaFragment kakariyaFragment =new KakariyaFragment();
                return kakariyaFragment;

            case 1:
                ReadingLibraryFragment readingLibraryFragment = new ReadingLibraryFragment();
                return readingLibraryFragment;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
