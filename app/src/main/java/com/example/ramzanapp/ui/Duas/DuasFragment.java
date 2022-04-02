package com.example.ramzanapp.ui.Duas;

import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramzanapp.MainActivity3;
import com.example.ramzanapp.R;
import com.example.ramzanapp.databinding.FragmentDuasBinding;
import com.example.ramzanapp.ui.Duas.DuasViewModel;

public class DuasFragment extends Fragment {
    Activity table;


    private DuasViewModel mViewModel;
    private FragmentDuasBinding binding;

    public static DuasFragment newInstance() {
        return new DuasFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DuasViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DuasViewModel.class);

        binding = FragmentDuasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        table=getActivity();
        return root;

    }

    public void onStart() {
        super.onStart();
        Button i = (Button) table.findViewById(R.id.button);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(table, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}