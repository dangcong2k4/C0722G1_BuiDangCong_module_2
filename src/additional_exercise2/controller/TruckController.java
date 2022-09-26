package additional_exercise2.controller;

import additional_exercise2.service.ITruckService;
import additional_exercise2.service.implement.TruckService;

import java.util.Scanner;

public class TruckController {
private static ITruckService iTruckService = new TruckService();
public static void menuTruck(){
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("1. Thêm mới phương tiện xe tải ");
        System.out.println("2. Hiện thị phương tiện xe tải ");
        System.out.println("3. Xóa phương tiện xe tải ");
        System.out.println("4. Tìm kiếm theo biển kiểm soát");
        System.out.println("5. Thoát");
        int choose  = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                iTruckService.addTruck();
                break;
            case 2:
                iTruckService.displayTruck();
                break;
            case 3:
                iTruckService.deleteTruck();
                break;
            case 4:
                iTruckService.searchTruck();
                break;
            case 5:
                return;
        }
    }while (true);
}
}
