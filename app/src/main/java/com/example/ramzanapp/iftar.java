package com.example.ramzanapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class iftar extends Fragment {

        View v;
        ArrayList<ContactModel> arrContacts=new ArrayList<>();
        private RecyclerView myrecyclerview;
        public iftar(){
        }
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            v = inflater.inflate(R.layout.fragment_iftar, container, false);
            myrecyclerview=(RecyclerView) v.findViewById(R.id.recyclerContact);
            RecyclerContactAdapter recyclerContactAdapter=new RecyclerContactAdapter(getContext(),arrContacts);
            myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
            myrecyclerview.setAdapter(recyclerContactAdapter);
            return v;
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            arrContacts=new ArrayList<>();
            arrContacts.add(new ContactModel("April 2,2022","Ramadan 1 1443 AH","4:32","18:32"));
            arrContacts.add(new ContactModel("April 3,2022","Ramadan 2 1443 AH","4:31","18:32"));
            arrContacts.add(new ContactModel("April 4,2022","Ramadan 3 1443 AH","4:29","18:33"));
            arrContacts.add(new ContactModel("April 5,2022","Ramadan 4 1443 AH","4:28","18:34"));
            arrContacts.add(new ContactModel("April 6,2022","Ramadan 5 1443 AH","4:26","18:35"));
            arrContacts.add(new ContactModel("April 7,2022","Ramadan 6 1443 AH","4:25","18:35"));
            arrContacts.add(new ContactModel("April 8,2022","Ramadan 7 1443 AH","4:23","18:36"));
            arrContacts.add(new ContactModel("April 9,2022","Ramadan 8 1443 AH","4:22","18:37"));
            arrContacts.add(new ContactModel("April 10,2022","Ramadan 9 1443 AH","4:20","18:38"));
            arrContacts.add(new ContactModel("April 11,2022","Ramadan 10 1443 AH","4:19","18:38"));
            arrContacts.add(new ContactModel("April 12,2022","Ramadan 11 1443 AH","4:17","18:39"));
            arrContacts.add(new ContactModel("April 13,2022","Ramadan 12 1443 AH","4:16","18:40"));
            arrContacts.add(new ContactModel("April 14,2022","Ramadan 13 1443 AH","4:15","18:41"));
            arrContacts.add(new ContactModel("April 15,2022","Ramadan 14 1443 AH","4:13","18:41"));
            arrContacts.add(new ContactModel("April 16,2022","Ramadan 15 1443 AH","4:12","18:42"));
            arrContacts.add(new ContactModel("April 17,2022","Ramadan 16 1443 AH","4:10","18:43"));
            arrContacts.add(new ContactModel("April 18,2022","Ramadan 17 1443 AH","4:09","18:44"));
            arrContacts.add(new ContactModel("April 19,2022","Ramadan 18 1443 AH","4:07","18:44"));
            arrContacts.add(new ContactModel("April 20,2022","Ramadan 19 1443 AH","4:06","18:45"));
            arrContacts.add(new ContactModel("April 21,2022","Ramadan 20 1443 AH","4:04","18:46"));
            arrContacts.add(new ContactModel("April 22,2022","Ramadan 21 1443 AH","4:03","18:47"));
            arrContacts.add(new ContactModel("April 23,2022","Ramadan 22 1443 AH","4:01","18:48"));
            arrContacts.add(new ContactModel("April 24,2022","Ramadan 23 1443 AH","4:00","18:48"));
            arrContacts.add(new ContactModel("April 25,2022","Ramadan 24 1443 AH","3:59","18:49"));
            arrContacts.add(new ContactModel("April 26,2022","Ramadan 25 1443 AH","3:57","18:50"));
            arrContacts.add(new ContactModel("April 27,2022","Ramadan 26 1443 AH","3:56","18:51"));
            arrContacts.add(new ContactModel("April 28,2022","Ramadan 27 1443 AH","3:54","18:51"));
            arrContacts.add(new ContactModel("April 29,2022","Ramadan 28 1443 AH","3:53","18:52"));
            arrContacts.add(new ContactModel("April 30,2022","Ramadan 29 1443 AH","3:52","18:53"));
            arrContacts.add(new ContactModel("March 1,2022","Ramadan 30 1443 AH","3:50","18:54"));
            arrContacts.add(new ContactModel("March 2,2022","Ramadan 31 1443 AH","3:49","18:54"));



        }
    }