package variablesyoperadores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1️⃣ DECLARACIÓN Y USO DE VARIABLES
        System.out.println("===== DECLARACIÓN DE VARIABLES =====");

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal (double): ");
        double numeroDecimal = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingrese un texto (String): ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese un valor booleano (true/false): ");
        boolean valorBooleano = scanner.nextBoolean();

        System.out.println("\nValores ingresados:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
        System.out.println("Booleano: " + valorBooleano);


        // 2️⃣ OPERACIONES MATEMÁTICAS
        System.out.println("\n===== OPERACIONES MATEMÁTICAS (int) =====");

        System.out.print("Ingrese primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División (entera): " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }


        // 3️⃣ OPERACIONES LÓGICAS
        System.out.println("\n===== OPERACIONES LÓGICAS =====");

        System.out.print("Ingrese primer número: ");
        int log1 = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        int log2 = scanner.nextInt();

        System.out.println("Mayor que: " + (log1 > log2));
        System.out.println("Menor que: " + (log1 < log2));
        System.out.println("Igual: " + (log1 == log2));
        System.out.println("AND (ambos positivos): " + (log1 > 0 && log2 > 0));
        System.out.println("OR (al menos uno positivo): " + (log1 > 0 || log2 > 0));


        // 4️⃣ CLASIFICACIÓN DE EDAD
        System.out.println("\n===== CLASIFICACIÓN DE EDAD =====");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 12) {
            System.out.println("Clasificación: Niño");
        } else if (edad <= 17) {
            System.out.println("Clasificación: Adolescente");
        } else if (edad <= 59) {
            System.out.println("Clasificación: Adulto");
        } else {
            System.out.println("Clasificación: Adulto mayor");
        }


        // 5️⃣ DÍA DE LA SEMANA
        System.out.println("\n===== DÍA DE LA SEMANA =====");

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }


        // 6️⃣ VERIFICACIÓN DE ACCESO
        scanner.nextLine();

        System.out.println("\n===== INICIO DE SESIÓN =====");

        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";

        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Acceso concedido");
        } else if (usuario.equals(usuarioCorrecto)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario no registrado");
        }

        scanner.close();
    }
}