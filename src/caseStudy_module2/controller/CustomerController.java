package caseStudy_module2.controller;

import caseStudy_module2.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController<iCustomerService> {
    private static CustomerService iCustomerService = new CustomerService();
    public static void menuCustomer(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Hiển thị danh sách khách hàng");
            System.out.println("2. Thêm khách hàng mới");
            System.out.println("3. Chỉnh sửa khách hàng");
            System.out.println("4. Trở lại menu chính");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
