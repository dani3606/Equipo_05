package Equipo05;

public class Tester {

    public static void main(String[] args) {
        // Probar el método esDivisiblePorCinco desde la clase Main
        System.out.println("Test 1: 10 -> " + Main.esDivisiblePorCinco(10)); // true
        System.out.println("Test 2: 7 -> " + Main.esDivisiblePorCinco(7));   // false
        System.out.println("Test 3: 0 -> " + Main.esDivisiblePorCinco(0));   // true
        System.out.println("Test 4: -5 -> " + Main.esDivisiblePorCinco(-5)); // true
    }
}
