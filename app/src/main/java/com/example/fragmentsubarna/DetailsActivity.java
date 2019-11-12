package com.example.fragmentsubarna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circImg;
    TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg= findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView1= findViewById(R.id.textView2);

    Bundle bundel = getIntent().getExtras();

        if(bundel !=null) {
            circImg.setImageResource(bundel.getInt("image"));
            textView.setText(bundel.getString("name"));
            textView1.setText(bundel.getString("phone"));
        }
    }
}
