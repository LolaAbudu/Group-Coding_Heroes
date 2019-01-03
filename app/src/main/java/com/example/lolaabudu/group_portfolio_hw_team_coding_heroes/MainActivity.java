package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;
import android.content.BroadcastReceiver;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;

    Button notificationButton;
    private NotificationManager mNotifyManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationButton = findViewById(R.id.button_create_notification);
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotification();
            }
        });

        mDrawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()){

                            case R.id.nav_fribel:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent fribel = new Intent(MainActivity.this, Fribelsprofile.class);
                                startActivity(fribel);
                                return true;
                            case R.id.nav_lola:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent lola = new Intent(MainActivity.this, LolaProfileActivity.class);
                                startActivity(lola);
                                return true;
                            case R.id.nav_sheriff:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent sheriff = new Intent(MainActivity.this, SheriffProfileActivity.class);
                                startActivity(sheriff);
                                return true;
                            case R.id.nav_naomy:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                startNaomyActivity();
                                return true;
                        }
                        return false;
                    }
                });


    }

    //3 parts to building a notification
    private void sendNotification(){
        NotificationCompat.Builder builder= new NotificationCompat.Builder(MainActivity.this)
                .setContentTitle("Coding Heroes notification!")
                .setContentText("Remember to view Lola's profile page.")
                .setSmallIcon(R.drawable.ic_android);

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this,
                0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        mNotifyManager = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);
        mNotifyManager.notify(0,builder.build());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startNaomyActivity(){
        Intent naomyActivity = new Intent(MainActivity.this, NaomyProfileActivity.class);
        startActivity(naomyActivity);
    }
}



