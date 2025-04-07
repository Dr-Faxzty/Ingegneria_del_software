/**
 * Esempio di Abstract Factory Pattern in Java.
 * Fornisce un'interfaccia per creare famiglie di oggetti correlati senza specificare le loro classi concrete.
 */

// Prodotti astratti
interface Button {
    void render();
}

interface Checkbox {
    void render();
}

// Prodotti concreti per Windows
class WindowsButton implements Button {
    public void render() {
        System.out.println("Pulsante Windows");
    }
}

class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Checkbox Windows");
    }
}

// Prodotti concreti per Linux
class LinuxButton implements Button {
    public void render() {
        System.out.println("Pulsante Linux");
    }
}

class LinuxCheckbox implements Checkbox {
    public void render() {
        System.out.println("Checkbox Linux");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class LinuxFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}

// Client
class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}

// Utilizzo
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}