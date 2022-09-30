package FirstStepsInCodingExercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaners = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = pens * 5.80;
        double markerPrice = markers * 7.20;
        double cleanerPrice = cleaners * 1.20;
        double totalPrice = penPrice + markerPrice + cleanerPrice;
        double totalPriceAfterDiscount = totalPrice - (totalPrice * discount /100);
        System.out.println(totalPriceAfterDiscount);
    }
}
