package examination.service.impl;

import additional_exercise1.model.Student;
import examination.model.PaymentAccount;
import examination.model.SavingAccount;
import examination.service.ISavingAccount;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingAccountService implements ISavingAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static List<SavingAccount> savingAccounts = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void addSaving() {
        savingAccounts = getSavingFromFile();
        savingAccounts.add(inFoSaving());
        System.out.println("thêm tài khoản thành công ");
        writeFile(savingAccounts);
    }


    @Override
    public void deleteSaving() {
        savingAccounts = getSavingFromFile();
        System.out.println("nhập ID tài khoản cần xóa ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flagDelete = false;
        for (int i = 0; i < savingAccounts.size(); i++) {
            if(savingAccounts.get(i).getIdAccount() == id){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    savingAccounts.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete =true;
                break;
            }

        }
        if(!flagDelete){
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        writeFile(savingAccounts);
    }

    @Override
    public void displaySaving() {
        savingAccounts = getSavingFromFile();
        for (SavingAccount savingAccount: savingAccounts) {
            System.out.println(savingAccount);
        }
        writeFile(savingAccounts);
    }

    @Override
    public void searchSaving() {
        savingAccounts = getSavingFromFile();
        System.out.println("Nhập ID tài khoản cần tìm:");
        int idAccount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < savingAccounts.size(); i++) {
            if(savingAccounts.get(i).getIdAccount()==idAccount){
                System.out.println(savingAccounts.get(i));
            }
        }
    }
    private SavingAccount inFoSaving() {

        System.out.println("nhập ID tài khoản");
        int idAccount = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mã tài khoản ");
        String codeAccount = scanner.nextLine();
        System.out.println("nhập tên chủ tài khoản ");
        String nameAccount = scanner.nextLine();
        System.out.println("nhập ngày tạo tài khoản ");
        LocalDate dateAccount = LocalDate.parse(scanner.nextLine(),formatter);
        System.out.println("nhập số tiền gủi tiết kiệm");
        double moneySaving = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập ngày gửi tiết kiệm");
        LocalDate dateSaving = LocalDate.parse(scanner.nextLine(),formatter);
        System.out.println("nhập lãi suất");
        double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập kỳ hạn (số tháng )");
        int numberMonths = Integer.parseInt(scanner.nextLine());
        SavingAccount savingAccount = new SavingAccount(idAccount,codeAccount,nameAccount,dateAccount,moneySaving,dateSaving,interestRate,numberMonths);
        return savingAccount;
    }
    private List<SavingAccount> getSavingFromFile() {
        FileReader file = null;
        List<SavingAccount> savingAccounts = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader("src\\examination\\data\\savingAccount.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            SavingAccount savingAccount;
            while ((line = bufferedReader.readLine())!=null) {
                info = line.split(",");
                savingAccount = new SavingAccount(Integer.parseInt(info[0]),info[1],info[2],LocalDate.parse(info[3]),Double.parseDouble(info[4]),LocalDate.parse(info[5]),Double.parseDouble(info[6]),Integer.parseInt(info[7]));
                savingAccounts.add(savingAccount);
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
        return savingAccounts;
    }

    private void writeFile(List<SavingAccount> savingAccounts) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("src\\examination\\data\\savingAccount.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SavingAccount savingAccount: savingAccounts) {
                bufferedWriter.write(getInfo(savingAccount));
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

    private String getInfo(SavingAccount savingAccount) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",savingAccount.getIdAccount(),savingAccount.getCodeAccount(),savingAccount.getNameAccount(),savingAccount.getDateAccount(),savingAccount.getMoneySaving(),savingAccount.getDateSaving(),savingAccount.getInterestRate(),savingAccount.getNumberMonths());

    }


}
