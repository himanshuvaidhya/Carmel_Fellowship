package com.carmel.fellowship;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.carmel.fellowship.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActivityMainBinding binding;
    ScrollView scrollView;
    Menu menu;

    CardView carmel_songs;
    CardView bible_videos;
    CardView audio_bible;
    CardView daily_verse;
    CardView video_messages;
    CardView meeting;
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.side_nav);
        imageButton = findViewById(R.id.image_button);
        menu = navigationView.getMenu();
        navigationView.getHeaderView(0);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navgation_open, R.string.navgation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        binding.sideNav.setNavigationItemSelectedListener(item -> {
//            switch (item.getItemId()){
//                case R.id.bible_videos:
//                    Intent b = new Intent(this, video_messages1.class);
//                    startActivity(b);
//                    break;
//                case R.id.audio_bible:
//                    Intent a = new Intent(this, daily_verse1.class);
//                    startActivity(a);
//                    break;
//                case R.id.carmel_songs:
//                    Intent c = new Intent(this, meeting1.class);
//                    startActivity(c);
//                    break;
//
//            }
//            return true;
//        });
        binding.bottomNav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.video_messages:
                    Intent v = new Intent(this, video_messages1.class);
                    startActivity(v);
                    break;
                case R.id.daily_verse:
                    Intent d = new Intent(this, daily_verse1.class);
                    startActivity(d);
                    break;
                case R.id.meeting:
                    Intent m = new Intent(this, meeting1.class);
                    startActivity(m);
                    break;

            }
            return true;
        });


        carmel_songs = findViewById(R.id.carmel_songs);
        bible_videos = findViewById(R.id.bible_videos);
        audio_bible = findViewById(R.id.audio_bible);
        daily_verse = findViewById(R.id.daily_verse);
        video_messages = findViewById(R.id.video_messages);
        meeting = findViewById(R.id.meeting);

//        carmel_songs.setOnClickListener(this);
//        bible_videos.setOnClickListener(this);
//        audio_bible.setOnClickListener(this);
//        daily_verse.setOnClickListener(this);
//        video_messages.setOnClickListener(this);
//        meeting.setOnClickListener(this);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.carmel_songs:
                i = new Intent(this, carmel_songs1.class);
                startActivity(i);
                break;
            case R.id.bible_videos:
                i = new Intent(this, bible_videos1.class);
                startActivity(i);
                break;
            case R.id.audio_bible:
                i = new Intent(this, audio_bible1.class);
                startActivity(i);
                break;
            case R.id.daily_verse:
                i = new Intent(this, daily_verse1.class);
                startActivity(i);
                break;
            case R.id.video_messages:
                i = new Intent(this, video_messages1.class);
                startActivity(i);
                break;
            case R.id.meeting:
                i = new Intent(this, meeting1.class);
                startActivity(i);
                break;

        }
        return false;
    }

}

