# VariablesYOperadores

## 📌 Descripción del Proyecto

Este proyecto fue desarrollado en Java con el objetivo de aplicar el uso de variables, operadores lógicos y estructuras de control.

El programa permite:
- Clasificar la edad de una persona.
- Mostrar el día de la semana según un número.
- Verificar el acceso de un usuario según condiciones establecidas.

---

## 1️⃣ Respuestas Teóricas

### ¿Para qué se utilizan los operadores lógicos en programación?

Los operadores lógicos se utilizan para evaluar múltiples condiciones en una expresión. Permiten combinar comparaciones mediante operadores como:

- && (AND)
- || (OR)
- ! (NOT)

Son fundamentales para tomar decisiones dentro del programa, especialmente en estructuras condicionales como `if`.

---

### ¿Por qué es importante declarar correctamente el tipo de dato de una variable?

Es importante declarar correctamente el tipo de dato porque:

- Define qué tipo de información puede almacenar la variable.
- Evita errores de ejecución.
- Permite que el programa use la memoria de manera eficiente.
- Garantiza que las operaciones realizadas sean compatibles con el tipo de dato.

Por ejemplo, no se puede realizar operaciones matemáticas con un tipo de dato `String`.

---

## 2️⃣ Justificación Técnica

### Clasificación de edad

Se utilizó la estructura de control `if - else if - else` porque permite evaluar múltiples rangos de edad y clasificar correctamente según la condición que se cumpla.

Esta estructura es adecuada cuando se necesita evaluar condiciones secuenciales basadas en rangos numéricos.

---

### Día de la semana

Se utilizó la estructura `switch` porque permite evaluar un solo valor (número del 1 al 7) y asignar un resultado específico para cada caso.

El `switch` es más organizado y claro cuando se trabaja con múltiples opciones definidas.

---

### Verificación de acceso

Se utilizó la estructura `if` con operadores lógicos (`&&`) para validar múltiples condiciones al mismo tiempo, como edad mínima y estado de usuario.

Esto permite asegurar que todas las condiciones necesarias se cumplan antes de permitir el acceso.

---

## ▶️ Ejecución

El programa se ejecuta desde la clase `Main`.

No presenta errores de compilación y puede ejecutarse correctamente en cualquier entorno compatible con Java.
