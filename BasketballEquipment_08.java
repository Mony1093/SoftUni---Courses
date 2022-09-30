package FirstStepsInCodingExercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = fee -(fee *40/100.00);
        double outfitPrice = sneakersPrice - (sneakersPrice *20/100);
        double ballPrice = outfitPrice/4;
        double accessories = ballPrice/5;
        double totalPrice = sneakersPrice + outfitPrice + ballPrice + accessories + fee;
        System.out.println(totalPrice);

    }
}
