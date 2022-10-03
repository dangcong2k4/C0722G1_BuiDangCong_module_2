package caseStudy_module2.controller;

import java.util.Scanner;

public class FacilityController {
    public static void menuBasis(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 Cơ sở danh sách hiển thị");
            System.out.println("2 Thêm cơ sở mới");
            System.out.println("3 Hiển thị danh sách bảo trì cơ sở");
            System.out.println("4 Trở lại menu chính");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
