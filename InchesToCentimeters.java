package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = 2.54 * inches;
        System.out.println(centimeters);
    }
}
