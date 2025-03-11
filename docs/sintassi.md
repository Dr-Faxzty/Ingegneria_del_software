# 📌 **Sintassi di Base di Java**

## **1️⃣ Struttura di un Programma Java**
Un programma Java è composto da **classi** e **metodi**.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
✅ **`public class HelloWorld`** → Definisce una classe pubblica chiamata `HelloWorld`.
✅ **`main(String[] args)`** → Metodo principale eseguito all'avvio del programma.
✅ **`System.out.println()`** → Stampa un messaggio sulla console.

---

## **2️⃣ Variabili e Tipi di Dati**
Java è **fortemente tipizzato**, quindi ogni variabile deve avere un tipo dichiarato.

### **Tipi Primitivi**
| Tipo     | Dimensione | Esempio |
|----------|------------|---------|
| `byte`   | 8-bit      | `byte b = 127;` |
| `short`  | 16-bit     | `short s = 32000;` |
| `int`    | 32-bit     | `int x = 100;` |
| `long`   | 64-bit     | `long big = 100000L;` |
| `float`  | 32-bit     | `float f = 3.14f;` |
| `double` | 64-bit     | `double d = 3.14159;` |
| `char`   | 16-bit     | `char c = 'A';` |
| `boolean`| 1-bit      | `boolean isJavaFun = true;` |

### **Tipi Riferimento (Oggetti)**
```java
String nome = "Mario";
Integer numero = 42;  // Wrapper per int
```
📌 **Nota**: Le stringhe in Java sono **immutabili**.

---

## **3️⃣ Operatori**
### **Operatori Aritmetici**
```java
int a = 10, b = 5;
int somma = a + b;   // 15
int diff = a - b;    // 5
int prodotto = a * b; // 50
int quoziente = a / b; // 2
int resto = a % b;    // 0
```

### **Operatori Relazionali**
```java
boolean risultato = (a > b);  // true
```
| Operatore | Significato |
|-----------|------------|
| `==` | Uguaglianza |
| `!=` | Diverso |
| `>` | Maggiore |
| `<` | Minore |
| `>=` | Maggiore o uguale |
| `<=` | Minore o uguale |

### **Operatori Logici**
```java
boolean x = true, y = false;
boolean risultato1 = x && y;  // false (AND)
boolean risultato2 = x || y;  // true  (OR)
boolean risultato3 = !x;      // false (NOT)
```

---

## **4️⃣ Controllo di Flusso**
### **Condizioni (if-else)**
```java
int numero = 10;
if (numero > 0) {
    System.out.println("Numero positivo");
} else {
    System.out.println("Numero negativo o zero");
}
```

### **Switch-Case**
```java
int giorno = 3;
switch (giorno) {
    case 1:
        System.out.println("Lunedì");
        break;
    case 2:
        System.out.println("Martedì");
        break;
    default:
        System.out.println("Altro giorno");
}
```

---

## **5️⃣ Cicli**
### **For Loop**
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iterazione: " + i);
}
```

### **While Loop**
```java
int j = 0;
while (j < 5) {
    System.out.println("j: " + j);
    j++;
}
```

### **Do-While Loop**
```java
int k = 0;
do {
    System.out.println("k: " + k);
    k++;
} while (k < 5);
```

---

## **6️⃣ Array**
```java
int[] numeri = {1, 2, 3, 4, 5};
System.out.println(numeri[0]); // Output: 1
```

Array multidimensionali:
```java
int[][] matrice = {{1, 2}, {3, 4}};
System.out.println(matrice[1][0]); // Output: 3
```

---

## **7️⃣ Metodi**
Un **metodo** è un blocco di codice riutilizzabile.
```java
public static int somma(int a, int b) {
    return a + b;
}
```
📌 **Nota:** `static` permette di chiamare il metodo senza creare un'istanza della classe.

---

## **8️⃣ Classi e Oggetti**
Java è basato su **OOP (Object-Oriented Programming)**.
```java
class Studente {
    String nome;
    int eta;
    
    Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
}

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Luca", 20);
        System.out.println(s1.nome + " ha " + s1.eta + " anni.");
    }
}
```

---

## **9️⃣ Eccezioni**
Le **eccezioni** gestiscono errori a runtime.
```java
try {
    int risultato = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Errore: divisione per zero");
}
```

---

## **🔟 Parole Chiave Importanti**
| **Keyword**  | **Descrizione** |
|--------------|----------------|
| `class` | Definisce una classe |
| `final` | Costante o classe/metodo non ereditabile |
| `static` | Metodo o variabile associata alla classe, non all'istanza |
| `this` | Riferimento all'istanza attuale della classe |
| `super` | Riferimento alla classe padre |
| `new` | Crea un'istanza di un oggetto |
| `extends` | Ereditarietà tra classi |
| `implements` | Implementazione di un'interfaccia |
| `abstract` | Classe/metodo astratto |
| `interface` | Definisce un'interfaccia |

---

### 🎯 **Conclusione**
Questa guida copre le basi della sintassi Java. Per approfondire, esplora concetti avanzati come **ereditarietà, polimorfismo, lambda expressions e multithreading**. 🚀