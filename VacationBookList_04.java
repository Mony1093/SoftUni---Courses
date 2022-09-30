package FirstStepsInCodingExercises;

import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int allHours = pages/pagesPerHour;
        int hoursForReading = allHours/days;

        System.out.println(hoursForReading);

    }
}
