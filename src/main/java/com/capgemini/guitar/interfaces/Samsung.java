package com.capgemini.guitar.interfaces;

public class Samsung implements Television  {  // new is 'implements'

    private boolean on;
    private int currentChannel;
    private int volumeLevel;
    private boolean subtitles;


    @Override
    public void on() {
        System.out.println("I am a Samsung and currently I am switched on");
        this.on = true;
    }

    @Override
    public void off() {
        System.out.println("I am a Samsung and currently I am switched off");
        this.on = false;
    }

    @Override
    public void changeChannel(int newChannel) {

        this.currentChannel = newChannel;
    }

    @Override
    public void changeVolume(int newVolume) {
        this.volumeLevel = newVolume;

    }

    @Override
    public void toggleSubtitles() {
        this.subtitles = !this.subtitles;
    }
}