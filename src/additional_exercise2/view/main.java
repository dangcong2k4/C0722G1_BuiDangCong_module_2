package additional_exercise2.view;

import additional_exercise2.controller.CarController;
import additional_exercise2.controller.MotorcycleController;
import additional_exercise2.controller.TruckController;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("hãy chọn phương tiện :");
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. xe ô tô ");
            System.out.println("2. xe tải ");
            System.out.println("3. xe máy ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    CarController.menuCar();
                case 2:
                    TruckController.menuTruck();
                case 3:
                    MotorcycleController.menuMotorcycle();
            }
        }while (choose<1||choose>3);


    }
}
