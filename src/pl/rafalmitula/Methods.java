package pl.rafalmitula;

import java.util.Scanner;

public class Methods {


    public void calculateNetto() {
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć 23% VAT." +
                "\nW przypadku części dziesiętnych oddziel je przecinkiem.");


        try {
            Scanner scnNetto = new Scanner(System.in);
            double amountCn = scnNetto.nextDouble();
            double amountVatCn = amountCn * 0.23;
            double amountBruttoCn = amountCn * 1.23;

            System.out.println(String.format("Kwota netto: %.2f", amountCn));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCn));
            System.out.println(String.format("Kwota brutto: %.2f", amountBruttoCn));
        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!!" + "\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateNetto();
        }


    }

    public void calculateBrutto() {
        System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć 23% VAT." +
                "\nW przypadku części dziesiętnych oddziel je przecinkiem.");

        try {
            Scanner scnBrutto = new Scanner(System.in);
            double amountCb = scnBrutto.nextDouble();
            double amountVatCb = (amountCb * 0.23) / (1.23);
            double amountNettoCb = (amountCb / (123)) * 100;

            System.out.println(String.format("Kwota netto: %.2f", amountNettoCb));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb));
            System.out.println(String.format("Kwota brutto: %.2f", amountCb));
        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!" + "\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateBrutto();
        }

    }


}


