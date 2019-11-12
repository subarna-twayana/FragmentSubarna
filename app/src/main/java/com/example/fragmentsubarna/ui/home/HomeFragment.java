package com.example.fragmentsubarna.ui.home;

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

public class HomeFragment extends Fragment implements View.OnClickListener {
    EditText editText,editText1;
    Button btn;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        editText=view.findViewById(R.id.etFirst);
        editText1=view.findViewById(R.id.etSecond);
        btn=view.findViewById(R.id.btncalculate);

        btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int first =Integer.parseInt(editText.getText().toString());
        int second =Integer.parseInt(editText1.getText().toString());
        int result =first + second;

        Toast.makeText(getContext(), "sum is :" + result, Toast.LENGTH_SHORT).show();

    }
}
