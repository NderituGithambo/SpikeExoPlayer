package com.mwaistudios.spikeexoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;


import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;


public class MainActivity extends AppCompatActivity {


    // creating a variable for exoplayer
    SimpleExoPlayer exoPlayer;
    PlayerView playerView;

    // url of video which we are loading.
   String videoUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20201217163353/Screenrecorder-2020-12-17-16-32-03-350.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get view from Resources
        playerView = findViewById(R.id.idExoPlayerVIew);

        MediaItem mediaItem = MediaItem.fromUri(videoUrl);
        exoPlayer = new SimpleExoPlayer.Builder(getApplicationContext()).build();
        playerView.setPlayer(exoPlayer);


        exoPlayer.setMediaItem(mediaItem);
        exoPlayer.prepare();

        exoPlayer.setPlayWhenReady(true);


    }
}