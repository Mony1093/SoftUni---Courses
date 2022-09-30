package FirstStepsInCodingExercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double costChicken = chickenMenu * 10.35;
        double costFish = fishMenu * 12.40;
        double costVegetarian = vegetarianMenu * 8.15;
        double costMenu = costChicken + costFish + costVegetarian;
        double costDessert = costMenu * 20/100;
        double totalCost = costMenu + costDessert + 2.50;
        System.out.println(totalCost);

    }
}
