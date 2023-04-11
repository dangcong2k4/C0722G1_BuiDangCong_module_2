package examination.view;


import examination.controller.PaymentAccountController;
import examination.controller.SavingAccountController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {

            System.out.println("1. kiểm tra tài khoản thanh toán ");
            System.out.println("2. kiểm tra tài khoản tiết kiệm ");
            System.out.println("3. kết thúc ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    PaymentAccountController.menuPaymentAccount();
                    break;
                case 2:
                    SavingAccountController.menuSavingAccount();
                    break;
                case 3:
                    System.out.println("kết thúc chương trình quản lý ngân hàng ");
                    return ;
            }
        }while (true);
    }
}
