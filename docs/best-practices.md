# 📌 **Best Practices in Java**

## **1️⃣ Convenzioni di Nomenclatura**
Segui le convenzioni per migliorare la leggibilità e la coerenza del codice.

✅ **Classi:** usa la notazione **PascalCase**
```java
public class StudenteManager {}
```
✅ **Metodi e Variabili:** usa la notazione **camelCase**
```java
public void calcolaMedia();
int numeroStudenti;
```
✅ **Costanti:** usa **tutto maiuscolo con underscore**
```java
public static final double PI_GRECO = 3.14159;
```
✅ **Pacchetti:** usa **tutto minuscolo**
```java
package com.miaazienda.modulo;
```

---

## **2️⃣ Organizzazione del Codice**
✅ **Una classe per file** con lo stesso nome del file.
✅ **Mantieni le classi corte e con un solo scopo** (principio **SRP - Single Responsibility Principle**).
✅ **Ordine degli elementi in una classe:**
1. Variabili statiche
2. Variabili di istanza
3. Costruttori
4. Metodi pubblici
5. Metodi privati

```java
public class Studente {
    private static final String SCUOLA = "Liceo Scientifico";
    private String nome;
    
    public Studente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    private void stampaDettagli() {
        System.out.println(nome + " frequenta " + SCUOLA);
    }
}
```

---

## **3️⃣ Utilizzo delle Eccezioni**
✅ Usa eccezioni specifiche invece di `Exception` generiche:
```java
try {
    int risultato = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Errore: divisione per zero");
}
```
✅ Evita `catch` vuoti!
```java
try {
    File file = new File("test.txt");
} catch (IOException e) {
    // ❌ Evita di ignorare gli errori!
}
```
✅ Usa `finally` per chiudere risorse:
```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
} catch (IOException e) {
    System.out.println("Errore di I/O");
} finally {
    reader.close();
}
```
📌 **Alternativa moderna:** Usa il **try-with-resources**.
```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(reader.readLine());
} catch (IOException e) {
    System.out.println("Errore di I/O");
}
```

---

## **4️⃣ Uso dei Commenti**
✅ **Evita commenti ovvi o inutili.** Scrivi codice leggibile senza eccesso di commenti.
```java
// ❌ Evita
int x = 10; // Assegna il valore 10 a x

// ✅ Usa per spiegazioni importanti
/**
 * Calcola la somma di due numeri interi.
 * @param a Primo numero
 * @param b Secondo numero
 * @return La somma di a e b
 */
public int somma(int a, int b) {
    return a + b;
}
```

---

## **5️⃣ Evitare Memory Leaks**
✅ **Chiudi sempre le risorse aperte** (`File`, `Socket`, `DB Connection`).
✅ **Usa weak references se necessario** per oggetti non critici.
✅ **Evita oggetti statici mutabili** che possono rimanere in memoria.

```java
public class Cache {
    private static final Map<Integer, String> CACHE = new HashMap<>();
}
```

---

## **6️⃣ Evitare la Concorrenza Non Sicura**
✅ Usa `synchronized` o `ReentrantLock` per evitare **race condition**.
```java
public synchronized void incrementa() {
    counter++;
}
```
✅ Usa `ConcurrentHashMap` invece di `HashMap` in ambienti multi-thread.

---

## **7️⃣ Migliorare le Prestazioni**
✅ **Evita la concatenazione con `+` nelle stringhe.** Usa `StringBuilder`:
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" World");
```
✅ **Usa lazy initialization** per migliorare l'uso della memoria:
```java
private List<String> dati;
public List<String> getDati() {
    if (dati == null) {
        dati = new ArrayList<>();
    }
    return dati;
}
```
✅ **Evita oggetti non necessari**:
```java
// ❌ Evita di creare oggetti inutilmente
Integer num = new Integer(10);
// ✅ Usa direttamente il valore primitivo o autoboxing
Integer num = 10;
```

---

## **8️⃣ Uso Corretto delle Collection**
✅ **Usa il tipo più generico possibile**:
```java
List<String> nomi = new ArrayList<>(); // ✅
```
✅ **Evita `Vector` e `Hashtable`**, sostituiscili con `ArrayList` e `HashMap`.
✅ **Usa `Set` per evitare duplicati**:
```java
Set<String> unici = new HashSet<>();
```
✅ **Usa `LinkedList` solo se necessario**, perché ha una gestione della memoria più pesante rispetto a `ArrayList`.

---

## **9️⃣ Uso delle Classi Immutable**
Le **classi immutabili** sono più sicure e riducono i bug legati alla concorrenza.
```java
public final class Persona {
    private final String nome;
    
    public Persona(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
```
✅ **Evita setter in classi immutabili**.
✅ **Dichiara i campi come `final`**.
✅ **Non lasciare riferimenti modificabili**.

---

## **🔟 Testare il Codice**
✅ Usa **JUnit** per testare le funzioni.
✅ **Evita test che dipendono dallo stato globale**.
✅ **Usa assert per verificare i risultati attesi**.
```java
@Test
public void testSomma() {
    assertEquals(5, somma(2, 3));
}
```

---

### 🎯 **Conclusione**
Seguire queste best practices aiuta a scrivere codice Java più **pulito, sicuro e performante**. Mantenere uno stile coerente migliora la collaborazione nei team di sviluppo! 🚀