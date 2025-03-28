/**
 * Classe che dimostra la gestione dei file in Java.
 */
import java.io.File;
import java.io.IOException;

public class FileHandling {
    
    /** Metodo per creare un nuovo file */
    public static void creaFile(String nomeFile) {
        File file = new File(nomeFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File creato: " + file.getName());
            } else {
                System.out.println("Il file esiste già.");
            }
        } catch (IOException e) {
            System.out.println("Errore durante la creazione del file: " + e.getMessage());
        }
    }
    
    /** Metodo per eliminare un file */
    public static void eliminaFile(String nomeFile) {
        File file = new File(nomeFile);
        if (file.delete()) {
            System.out.println("File eliminato: " + file.getName());
        } else {
            System.out.println("Impossibile eliminare il file.");
        }
    }
    
    /** Metodo per ottenere informazioni su un file */
    public static void infoFile(String nomeFile) {
        File file = new File(nomeFile);
        if (file.exists()) {
            System.out.println("Nome: " + file.getName());
            System.out.println("Percorso assoluto: " + file.getAbsolutePath());
            System.out.println("Scrivibile: " + file.canWrite());
            System.out.println("Leggibile: " + file.canRead());
            System.out.println("Dimensione: " + file.length() + " byte");
        } else {
            System.out.println("Il file non esiste.");
        }
    }
    
    public static void main(String[] args) {
        String nomeFile = "testfile.txt";
        
        /** Creazione di un file */
        creaFile(nomeFile);
        
        /** Ottenimento delle informazioni del file */
        infoFile(nomeFile);
        
        /** Eliminazione del file */
        eliminaFile(nomeFile);
    }
}
