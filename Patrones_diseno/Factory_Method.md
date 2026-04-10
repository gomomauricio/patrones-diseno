#  FACTORY METHOD 
 
  
# 🧠 2. Factory Method (Creacional)

👉 **Problema:** evitar `new` directos y desacoplar creación

👉 **Muy usado en:**

* APIs
* Spring (BeanFactory)
* Drivers

### 💡 Idea

Delegar la creación de objetos.

### 🧪 Ejercicio

Sistema de notificaciones:

```java
interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
```

Factory:

```java
class NotificationFactory {
    public static Notification create(String type) {
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            default -> throw new IllegalArgumentException();
        };
    }
}
```

👉 **Reto:**

* Agrega WhatsApp sin modificar código existente (OCP)
* Usa enum en vez de String

---
 


