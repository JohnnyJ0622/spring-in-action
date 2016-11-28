package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Listing 2.2 @CompactDisc-annotated SgtPeppers implements CompactDisc
 * Created by Johnny on 11/11/2016.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
    public void playTrack(int n){
    }
}
