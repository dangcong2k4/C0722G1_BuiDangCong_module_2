package caseStudy_module2.controller;

import caseStudy_module2.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private static BookingService iBookingService = new BookingService();
    public static void menuReservations(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("1. Thêm đặt chỗ mới");
                System.out.println("2. Hiển thị danh sách đặt chỗ");
                System.out.println("3. Tạo các hợp đồng mới");
                System.out.println("4. Hiển thị hợp đồng danh sách");
                System.out.println("5. Chỉnh sửa hợp đồng");
                System.out.println("6. Trở lại menu chính");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        iBookingService.add();
                        break;
                    case 2:
                        iBookingService.display();
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
                if (option!=1 && option!=2 && option!=3 && option!=4 && option!=5 ) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 6 chức năng trên");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
