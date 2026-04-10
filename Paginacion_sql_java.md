# Paginación

## 1. Paginación en MySQL - DB

* La forma clásica es con:

```sql
SELECT * 
FROM users
LIMIT 10 OFFSET 0;

--traer los registros del 11 al 20
SELECT * FROM mitabla LIMIT 10 OFFSET 10;

--traer los registros del 21 al 30
SELECT * FROM mitabla LIMIT 10 OFFSET 20;
 


----/* En Informix: */
--traer los registros del 1 al 10
SELECT SKIP 0 FIRST 10 * FROM mitabla;

--traer los registros del 11 al 20
SELECT SKIP 10 FIRST 10 * FROM mitabla;

--traer los registros del 21 al 30
SELECT SKIP 20 FIRST 10 * FROM mitabla;

```

###  Cómo funciona:

* `LIMIT`: cuántos registros quieres
* `OFFSET`: desde qué posición empiezas

 


## 2. Paginación en Spring Boot (JPA)

### 🔹 Usando `Pageable`

* Spring ya trae todo listo con **Spring Data JPA**

### Repositorio:

```java
public interface UserRepository extends JpaRepository<User, Long> {

}
```

---

###  Servicio / Controller

```java
@GetMapping("/users")
public Page<User> getUsers(
        @RequestParam int page,
        @RequestParam int size
) {
    Pageable pageable = PageRequest.of(page, size);
    return userRepository.findAll(pageable);
}
```

---

## 🔹 Ejemplo request:

```
GET /users?page=0&size=10
```

---

## 🔹 Qué devuelve `Page`:

```java
{
  "content": [...],
  "totalElements": 100,
  "totalPages": 10,
  "size": 10,
  "number": 0
}
```

---

# 🔥 3. Paginación + Ordenamiento

```java
Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());
```

---

# ⚡ 4. Paginación con Query personalizada

```java
@Query("SELECT u FROM User u WHERE u.active = true")
Page<User> findActiveUsers(Pageable pageable);
```

---

## Buenas prácticas (esto te lo preguntan en entrevistas)

### ❌ Problema:

`OFFSET` grande = lento

### ✅ Solución avanzada:

👉 **Keyset Pagination (cursor-based)**

Ejemplo MySQL:

```sql
SELECT * 
FROM users
WHERE id > 100
LIMIT 10;
```

✔ Mucho más eficiente en tablas grandes

---

# 🧠 Resumen rápido

| Nivel    | Cómo se hace             |
| -------- | ------------------------ |
| MySQL    | `LIMIT + OFFSET`         |
| Spring   | `Pageable + PageRequest` |
| Avanzado | Keyset pagination        |

---
 
