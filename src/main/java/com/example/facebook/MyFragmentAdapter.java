package com.example.facebook;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("deprecation")
public class MyFragmentAdapter extends FragmentPagerAdapter {

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :return new FragmentOne().newInstance();
            case 1 :return new FragmentTwo().newInstance();
            case 2 :return new FragmentThree().newInstance();
            case 3 :return new FragmentFour().newInstance();


        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page"+(position+1);
    }
}
