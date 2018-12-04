package com.OnlineRadioDatabase;

import com.OnlineRadioDatabase.Exceptions.*;

public class Song {
    private String artistName;
    private String songName;
    private int songMinutes;
    private int songSeconds;

    public Song(String artistName, String songName,String length) {
        setArtistName(artistName);
        setSongName(songName);
        setLength(length);
    }

    public int getLength(){
       return this.songMinutes *60 + this.songSeconds ;
    }
    private void setLength(String length) {
      String[] songLength = length.split(":");
      int songMins = Integer.parseInt(songLength[0]);
      int songSecs =Integer.parseInt(songLength[1]);
       try{
           setSongMinutes(songMins);
           setSongSeconds(songSecs);
       }catch (NumberFormatException e) {
           System.out.println("Invalid song length.");
       }

    }

    private void setArtistName(String artistName) {
        if(artistName.length()<3 || artistName.length()>20){
            throw  new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    private void setSongName(String songName) {
        if(songName.length()<3 || songName.length()>30){
            throw  new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.songName = songName;
    }

    private void setSongMinutes(int songMinutes) {
        if(songMinutes<0 || songMinutes>14){
            throw  new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.songMinutes = songMinutes;
    }

    private void setSongSeconds(int songSeconds) {
        if(songSeconds<0 || songSeconds>59){
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.songSeconds = songSeconds;
    }
}

