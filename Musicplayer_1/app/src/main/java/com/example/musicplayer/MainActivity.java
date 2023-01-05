package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vdView = findViewById(R.id.videoView);

        String vpath = "android.resource://"+getPackageName()+"/raw/video";

        Uri vduri = Uri.parse((vpath));

        vdView.setVideoURI(vduri);
        vdView.start();

        //but we need a media controller to manipulate the video,
        // so we use the MediaController which is inbuilt in VideoView
        MediaController mdcntrler = new MediaController(this);     //created a new MediaController
        vdView.setMediaController(mdcntrler);      //set the MediaController to vdview
        mdcntrler.setAnchorView(vdView);       //this create an anchor for MediaController to show anchors in vdview
    }
}