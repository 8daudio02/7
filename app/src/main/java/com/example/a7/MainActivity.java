package com.example.a7;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            if(item.getItemId()==R.id.action_java1) {
                Toast.makeText(this, "Php Page", Toast.LENGTH_SHORT).show();
            }
            if(item.getItemId()==R.id.action_cpp) {
                Toast.makeText(this, "Java Page", Toast.LENGTH_SHORT).show();
            }
            if(item.getItemId()==R.id.action_csharp) {
                Toast.makeText(this, "C# Page", Toast.LENGTH_SHORT).show();
            }
            return super.onOptionsItemSelected(item);
        }
    }