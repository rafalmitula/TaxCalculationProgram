package pl.rafalmitula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean shouldContinue = true;
    private static Methods methods = new Methods();

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witamy w programie do rozliczania 23% VATu.");
        System.out.println();

        while (shouldContinue) {

            System.out.println("--------------");
            System.out.println("Wybierz opcję:");
            System.out.println("1. Rozlicz VAT - kwota netto");
            System.out.println("2. Rozlicz VAT - kwota brutto");
            System.out.println("3. Wyjdź");
            System.out.println("--------------");

            try {

                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1 -> methods.calculateNet();
                    case 2 -> methods.calculateGross();
                    case 3 -> {
                        shouldContinue = false;
                        System.out.println("Dziękujęmy za skorzystanie z naszego programu.");
                    }
                    default -> System.out.println("Niepoprawny wybór!\nWybierz liczbę od 1 do 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz.");
                scanner.next();

            }
        }

    }

}

