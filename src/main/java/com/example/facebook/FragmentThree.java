package com.example.facebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentThree extends Fragment {

    public  FragmentThree newInstance() {
        FragmentThree fragmentThree =new FragmentThree();
        return fragmentThree;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3,container,false);
    }
}
