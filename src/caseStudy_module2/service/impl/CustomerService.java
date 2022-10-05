package caseStudy_module2.service.impl;

import caseStudy_module2.model.person.Customer;
import caseStudy_module2.service.ICustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public void edit() {
        customerList = getCustomerFromFile();
        System.out.println("nhập mã khách hàng cần chỉnh sửa ");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getCode().equals(id)) {
                System.out.println("hãy nhập tên khách hàng :");
                String name ;
                while (true) {
                    try {
                        name = scanner.nextLine();
                        if (!name.matches("^([A-Z][a-z]+[ ])+[]A-z][a-z]+$")) {
                            throw new IllegalArgumentException("hãy nhập đúng tên bằng chữ, với chữ đầu viết hoa  ");
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setName(name);
                System.out.println("hãy nhập ngày tháng năm sinh :");
                String birthday;
                while (true) {
                    try {
                        birthday = scanner.nextLine();

                        if (!birthday.matches("^[123][0-9][/][01][0-9][/][0-9]{4}$")) {
                            throw new IllegalArgumentException("nhập ngày sinh không đúng định dạng,VD:12/12/2002");
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setBirthday(birthday);

                System.out.println("nhập số CMND/CCCD :");
                String idNumber;
                while (true){
                    try {
                        idNumber = scanner.nextLine();
                        if (!idNumber.matches("[0-9]{12}") && !idNumber.matches("[0-9]{9}")) {
                            throw new IllegalArgumentException("hãy nhập CMND với 9 số \n hoặc nhập CCCD với 12 số ");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setIdNumber(idNumber);
                System.out.println("nhập số điện thoại :");
                String phoneNumber;
                while (true){
                    try {
                        phoneNumber = scanner.nextLine();
                        if (!phoneNumber.matches("[0][0-9]{9}")) {
                            throw new IllegalArgumentException("hãy nhập số điện thoại bắt đầu từ số 0 và có 10 chữ số ");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("hãy nhập gmail :");
                String email;
                while (true){
                    try {
                        email = scanner.nextLine();
                        if (!email.matches("[a-z0-9]+[@][g][m][a][i][l][.][c][o][m]")) {
                            throw new IllegalArgumentException("hãy nhập gmail đúng định dạng có đuôi là '@gmail.com'");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setEmail(email);
                System.out.println("chọn loại khách :");
                String typeOfGuest = "";
                int option;
                while (true){
                    try {
                        System.out.println("1. Diamond");
                        System.out.println("2. Platinium");
                        System.out.println("3. Gold");
                        System.out.println("4. Silver");
                        System.out.println("5. Member");
                        option = Integer.parseInt(scanner.nextLine());
                        switch (option){
                            case 1:
                                typeOfGuest = "Diamond";
                                break;
                            case 2:
                                typeOfGuest = "Platinium";
                                break;
                            case 3:
                                typeOfGuest = "Gold";
                                break;
                            case 4:
                                typeOfGuest = "Silver";
                                break;
                            case 5:
                                typeOfGuest = "Member";
                                break;
                        }
                        if (option!=1 && option!=2 && option!=3 && option!=4 &&option!=5) {
                            throw new IllegalArgumentException("hãy chọn 1 trong 5 hạng khách trên ");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setTypeOfGuest(typeOfGuest);
                System.out.println("hãy nhập địa chỉ :");
                String address;
                while (true){
                    try {
                        address = scanner.nextLine();
                        if (!address.matches("([A-Z][a-z]+[ ][]A-z][a-z]+[-]){3}[A-Z][a-z]+[ ]+[]A-z][a-z]+")) {
                            throw new IllegalArgumentException("hãy nhập đúng cấu trúc,VD:Xóm-xã-huyện-tỉnh");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
                customerList.get(i).setAddress(address);
                System.out.println("sửa thông tin khách hàng thành công");
            }else {
                count++;
            }
            if (count==customerList.size()) {
                System.out.println("không tìm thấy mã khách hàng");
            }
        }
        writeFile(customerList);
    }

    @Override
    public void display() {
        customerList = getCustomerFromFile();
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
        writeFile(customerList);
    }

    @Override
    public void add() {
        customerList = getCustomerFromFile();
        customerList.add(infoCustomer());
        System.out.println("thêm khách hàng thành công ");
        writeFile(customerList);
    }


    public Customer infoCustomer(){
        System.out.println("hãy nhập mã khách hàng :");
        String code;
        while (true) {
            try {
                code = scanner.nextLine();
                if (!code.matches("^[K][H][0-9]{2}$")) {
                    throw new IllegalArgumentException("hãy nhập đúng định dạng,VD:KH01");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("hãy nhập tên khách hàng :");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (!name.matches("^([A-Z][a-z]+[ ])+[]A-z][a-z]+$")) {
                    throw new IllegalArgumentException("hãy nhập đúng tên bằng chữ, với chữ đầu viết hoa  ");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("hãy nhập ngày tháng năm sinh :");
        String birthday;
        while (true) {
            try {
                birthday = scanner.nextLine();

                if (!birthday.matches("^[123][0-9][/][01][0-9][/][0-9]{4}$")) {
                    throw new IllegalArgumentException("nhập ngày sinh không đúng định dạng,VD:12/12/2002");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhập số CMND/CCCD :");
        String idNumber ;
        while (true){
            try {
                idNumber = scanner.nextLine();
                if (!idNumber.matches("[0-9]{12}") && !idNumber.matches("[0-9]{9}")) {
                    throw new IllegalArgumentException("hãy nhập CMND với 9 số \n hoặc nhập CCCD với 12 số ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số điện thoại :");
        String phoneNumber ;
        while (true){
            try {
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("[0][0-9]{9}")) {
                    throw new IllegalArgumentException("hãy nhập số điện thoại bắt đầu từ số 0 và có 10 chữ số ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("hãy nhập gmail :");
        String email;
        while (true){
            try {
                email = scanner.nextLine();
                if (!email.matches("[a-z0-9]+[@][g][m][a][i][l][.][c][o][m]")) {
                    throw new IllegalArgumentException("hãy nhập gmail đúng định dạng có đuôi là '@gmail.com'");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("chọn loại khách :");
        String typeOfGuest = "";
        int option;
        while (true){
            try {
                System.out.println("1. Diamond");
                System.out.println("2. Platinium");
                System.out.println("3. Gold");
                System.out.println("4. Silver");
                System.out.println("5. Member");
                option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        typeOfGuest = "Diamond";
                        break;
                    case 2:
                        typeOfGuest = "Platinium";
                        break;
                    case 3:
                        typeOfGuest = "Gold";
                        break;
                    case 4:
                        typeOfGuest = "Silver";
                        break;
                    case 5:
                        typeOfGuest = "Member";
                        break;
                }
                if (option!=1 && option!=2 && option!=3 && option!=4 &&option!=5) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 5 hạng khách trên ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("hãy nhập địa chỉ :");
        String address;
        while (true){
            try {
                address = scanner.nextLine();
                if (!address.matches("([A-Z][a-z]+[ ][]A-z][a-z]+[-]){3}[A-Z][a-z]+[ ]+[]A-z][a-z]+")) {
                    throw new IllegalArgumentException("hãy nhập đúng cấu trúc,VD:Xóm-xã-huyện-tỉnh");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        Customer customer = new Customer(code,name,birthday,idNumber,phoneNumber,email,typeOfGuest,address);
        return customer;
    }

    private List<Customer> getCustomerFromFile() {
        FileReader file ;
        List<Customer> customerList1 = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            file = new FileReader("src\\caseStudy_module2\\data\\customerFile.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            Customer customer;
            while ((line = bufferedReader.readLine())!=null) {
                info = line.split(",");
                customer = new Customer(info[0],info[1],info[2],info[4],info[5],info[6],info[7],info[8]);
                customerList1.add(customer);
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
        return customerList1;
    }
    private void writeFile(List<Customer> customerList) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("src\\caseStudy_module2\\data\\customerFile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer: customerList) {
                bufferedWriter.write(getInfo(customer));
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

    private String getInfo(Customer customer) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",customer.getCode(),customer.getName(),customer.getBirthday(),customer.getIdNumber(),customer.getPhoneNumber(),customer.getEmail(),customer.getTypeOfGuest(),customer.getAddress());
    }


}
