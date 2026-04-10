#  ADAPTER (Estructural)
* **Problema:** hacer compatibles interfaces diferentes
* **Muy usado en:**
* * Integraciones externas
* * APIs legacy

## Idea

Traducir una interfaz a otra.

##  Ejercicio

Adaptar API vieja:

```java
class OldPaymentSystem {
    public void makePayment(int amount) {
        System.out.println("Pago viejo: " + amount);
    }
}
```

Adapter:

```java
interface Payment {
    void pay(double amount);
}

class PaymentAdapter implements Payment {
    private OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public void pay(double amount) {
        oldSystem.makePayment((int) amount);
    }
}
```

👉 **Reto:**

* Soporta múltiples sistemas legacy
* Maneja conversiones (moneda, formato)
 




