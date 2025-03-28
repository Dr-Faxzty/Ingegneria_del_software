/**
 * Classe che dimostra la lettura e la scrittura di file in Java.
 */
import java.io.*;

public class FileReadWrite {
    
    /** Metodo per scrivere testo in un file */
    public static void scriviSuFile(String nomeFile, String contenuto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            writer.write(contenuto);
            System.out.println("Scrittura completata su " + nomeFile);
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
    
    /** Metodo per leggere il contenuto di un file usando BufferedReader */
    public static void leggiDaFile(String nomeFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            System.out.println("Contenuto di " + nomeFile + ":");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
    
    /** Metodo per leggere il contenuto di un file usando LineNumberReader */
    public static void leggiConLineNumber(String nomeFile) {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(nomeFile))) {
            String linea;
            System.out.println("Contenuto di " + nomeFile + " con numero di riga:");
            while ((linea = reader.readLine()) != null) {
                System.out.println("Riga " + reader.getLineNumber() + ": " + linea);
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String nomeFile = "esempio.txt";
        String contenuto = "Questo è un esempio di scrittura su file in Java.";
        
        /** Scrive il contenuto su file */
        scriviSuFile(nomeFile, contenuto);
        
        /** Legge il contenuto del file con BufferedReader */
        leggiDaFile(nomeFile);
        
        /** Legge il contenuto del file con LineNumberReader */
        leggiConLineNumber(nomeFile);
    }
}

/**
 * Differenze tra BufferedReader e LineNumberReader:
 * - BufferedReader è più performante per leggere grandi quantità di dati poiché utilizza un buffer interno.
 * - LineNumberReader estende BufferedReader e aggiunge la funzionalità di tenere traccia del numero di riga.
 * - Se è necessario solo leggere efficientemente un file riga per riga, BufferedReader è la scelta migliore.
 * - Se serve ottenere il numero di riga durante la lettura, LineNumberReader è più adatto.
 */
