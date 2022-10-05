package caseStudy_module2.controller;

import caseStudy_module2.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController<iFacilityService>{
    private static FacilityService iFacilityService = new FacilityService();
    public static void menuBasis(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("1 Cơ sở danh sách hiển thị");
                System.out.println("2 Thêm cơ sở mới");
                System.out.println("3 Hiển thị danh sách bảo trì cơ sở");
                System.out.println("4 Trở lại menu chính");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        iFacilityService.display();
                        break;
                    case 2:
                        iFacilityService.add();
                        break;
                    case 3:
                        iFacilityService.maintenance();
                        break;
                    case 4:
                        return;
                }
                if (option!=1 && option!=2 && option!=3 ) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 4 chức năng trên");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
    }

}
