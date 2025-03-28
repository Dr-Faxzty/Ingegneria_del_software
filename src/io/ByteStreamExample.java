/**
 * Classe che dimostra l'uso degli stream di byte in Java per la lettura e scrittura di file.
 */
import java.io.*;

public class ByteStreamExample {
    
    /** Metodo per scrivere dati binari su un file usando FileOutputStream */
    public static void scriviByteSuFile(String nomeFile, byte[] dati) {
        try (FileOutputStream fos = new FileOutputStream(nomeFile)) {
            fos.write(dati);
            System.out.println("Scrittura completata su " + nomeFile);
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
    
    /** Metodo per leggere dati binari da un file usando FileInputStream */
    public static void leggiByteDaFile(String nomeFile) {
        try (FileInputStream fis = new FileInputStream(nomeFile)) {
            System.out.println("Contenuto di " + nomeFile + " in byte:");
            int byteLetto;
            while ((byteLetto = fis.read()) != -1) {
                System.out.print(byteLetto + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
    
    /** Metodo per copiare un file usando byte stream */
    public static void copiaFile(String fileSorgente, String fileDestinazione) {
        try (FileInputStream fis = new FileInputStream(fileSorgente);
             FileOutputStream fos = new FileOutputStream(fileDestinazione)) {
            
            byte[] buffer = new byte[1024];
            int lunghezza;
            while ((lunghezza = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, lunghezza);
            }
            System.out.println("Copia completata da " + fileSorgente + " a " + fileDestinazione);
        } catch (IOException e) {
            System.out.println("Errore durante la copia del file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String nomeFile = "esempio.dat";
        byte[] dati = {65, 66, 67, 68, 69}; // Dati binari da scrivere (ABC...)
        
        /** Scrive i byte su file */
        scriviByteSuFile(nomeFile, dati);
        
        /** Legge i byte dal file */
        leggiByteDaFile(nomeFile);
        
        /** Copia il file in un altro */
        copiaFile(nomeFile, "esempio_copia.dat");
    }
}
