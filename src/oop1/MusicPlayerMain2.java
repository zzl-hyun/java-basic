package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
    }
}
