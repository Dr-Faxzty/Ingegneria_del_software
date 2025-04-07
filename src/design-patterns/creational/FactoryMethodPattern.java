/**
 * Esempio di Factory Method Pattern in Java
 * Utilizza una classe astratta (Dialog) che delega la creazione del prodotto (Button)
 * a sottoclassi concrete (WindowsDialog, LinuxDialog).
 */

// Interfaccia prodotto
interface Button {
    void render();
}

// Prodotti concreti
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering bottone stile Windows");
    }
}

class LinuxButton implements Button {
    public void render() {
        System.out.println("Rendering bottone stile Linux");
    }
}

// Creatore astratto
abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

// Creatori concreti
class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}

class LinuxDialog extends Dialog {
    public Button createButton() {
        return new LinuxButton();
    }
}

// Classe principale
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Dialog dialog;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new LinuxDialog();
        }

        dialog.renderWindow();
    }
}