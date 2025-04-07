/**
 * Esempio di Facade Pattern in Java.
 * Fornisce un'interfaccia semplificata per un insieme di classi di un sottosistema complesso.
 */

// Sottosistemi complessi
class Amplifier {
    void on() { System.out.println("Accensione amplificatore"); }
    void setVolume(int v) { System.out.println("Volume: " + v); }
}

class DVDPlayer {
    void on() { System.out.println("Accensione DVD Player"); }
    void play(String movie) { System.out.println("Riproduzione: " + movie); }
}

class Projector {
    void on() { System.out.println("Accensione proiettore"); }
    void setInput(String input) { System.out.println("Input: " + input); }
}

// Facade
class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparazione per guardare un film...");
        amp.on();
        amp.setVolume(5);
        projector.on();
        projector.setInput("DVD");
        dvd.on();
        dvd.play(movie);
    }
}

// Utilizzo
public class FacadePattern {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);
        homeTheater.watchMovie("Inception");
    }
}