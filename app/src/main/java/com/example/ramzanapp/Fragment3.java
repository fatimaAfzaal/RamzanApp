package com.example.ramzanapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    TextView b,b1;
    ImageView i;
    int index=0;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1_layout, container, false);

        int[] Dua={R.drawable.firsts,R.drawable.twos,R.drawable.threes,R.drawable.fourths};

        b=view.findViewById(R.id.button5);
        b1=view.findViewById(R.id.button4);
        i=view.findViewById(R.id.imageView3);
        i.setImageResource(Dua[0]);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < 3) {
                    index++;
                    i.setImageResource(Dua[index]);
                }
                else{
                    Toast.makeText(getActivity(), "No next translation", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index > 0) {
                    index--;
                    i.setImageResource(Dua[index]);
                }
                else{
                    Toast.makeText(getActivity(), "No previous translation", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;


    }
}