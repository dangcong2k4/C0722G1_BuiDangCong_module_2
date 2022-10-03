package caseStudy_module2.controller;

import java.util.Scanner;

public class BookingController {
    public static void menuReservations(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm đặt chỗ mới");
            System.out.println("2. Hiển thị danh sách đặt chỗ");
            System.out.println("3. Tạo các co thắt mới");
            System.out.println("4. Hiển thị hợp đồng danh sách");
            System.out.println("5. Chỉnh sửa hợp đồng");
            System.out.println("6. Trở lại menu chính");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    return;
            }
        }while (true);
    }
}
