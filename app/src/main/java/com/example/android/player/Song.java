package com.example.android.player;


import java.text.DecimalFormat;

public class Song {

    private String mArtist;
    private String mAlbumTitle;
    private int mAlbumImage;
    private String mSong;
    private double mSongLength;
    
    public Song(String vArtist, String vAlbumTitle, int vAlbumImage, String vSong, double vSongLength) {

        mArtist = vArtist;
        mAlbumTitle = vAlbumTitle;
        mAlbumImage = vAlbumImage;
        mSong = vSong;
        mSongLength = vSongLength;

    }


    public String getArtist() {
        return mArtist;
    }

    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    public int getAlbumImage() {
        return mAlbumImage;
    }

    public String getSong() {
        return mSong;
    }

    public String getSongLength() {

        DecimalFormat df = new DecimalFormat("0.00");
        String decimalFormatSongLength = df.format(mSongLength);
        return decimalFormatSongLength;
    }

}