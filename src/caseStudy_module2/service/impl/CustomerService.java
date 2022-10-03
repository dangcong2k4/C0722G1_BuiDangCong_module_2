package caseStudy_module2.service.impl;

import caseStudy_module2.model.person.Customer;
import caseStudy_module2.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public void edit() {
        System.out.println("nhập mã khách hàng cần chỉnh sửa ");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getCode().equals(id)) {
                System.out.println("hãy nhập tên khách hàng :");
                String name = scanner.nextLine();
                customerList.get(i).setName(name);
                System.out.println("hãy nhập ngày tháng năm sinh :");
                String birthday = scanner.nextLine();
                customerList.get(i).setBirthday(birthday);
                System.out.println("hãy nhập độ tuổi :");
                String age = scanner.nextLine();
                customerList.get(i).setAge(age);
                System.out.println("nhập số CMND/CCCD :");
                String idNumber = scanner.nextLine();
                customerList.get(i).setIdNumber(idNumber);
                System.out.println("nhập số điện thoại :");
                String phoneNumber = scanner.nextLine();
                customerList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("hãy nhập gmail :");
                String email = scanner.nextLine();
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
                String address = scanner.nextLine();
                customerList.get(i).setAddress(address);
                System.out.println("sửa thông tin khách hàng thành công");
            }else {
                count++;
            }
            if (count==customerList.size()) {
                System.out.println("không tìm thấy mã khách hàng");
            }
        }
    }

    @Override
    public void display() {
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        customerList.add(infoCustomer());
        System.out.println("thêm khách hàng thành công ");
    }
    public Customer infoCustomer(){
        System.out.println("hãy nhập mã khách hàng :");
        String code = scanner.nextLine();
        System.out.println("hãy nhập tên khách hàng :");
        String name = scanner.nextLine();
        System.out.println("hãy nhập ngày tháng năm sinh :");
        String birthday = scanner.nextLine();
        System.out.println("hãy nhập độ tuổi :");
        String age = scanner.nextLine();
        System.out.println("nhập số CMND/CCCD :");
        String idNumber = scanner.nextLine();
        System.out.println("nhập số điện thoại :");
        String phoneNumber = scanner.nextLine();
        System.out.println("hãy nhập gmail :");
        String email = scanner.nextLine();
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
        String address = scanner.nextLine();

        Customer customer = new Customer(code,name,birthday,age,idNumber,phoneNumber,email,typeOfGuest,address);
        return customer;
    }
}
