package com.capgemini.guitar.interfaces;

public interface Television { // An interface is a 100% abstract class (and it is not a class)

    public abstract void on(); // is te same as 'void on();'
    void off();

    void changeChannel(int newChannel);
    void changeVolume(int newVolume);

    void toggleSubtitles();
}
