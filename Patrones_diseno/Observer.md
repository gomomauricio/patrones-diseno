#  OBSERVER (Comportamiento)

👉 **Problema:** notificar cambios a múltiples objetos

👉 **Muy usado en:**

* Eventos
* Spring Events
* WebSockets

### 💡 Idea

Publicador → múltiples suscriptores

### 🧪 Ejercicio

Sistema de notificaciones de stock:

```java
interface Observer {
    void update(String product);
}

class User implements Observer {
    public void update(String product) {
        System.out.println("Notificado: " + product);
    }
}
```

Publisher:

```java
class Product {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String product) {
        for (Observer o : observers) {
            o.update(product);
        }
    }
}
```

👉 **Reto:**

* Permitir unsubscribe
* Notificar solo a ciertos tipos de usuarios
 
 



