package pl.rafalmitula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witamy w programie do rozliczania 23% VATu.");
        System.out.println();

        boolean shouldContinue = true;
        Methods metody = new Methods();
        Scanner scanner = new Scanner(System.in);

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
                    case 1 -> metody.calculateNetto();
                    case 2 -> metody.calculateBrutto();
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

