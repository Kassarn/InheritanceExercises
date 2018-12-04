package com.OnlineRadioDatabase;

import com.OnlineRadioDatabase.Exceptions.InvalidSongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int songsToAdd =Integer.parseInt(reader.readLine());
        Playlist playlist =  new Playlist();
        while (songsToAdd-->0){
            try {

                    String[] songLine = reader.readLine().split(";");
                    String artistName = songLine[0];
                    String songName = songLine[1];
                    String songLength = songLine[2];

                Song song = new Song(artistName, songName, songLength);
                playlist.addSong(song);

            }catch (InvalidSongException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid song length.");
            }
        }
        System.out.println(playlist);
    }
}
