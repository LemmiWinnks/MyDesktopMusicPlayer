package com.playMusic;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class PlayMusic{
    File path;

    public PlayMusic(String path) {
        this.path = new File(path);
        play();
    }

    public void play() {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(path);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setPath(String newPath) {
        this.path = new File(newPath);
    }
}
