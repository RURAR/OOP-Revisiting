// Demonstrates Multiple Inheritance using Interface
interface Camera {
    void takePhoto();
}

interface Music {
    void playMusic();
}

class SmartDevice implements Camera, Music {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class SmartDeviceTest {
    public static void main(String[] args) {
        SmartDevice d = new SmartDevice();
        d.takePhoto();
        d.playMusic();
    }
}
