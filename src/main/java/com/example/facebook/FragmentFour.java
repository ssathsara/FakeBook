package com.example.facebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentFour extends Fragment {

    public FragmentFour newInstance() {
        FragmentFour fragmentFour =new FragmentFour();
        return fragmentFour;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment4,container,false);
    }
}
