package com.OnlineRadioDatabase;

import com.OnlineRadioDatabase.Exceptions.InvalidSongException;

import java.util.ArrayList;
import java.util.List;

public class Playlist  {
        private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song){
            if (this.songs.add(song)) {
                System.out.println("Song added.");
            }

    }
    public int calculateTotalLength(){
        return this.songs.stream().mapToInt(Song::getLength).sum();
    }

    @Override
    public String toString() {
        return  String.format("Songs added: %s\nPlaylist length: %sh %sm %ss",this.songs.size()
                ,this.calculateTotalLength()/3600
                ,(this.calculateTotalLength()%3600)/60
                ,((this.calculateTotalLength() %3600)%60)%60);

    }
}
