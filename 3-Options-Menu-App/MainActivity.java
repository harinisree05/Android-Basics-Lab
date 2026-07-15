package com.example.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home) {

            Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
        }

        else if (id == R.id.profile) {

            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
        }

        else if (id == R.id.logout) {

            Toast.makeText(this, "Logout Clicked", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}
