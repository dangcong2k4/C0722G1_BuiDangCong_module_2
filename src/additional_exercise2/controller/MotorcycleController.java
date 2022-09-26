package additional_exercise2.controller;

import additional_exercise2.service.IMotorcycleService;
import additional_exercise2.service.implement.MotorcycleService;

import java.util.Scanner;

public class MotorcycleController {
    private static IMotorcycleService iMotorcycleService = new MotorcycleService();
    public static void menuMotorcycle(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Thêm mới phương tiện xe máy ");
            System.out.println("2. Hiện thị phương tiện xe máy");
            System.out.println("3. Xóa phương tiện xe máy");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            int choose  = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iMotorcycleService.addMotorcycle();
                    break;
                case 2:
                    iMotorcycleService.displayMotorcycle();
                    break;
                case 3:
                    iMotorcycleService.deleteMotorcycle();
                    break;
                case 4:
                    iMotorcycleService.searchMotorcycle();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
