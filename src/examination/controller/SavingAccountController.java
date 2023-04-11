package examination.controller;

import examination.service.ISavingAccount;

import examination.service.impl.SavingAccountService;

import java.util.Scanner;

public class SavingAccountController {
    private static ISavingAccount iSavingAccount = new SavingAccountService();
    public static void menuSavingAccount(){
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
                    iSavingAccount.addSaving();
                    break;
                case 2:
                    iSavingAccount.deleteSaving();
                    break;
                case 3:
                    iSavingAccount.displaySaving();
                    break;
                case 4:
                    iSavingAccount.searchSaving();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }

}
