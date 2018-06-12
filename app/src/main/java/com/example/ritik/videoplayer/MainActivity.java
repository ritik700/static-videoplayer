package com.example.ritik.videoplayer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vv = findViewById(R.id.vir);
        vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hello);
       //Context context;
        MediaController mc = new MediaController(this);
       mc.setAnchorView(vv);
        vv.setMediaController(mc);
        vv.start();

    }
}
