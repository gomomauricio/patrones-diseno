#  PATRONES DE DISEÑO 
 
 
# 1. Singleton (Creacional)

* **Problema:** asegurar que solo exista una instancia de una clase

* **Dónde se usa en Java real:**

* Configuraciones
* Conexiones
* Beans en Spring (scope singleton por default)

### 💡 Idea

Una sola instancia global accesible.

### 🧪 Ejercicio

Implementa un `Logger`:

```java
public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
```

👉 **Reto:**

* Hazlo thread-safe (double-check locking)
* Agrega niveles: INFO, ERROR

---
 



