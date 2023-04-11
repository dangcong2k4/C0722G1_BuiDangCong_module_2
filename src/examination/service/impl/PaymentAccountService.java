package examination.service.impl;

import additional_exercise1.model.Student;
import examination.model.PaymentAccount;
import examination.model.SavingAccount;
import examination.service.IPaymentAccount;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IPaymentAccount {
    private static Scanner scanner = new Scanner(System.in);
    public static List<PaymentAccount> paymentAccounts = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Override
    public void addPayment() {
        paymentAccounts = getPaymentFromFile();
        paymentAccounts.add(infoPayment());
        System.out.println("thêm mới thành công");
        writeFile(paymentAccounts);
    }


    @Override
    public void deletePayment() {
        paymentAccounts = getPaymentFromFile();
        System.out.println("nhập ID tài khoản cần xóa ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flagDelete = false;
        for (int i = 0; i < paymentAccounts.size(); i++) {
            if(paymentAccounts.get(i).getIdAccount() == id){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    paymentAccounts.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete =true;
                break;
            }

        }
        if(!flagDelete){
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        writeFile(paymentAccounts);
    }

    @Override
    public void displayPayment() {
        paymentAccounts = getPaymentFromFile();
        for (PaymentAccount paymentAccount: paymentAccounts) {
            System.out.println(paymentAccount);
        }
        writeFile(paymentAccounts);
    }

    @Override
    public void searchPayment() {
        paymentAccounts = getPaymentFromFile();
        System.out.println("Nhập ID tài khoản cần tìm:");
        int idAccount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < paymentAccounts.size(); i++) {
            if(paymentAccounts.get(i).getIdAccount()==idAccount){
                System.out.println(paymentAccounts.get(i));
            }
        }
    }
    private PaymentAccount infoPayment() {
        System.out.println("nhập ID tài khoản ");
        int idAccount = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mã tài khoản ");
        String codeAccount = scanner.nextLine();
        System.out.println("nhập tên chủ tài khoản ");
        String nameAccount = scanner.nextLine();
        System.out.println("nhập ngày tạo tài khoản ");
        LocalDate dateAccount = LocalDate.parse(scanner.nextLine(),formatter);
        System.out.println("nhập số thẻ ");
        String numberCard = scanner.nextLine();
        System.out.println("số tiền trong tài khoản ");
        double moneyPayment = Double.parseDouble(scanner.nextLine());
        PaymentAccount paymentAccount = new PaymentAccount(idAccount,codeAccount,nameAccount,dateAccount,numberCard,moneyPayment);
        return paymentAccount;
    }

    private List<PaymentAccount> getPaymentFromFile() {
        FileReader file = null;
        List<PaymentAccount> paymentAccounts = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader("src\\examination\\data\\paymentAccount.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            PaymentAccount paymentAccount;
            while ((line = bufferedReader.readLine())!=null) {
                info = line.split(",");
                paymentAccount = new PaymentAccount(Integer.parseInt(info[0]),info[1],info[2],LocalDate.parse(info[3]),info[4],Double.parseDouble(info[5]));
                paymentAccounts.add(paymentAccount);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paymentAccounts;
    }

    private void writeFile(List<PaymentAccount> paymentAccounts) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("src\\examination\\data\\paymentAccount.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PaymentAccount paymentAccount: paymentAccounts) {
                bufferedWriter.write(getInfo(paymentAccount));
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getInfo(PaymentAccount paymentAccount) {
        return String.format("%s,%s,%s,%s,%s,%s",paymentAccount.getIdAccount(),paymentAccount.getCodeAccount(),paymentAccount.getNameAccount(),paymentAccount.getDateAccount(),paymentAccount.getNumberCard(),paymentAccount.getMoneyPayment());

    }


}
