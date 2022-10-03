package caseStudy_module2.controller;

import caseStudy_module2.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController<iEmployeeService> {
    private static EmployeeService iEmployeeService = new EmployeeService();
    public static void menuEmployee(){
        Scanner scanner = new Scanner(System.in);
        do {
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

                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
