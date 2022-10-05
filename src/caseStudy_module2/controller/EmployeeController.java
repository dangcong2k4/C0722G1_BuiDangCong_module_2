package caseStudy_module2.controller;

import caseStudy_module2.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController<iEmployeeService> {
    private static EmployeeService iEmployeeService = new EmployeeService();
    public static void menuEmployee(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("1 Danh sách hiển thị nhân viên");
                System.out.println("2 Thêm nhân viên mới");
                System.out.println("3 Chỉnh sửa nhân viên");
                System.out.println("4 Trở lại menu chính");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        iEmployeeService.display();
                        break;
                    case 2:
                        iEmployeeService.add();
                        break;
                    case 3:
                        iEmployeeService.edit();
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
