package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

     void on() {
        isOn = true;
    }
     void off() {
        isOn = false;
    }
     void volumeUp() {
        volume++;
    }
     void volumeDown() {
        volume--;
    }
}
