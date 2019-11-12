package com.example.fragmentsubarna.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentsubarna.NavigationS;
import com.example.fragmentsubarna.R;
import com.example.fragmentsubarna.controller.Interface;
import com.example.fragmentsubarna.controller.InterfaceImplement;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment{
    EditText editText1, editText2;
    Button button;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);

        editText1 = view.findViewById(R.id.username);
        editText2= view.findViewById(R.id.password);
        button= view.findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=editText1.getText().toString();
                String password=editText2.getText().toString();

                Interface in=new InterfaceImplement();
                if (in.checkUser(username, password)) {
                    Toast.makeText(getContext(), "THE VALIDATION IS CORRECT"+username, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getContext(), NavigationS.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getContext(), "LOGIN FAILED/ CHECK THE DATA"+username+password, Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;

    }
}
