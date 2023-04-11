package examination.controller;

import examination.service.IPaymentAccount;
import examination.service.impl.PaymentAccountService;

import java.util.Scanner;

public class PaymentAccountController {
    private static IPaymentAccount iPaymentAccount = new PaymentAccountService();
    public static void menuPaymentAccount(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm mới tài khoản");
            System.out.println("2. Xóa tài khoản");
            System.out.println("3. Xem danh sách tài khoản");
            System.out.println("4. tìm kiếm tài khoản bằng ID ");
            System.out.println("6. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iPaymentAccount.addPayment();
                    break;
                case 2:
                    iPaymentAccount.deletePayment();
                    break;
                case 3:
                    iPaymentAccount.displayPayment();
                    break;
                case 4:
                    iPaymentAccount.searchPayment();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
