/**
 * Esempio di Iterator Pattern in Java
 * Permette di scorrere una collezione senza esporne la rappresentazione interna.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/** Interfaccia per una collezione personalizzata */
interface MyCollection {
    void add(String item);
    Iterator<String> iterator();
}

/** Implementazione concreta della collezione */
class SimpleCollection implements MyCollection {
    private String[] items;
    private int size = 0;

    public SimpleCollection(int capacity) {
        items = new String[capacity];
    }

    @Override
    public void add(String item) {
        if (size < items.length) {
            items[size++] = item;
        } else {
            throw new IllegalStateException("Collezione piena");
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new SimpleIterator();
    }

    /** Classe interna che implementa l'iterator */
    private class SimpleIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[index++];
        }
    }
}

/** Classe principale per testare l'iterator */
public class IteratorPattern {
    public static void main(String[] args) {
        MyCollection collection = new SimpleCollection(5);
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
