package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //use action bar utilities
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle(" Gfg | ActionBar");

        actionBar.setSubtitle("This is an Action BAr");

        actionBar.setIcon(R.mipmap.ic_launcher);
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu ){
            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);

        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item){
            switch (item.getItemId()){
                case R.id.search:
                    showAlertDialog();
                    break;
                case R.id.refresh:
                    DialogFragment dialogFragment = new DialogFragment();
                    dialogFragment.show(getSupportFragmentManager(), "My Fragment");
                case R.id.copy:
                    Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
            return super.onOptionsItemSelected(item);

        }

    }
