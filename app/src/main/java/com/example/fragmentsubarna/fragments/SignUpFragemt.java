package com.example.fragmentsubarna.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentsubarna.R;
import com.example.fragmentsubarna.controller.Interface;
import com.example.fragmentsubarna.controller.InterfaceImplement;
import com.example.fragmentsubarna.model.DataStore;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragemt extends Fragment {
    EditText ed1, ed2, ed3;
    Button btn;


    public SignUpFragemt() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_fragemt, container, false);
        ed1 = view.findViewById(R.id.user);
        ed2 = view.findViewById(R.id.pass);
        ed3 = view.findViewById(R.id.repass);
        btn = view.findViewById(R.id.signup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username, password, repassword;
                username = ed1.getText().toString();
                password = ed2.getText().toString();
                repassword = ed3.getText().toString();
                DataStore dataStore = new DataStore();
                dataStore.DataStore(username, password, repassword);

                Interface in = new InterfaceImplement();
                if (in.addUser(dataStore)) {
                    Toast.makeText(getContext(), "  SWIPE RIGHT TO LOGIN "+ dataStore.getName(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "CHECK USER INPUT", Toast.LENGTH_SHORT).show();
                }
            }


        });

        return view;
    }
}




