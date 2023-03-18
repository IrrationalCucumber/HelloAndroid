package com.example.helloandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivityFragment extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = (Button) findViewById(R.id.FirstFragment);
        secondFragment = (Button) findViewById(R.id.SecondFragment);

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });
        }
        private void loadFragment( Fragment fragment ){
            //FragmentManager fm = new getFragmentManager();
            //FragmentTransaction fragmentTransaction = fm.beginTransaction();
            //fragmentTransaction.replace(R.id.frameLayout, fragment);
            //fragmentTransaction.commit();


    }
}