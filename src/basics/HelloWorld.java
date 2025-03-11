public class HelloWorld {
    /**
     * * lo static indica che il metodo main appartiene alla classe HelloWorld stessa,
     * * piuttosto che a un'istanza della classe. Ciò significa che possiamo chiamare
     * * il metodo main senza creare un oggetto HelloWorld.
     * * Il metodo main è speciale in Java perché è il punto di ingresso per l'esecuzione di un programma Java. 
     * * Quando esegui un programma Java, la Java Virtual Machine (JVM) cerca il metodo main per iniziare l'esecuzione.
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}