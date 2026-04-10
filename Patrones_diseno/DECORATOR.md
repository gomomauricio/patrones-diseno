# DECORATOR (Estructural)
* **Problema:** agregar funcionalidades sin modificar la clase
* **Muy usado en:**
* * Streams (`BufferedReader`)
* * Seguridad
* * Logs

## 💡 Idea

Envolver objetos dinámicamente.

## 🧪 Ejercicio

Café con extras:

```java
interface Coffee {
    double cost();
}

class BasicCoffee implements Coffee {
    public double cost() {
        return 10;
    }
}
```

Decorator:

```java
class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost() + 5;
    }
}
```

👉 **Reto:**

* Agrega múltiples decoradores (chocolate, caramelo)
* Imprime descripción además del costo

 



