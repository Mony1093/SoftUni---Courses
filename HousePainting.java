package FirstStepsInCodingMoreEx;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightFrontBackWall = Double.parseDouble(scanner.nextLine());
        double lengthSideWall = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());

        double frontDoorArea = 1.2 * 2.00;
        double windowsArea = 1.5 * 1.5;
        double frontWallArea = (heightFrontBackWall * heightFrontBackWall) - frontDoorArea;
        double backWallArea = heightFrontBackWall * heightFrontBackWall;
        double sideWallArea = (heightFrontBackWall * lengthSideWall) -windowsArea;

        double roofFrontBackArea = (heightFrontBackWall) * 0.5 * heightRoof;
        double roofSideArea = heightFrontBackWall * lengthSideWall;
        double totalWallArea = frontWallArea + backWallArea + (2 * sideWallArea);
        double totalRoofArea = 2 * roofSideArea + 2 * roofFrontBackArea;

        double neededGreenPaint = totalWallArea /3.4;
        double neededRedPaint = totalRoofArea / 4.3;

          System.out.printf("%.2f",neededGreenPaint);
          System.out.printf("%n");
          System.out.printf("%.2f",neededRedPaint);


    }
}
