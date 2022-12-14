package com.carmel.fellowship;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.LifecycleObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;

public class bible_videos1<SimpleBasePlayer> extends AppCompatActivity {
    SearchView searchView;

    ExoPlayer exoPlayer_view;
    SimpleBasePlayer simpleExoPlayer;
//    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible_videos1);


        searchView=findViewById(R.id.search_bar);
        exoPlayer_view =findViewById(R.id.exoplayer_video);
        getLifecycle().addObserver((LifecycleObserver) exoPlayer_view);





//        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
//        getLifecycle().addObserver(youTubePlayerView);
//
//
//        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
//            @Override
//            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
//
//
//                youTubePlayer.loadVideo("y7MW7d8fb1Y", 0);
//                youTubePlayer.loadVideo("y7MW7d8fb1Y", 0);
//                youTubePlayer.loadVideo("y7MW7d8fb1Y", 0);
//                youTubePlayer.loadVideo("y7MW7d8fb1Y", 0);
//                youTubePlayer.loadVideo("y7MW7d8fb1Y", 0);
//
//            }
//        });

    }
}