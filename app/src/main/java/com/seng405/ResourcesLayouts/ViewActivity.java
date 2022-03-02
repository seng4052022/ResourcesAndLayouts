package com.seng405.ResourcesLayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        ImageView myImageView = findViewById(R.id.first_image);

        myImageView.setImageResource(R.drawable.ic_android_black_24dp);

    }
}