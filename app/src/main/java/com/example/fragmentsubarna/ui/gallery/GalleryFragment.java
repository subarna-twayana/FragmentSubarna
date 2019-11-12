package com.example.fragmentsubarna.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fragmentsubarna.R;

public class GalleryFragment extends Fragment implements View.OnClickListener {
    EditText et;
    Button bt;


    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);
        et=view.findViewById(R.id.etRadius);
        bt= view.findViewById(R.id.btnArea);

        bt.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(et.getText().toString());
        float area =3.14f * radius *radius;

        Toast.makeText(getContext(), "area of circle :" + area, Toast.LENGTH_SHORT).show();

    }
}
