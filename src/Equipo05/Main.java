package Equipo05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Introduce un número: ");
            int numero = scanner.nextInt();

            System.out.println("Selecciona una opción:");
            System.out.println("1. ¿Es divisible entre 3?");
            System.out.println("2. ¿Es divisible entre 5?");
            System.out.println("3. ¿Es un número par?");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Es divisible entre 3?: " + dividir3(numero));
                    break;
                case 2:
                    System.out.println("¿Es divisible entre 5?: " + esDivisiblePorCinco(numero));
                    break;
                case 3:
                    System.out.println("¿Es par?: " + esPar(numero));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close();
    }

    public static boolean dividir3(int numero) {
        return numero % 3 == 0;
    }

    public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}