package com.example.fragmentsubarna.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsubarna.R;
import com.example.fragmentsubarna.adapter.ContactsAdapter;
import com.example.fragmentsubarna.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class SlideshowFragment extends Fragment {

    private RecyclerView recyclerView;

    public SlideshowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        // Adding all the contacts object in list
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugat Malla" ,"9801323567",R.drawable.saugat));
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugatm Malla" ,"9801323567",R.drawable.saugat));
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugat Malla" ,"9801323567",R.drawable.saugat));

        ContactsAdapter contactsAdapter = new ContactsAdapter(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }

}