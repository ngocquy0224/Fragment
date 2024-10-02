package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.myapplication.fragment.ContactFragment;
import com.example.myapplication.fragment.HomeFragment;

public class Bai1Activity extends AppCompatActivity {
    FrameLayout frameLayout;
    Button btnHome, btnContact;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);

        frameLayout = findViewById(R.id.frContent);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);

        fragmentManager = getSupportFragmentManager();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Load HomeFragment when btnHome is clicked
                HomeFragment homeFragment = new HomeFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.frContent, homeFragment)
                        .commit();
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Load ContactFragment when btnContact is clicked
                ContactFragment contactFragment = new ContactFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.frContent, contactFragment)
                        .commit();
            }
        });
    }
}
