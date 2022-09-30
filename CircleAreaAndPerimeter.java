package FirstStepsInCodingMoreEx;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Лице и обиколка на окръжност:
        // S = PI * r2 ; P = 2 * PI2
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI *(r * r);
        double perimeter = 2 * (Math.PI * r);
        System.out.printf("%.2f %n" ,area );
        System.out.printf("%.2f %n",perimeter);
    }
}
