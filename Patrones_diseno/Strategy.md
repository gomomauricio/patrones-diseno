# Strategy (Comportamiento)
* **Problema:** múltiples algoritmos intercambiables
* **Muy usado en:**
* * Pagos
* * Descuentos
* * Validaciones

### 💡 Idea

Cambiar comportamiento en runtime.

### 🧪 Ejercicio

Sistema de pagos:

```java
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagando con tarjeta: " + amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagando con PayPal: " + amount);
    }
}
```

Uso:

```java
class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(double amount) {
        strategy.pay(amount);
    }
}
```

👉 **Reto:**

* Agrega descuento dinámico por estrategia
* Combínalo con Factory
----







------

# Ejercicio 2: Sistema de envío de notificaciones (Strategy)

## 🎯 Objetivo

Diseñar un sistema que envíe notificaciones por diferentes canales sin usar `if` ni `switch`.

---

## 📌 Requerimiento

Un sistema debe poder enviar mensajes por:

* Email
* SMS
* Push (notificaciones tipo app)

Cada canal tiene su propia lógica.

---

## ❌ Restricción (IMPORTANTE)

No puedes usar:

```java
if (type == EMAIL) { ... }
switch(type) { ... }
```

---

## 🧱 Paso 1: Define la estrategia

```java
public interface NotificationStrategy {
    void send(String message);
}
```

---

## 🧱 Paso 2: Implementaciones

```java
public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
```

```java
public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
```

```java
public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}
```

---

## 🧱 Paso 3: Contexto

```java
public class NotificationService {

    private NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notify(String message) {
        strategy.send(message);
    }
}
```

---

## 🧪 Paso 4: Uso

```java
NotificationService service = new NotificationService(new EmailNotification());
service.notify("Hola usuario");
```

---

# 🔥 Nivel 2 (lo interesante)

Ahora agrega esto 👇

## 💥 Nuevo requerimiento

* Algunos envíos deben tener:

  * 🔒 Encriptación
  * 📊 Logging
  * ⏱ Retry automático

---

## 🤯 Pregunta de entrevista

👉 ¿Seguirías usando solo Strategy o combinarías con otro patrón?

💡 Pista:

* Strategy → tipo de envío
* Decorator → funcionalidades extra

---

# 🚀 Nivel 3 (pro)

Crea un sistema donde puedas hacer:

```java
NotificationStrategy strategy = new LoggingDecorator(
    new RetryDecorator(
        new EmailNotification()
    )
);
```

---

# 🧠 Qué evalúa este ejercicio

* Entendimiento real de Strategy
* Evitar `if/switch`
* Composición de objetos
* Escalabilidad (OCP)
* Pensamiento de arquitectura

---

Si quieres, en el siguiente paso:
👉 te reviso tu solución
👉 o lo subimos a nivel **Spring Boot con @Component + inyección automática** (esto cae MUCHO en entrevistas)


