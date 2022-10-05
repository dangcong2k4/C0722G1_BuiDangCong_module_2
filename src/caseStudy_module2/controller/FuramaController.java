package caseStudy_module2.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu (){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("1. Quản lý nhân viên");
                System.out.println("2. Quản lý khách hàng");
                System.out.println("3. Quản lý Cơ sở");
                System.out.println("4. Quản lý đặt chỗ");
                System.out.println("5. Quản lý Khuyến mãi");
                System.out.println("6. Thoát");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        EmployeeController.menuEmployee();
                        break;
                    case 2:
                        CustomerController.menuCustomer();
                        break;
                    case 3:
                        FacilityController.menuBasis();
                        break;
                    case 4:
                        BookingController.menuReservations();
                        break;
                    case 5:
                        PromotionController.menuAdvertisement();
                        break;
                    case 6:
                        return;
                }
                if (option!=1 && option!=2 &&option!=3 && option!=4 && option!=5 ) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 6 chức năng trên ");
                }
            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
                System.out.println("hãy nhập bằng chữ số ");
            }
        }


    }
}
