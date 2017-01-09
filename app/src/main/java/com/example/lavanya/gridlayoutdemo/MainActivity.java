package com.example.lavanya.gridlayoutdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttontapped(View view){
        int id=view.getId(); //gives long number for each button
        String ourid="";
        ourid=getResources().getResourceEntryName(id);
        Log.i("tapped button name", ourid);
        int resourceid=getResources().getIdentifier(ourid,"raw","com.example.lavanya.gridlayoutdemo");
        MediaPlayer mediaPlayer=MediaPlayer.create(this, resourceid);
        mediaPlayer.start();
    }
}
