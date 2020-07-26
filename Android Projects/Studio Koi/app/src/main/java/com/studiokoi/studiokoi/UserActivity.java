package com.studiokoi.studiokoi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class UserActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;

    private Button task,spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mNavDrawer = findViewById(R.id.drawer_layout);
        final NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mNavDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mNavDrawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);


    }
    public void onBackPressed() {
        if (this.mNavDrawer.isDrawerOpen((int) GravityCompat.START)) {
            this.mNavDrawer.closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
//            Exit();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.usearch:
                break;
            case R.id.uprofile:
//                Exit();
                break;
            case R.id.usettings:

                break;
            case R.id.uhelp:
                break;

            case R.id.ufeedback:
                break;

        }
        this.mNavDrawer.closeDrawer((int) GravityCompat.START);
        return true;
    }
}
