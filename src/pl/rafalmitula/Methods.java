package pl.rafalmitula;

import java.util.Scanner;

public class Methods {


    public void calculateNet() {
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć 23% VAT." +
                "\nW przypadku części dziesiętnych oddziel je przecinkiem.");

        try {

            Scanner scnNet = new Scanner(System.in);
            double amountCn = scnNet.nextDouble();
            double amountVatCn = amountCn * 0.23;
            double amountGrossCn = amountCn * 1.23;

            System.out.println(String.format("Kwota netto: %.2f", amountCn));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCn));
            System.out.println(String.format("Kwota brutto: %.2f", amountGrossCn));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!!\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateNet();
        }


    }

    public void calculateGross() {
        System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć 23% VAT." +
                "\nW przypadku części dziesiętnych oddziel je przecinkiem.");

        try {

            Scanner scnGross = new Scanner(System.in);
            double amountCg = scnGross.nextDouble();
            double amountVatCg = (amountCg * 0.23) / (1.23);
            double amountNetCg = (amountCg / (123)) * 100;

            System.out.println(String.format("Kwota netto: %.2f", amountNetCg));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCg));
            System.out.println(String.format("Kwota brutto: %.2f", amountCg));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateGross();
        }

    }


}


