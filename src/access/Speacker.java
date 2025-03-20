package access;

public class Speacker {
    private int volume;

    Speacker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100) System.out.println("You are over 100");
        else {
            volume += 10;
            System.out.println("volume up 10");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("volume down 10");
    }

    void showVolume(){
        System.out.println(volume);
    }
}
