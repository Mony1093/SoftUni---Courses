package FirstStepsInCodingMoreEx;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int Vegetables = Integer.parseInt(scanner.nextLine());
        int Fruits = Integer.parseInt(scanner.nextLine());
        // Изчисления: че едно евро е равно на 1.94лв
        double totalPriceVeg = priceVegetables * Vegetables;
        double totalPriceFr = priceFruits * Fruits;
        double totalProceeds = (totalPriceVeg + totalPriceFr) /1.94;
        System.out.printf("%.2f" ,totalProceeds);

    }
}
