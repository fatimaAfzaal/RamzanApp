package com.example.ramzanapp.ui.prayer_times;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramzanapp.R;

public class prayer_timesFragment extends Fragment {

    private PrayerTimesViewModel mViewModel;

    public static prayer_timesFragment newInstance() {
        return new prayer_timesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_prayer_times, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PrayerTimesViewModel.class);
        // TODO: Use the ViewModel
    }

}