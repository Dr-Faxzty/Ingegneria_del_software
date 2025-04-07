/**
 * Esempio di Adapter Pattern in Java.
 * Permette di adattare l'interfaccia di una classe esistente (Mp4Player) a una nuova (AudioPlayer).
 */

// Target
interface AudioPlayer {
    void play(String filename);
}

// Adaptee (classe legacy)
class Mp4Player {
    public void playMp4(String filename) {
        System.out.println("Riproduzione MP4: " + filename);
    }
}

// Object Adapter (usa composizione)
class Mp4ToAudioAdapter implements AudioPlayer {
    private Mp4Player mp4Player;

    public Mp4ToAudioAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    public void play(String filename) {
        if (filename.endsWith(".mp4")) {
            mp4Player.playMp4(filename);
        } else {
            System.out.println("Formato non supportato dall'adapter");
        }
    }
}

// Class Adapter (usa ereditarietà)
class Mp4ToAudioClassAdapter extends Mp4Player implements AudioPlayer {
    public void play(String filename) {
        if (filename.endsWith(".mp4")) {
            playMp4(filename);
        } else {
            System.out.println("Formato non supportato dall'adapter");
        }
    }
}

// Utilizzo
public class AdapterPattern {
    public static void main(String[] args) {
        // Object Adapter
        Mp4Player legacyMp4 = new Mp4Player();
        AudioPlayer objectAdapter = new Mp4ToAudioAdapter(legacyMp4);
        objectAdapter.play("video.mp4");

        // Class Adapter
        AudioPlayer classAdapter = new Mp4ToAudioClassAdapter();
        classAdapter.play("video.mp4");
    }
}