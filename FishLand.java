package FirstStepsInCodingMoreEx;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double scad = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPrice +(mackerelPrice * 0.60);
        double totalBonitoSum= bonitoPrice * bonito;
        double scadPrice = spratPrice + (spratPrice * 0.80);
        double totalScadSum= scadPrice * scad;
        double musselsSum = mussels * 7.50;
        double totalFishSum = (totalBonitoSum + totalScadSum + musselsSum );

                System.out.printf("%.2f",totalFishSum);




    }
}
