package additional_exercise2.controller;

import additional_exercise2.service.ICarService;
import additional_exercise2.service.implement.CarService;

import java.util.Scanner;

public class CarController<iCarService> {
    private static ICarService iCarService = new CarService();
    public static void menuCar(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Thêm mới phương tiện xe ô tô ");
            System.out.println("2. Hiện thị phương tiện xe ô tô ");
            System.out.println("3. Xóa phương tiện xe ô tô");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            int choose  = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iCarService.addCar();
                    break;
                case 2:
                    iCarService.displayCar();
                    break;
                case 3:
                    iCarService.deleteCar();
                    break;
                case 4:
                    iCarService.searchCar();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
