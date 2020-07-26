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

public class StudioOwnerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;

    private Button task, spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studio_owner);


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
            case R.id.oabout:

                break;
            case R.id.oincomming:

                break;
            case R.id.orunning:

                break;

            case R.id.oready:

                break;

            case R.id.odelivered:

                break;

            case R.id.ocancel:
                break;
            case R.id.osettings:
                break;
            case R.id.ohelp:
                break;
            case R.id.ofeedback:
                break;
        }
        this.mNavDrawer.closeDrawer((int) GravityCompat.START);
        return true;
    }
}
