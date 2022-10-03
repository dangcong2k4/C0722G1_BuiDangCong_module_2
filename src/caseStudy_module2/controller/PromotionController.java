package caseStudy_module2.controller;

import java.util.Scanner;

public class PromotionController {
    public static void menuAdvertisement(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ");
            System.out.println("2. Hiển thị danh sách khách hàng nhận được voucher");
            System.out.println("3. Trở lại menu chính");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
