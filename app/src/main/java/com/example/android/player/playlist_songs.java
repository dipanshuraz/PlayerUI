package com.example.android.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class playlist_songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_songs);

        ImageView player = findViewById(R.id.playerui);

        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(playlist_songs.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });


        int[] albumImages = new int[]{
                R.drawable.dekte,
                R.drawable.dhadak,
                R.drawable.ed,
                R.drawable.gold,
                R.drawable.heartless,
                R.drawable.high,
                R.drawable.taylor,
                R.drawable.ma1000x1000,
                R.drawable.mf1000x1000,
                R.drawable.mc1000x1000,
        };
        // Create a list of songs
        ArrayList<Song> playlistSongs = new ArrayList<>();
        playlistSongs.add(new Song("Atif Aslam", "batti gul meter chalu", albumImages[0], "Dekhte dekhte", 2.39));
        playlistSongs.add(new Song("Ajay gogawale", "Dhadak", albumImages[1], "Title", 3.39));
        playlistSongs.add(new Song("Ed sheeran", "Shape of You", albumImages[2], "Title", 4.02));
        playlistSongs.add(new Song("Arko", "Gold", albumImages[3], "naino ne baandhi", 2.10));
        playlistSongs.add(new Song("Badshah", "O.N.E.", albumImages[4], "Heartless", 6.30));
        playlistSongs.add(new Song("Guru Randhawa", "High Rated ", albumImages[5], "Title", 5.39));
        playlistSongs.add(new Song("Taylor Swift", "Delicate", albumImages[6], "Delicate", 3.10));
        playlistSongs.add(new Song("Linkin Park", "Hybrid Theory", albumImages[7], "One Step Closer", 2.37));
        playlistSongs.add(new Song("David Guetta", "The World Is Mine", albumImages[8], "The World Is Mine", 3.40));
        playlistSongs.add(new Song("Justin Bieber", "Purpose Deluxe", albumImages[9], "Company", 3.28));

        SongAdapter adapter = new SongAdapter(this, playlistSongs);
        GridView listView = findViewById(R.id.gridview);
        listView.setAdapter(adapter);




}
}
