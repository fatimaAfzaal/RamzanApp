package com.example.ramzanapp.ui.guide;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ramzanapp.R;
import com.example.ramzanapp.databinding.FragmentGuideBinding;
import com.example.ramzanapp.databinding.FragmentNamesOfAllahBinding;
import com.example.ramzanapp.ui.Names_of_Allah.Nmaes_of_AllahViewModel;

public class GuideFragment extends Fragment {

    private GuideViewModel mViewModel;

    public static GuideFragment newInstance() {
        return new GuideFragment();
    }

    private FragmentGuideBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Nmaes_of_AllahViewModel slideshowViewModel =
                new ViewModelProvider(this).get(Nmaes_of_AllahViewModel.class);

        binding = FragmentGuideBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}