package com.example.ramzanapp.ui.Names_of_Allah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ramzanapp.databinding.FragmentNamesOfAllahBinding;
import com.example.ramzanapp.databinding.FragmentNamesOfAllahBinding;

public class Names_of_AllahFragment extends Fragment {

    private FragmentNamesOfAllahBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Nmaes_of_AllahViewModel slideshowViewModel =
                new ViewModelProvider(this).get(Nmaes_of_AllahViewModel.class);

        binding = FragmentNamesOfAllahBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}