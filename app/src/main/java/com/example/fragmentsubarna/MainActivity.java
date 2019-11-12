package com.example.fragmentsubarna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.example.fragmentsubarna.adapter.ViewPageAdapter;
import com.example.fragmentsubarna.fragments.LoginFragment;
import com.example.fragmentsubarna.fragments.SignUpFragemt;

public class MainActivity extends AppCompatActivity {
    private TabLayout tl;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl= findViewById(R.id.tabid);
        vp= findViewById(R.id.viewpager);
        ViewPageAdapter viewPageAdapter= new ViewPageAdapter(getSupportFragmentManager());
        ViewPageAdapter.addFragment(new LoginFragment(),"Login");
        ViewPageAdapter.addFragment(new SignUpFragemt(), "SignUP");

        vp.setAdapter(viewPageAdapter);
        tl.setupWithViewPager(vp);
    }
}
