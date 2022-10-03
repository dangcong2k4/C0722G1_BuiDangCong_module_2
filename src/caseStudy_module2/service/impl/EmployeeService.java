package caseStudy_module2.service.impl;

import caseStudy_module2.model.person.Employee;
import caseStudy_module2.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    @Override
    public void edit() {
        System.out.println("nhập mã nhân viên cần chỉnh sửa ");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getCode().equals(id)) {
                System.out.println("hãy nhập tên nhân viên :");
                String name = scanner.nextLine();
                employeeList.get(i).setName(name);
                System.out.println("hãy nhập ngày tháng năm sinh :");
                String birthday = scanner.nextLine();
                employeeList.get(i).setBirthday(birthday);
                System.out.println("hãy nhập độ tuổi :");
                String age = scanner.nextLine();
                employeeList.get(i).setAge(age);
                System.out.println("nhập số CMND/CCCD :");
                String idNumber = scanner.nextLine();
                employeeList.get(i).setIdNumber(idNumber);
                System.out.println("nhập số điện thoại :");
                String phoneNumber = scanner.nextLine();
                employeeList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("hãy nhập gmail :");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);
                System.out.println("chọn trình độ học vấn :");
                String level = "";
                int option;
                while (true){
                    try {
                        System.out.println("1. trung cấp ");
                        System.out.println("2. cao đẳng ");
                        System.out.println("3. đại học ");
                        System.out.println("4. sau đại học ");
                        option = Integer.parseInt(scanner.nextLine());
                        switch (option) {
                            case 1:
                                level = "trung cấp";
                                break;
                            case 2:
                                level = "cao đẳng";
                                break;
                            case 3:
                                level = "đại học";
                                break;
                            case 4:
                                level = "sau đại học";
                                break;
                        }
                        if (option!=1 && option!=2 && option!=3 && option!=4){
                            throw new IllegalArgumentException("hãy chọn 1 trong 4 trình độ trên ");
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());;
                    }
                }
                employeeList.get(i).setLevel(level);

                System.out.println("chọn vị trí chức vụ :");
                String position = "";

                System.out.println("1. Lễ tân");
                System.out.println("2. phục vụ");
                System.out.println("3. chuyên viên");
                System.out.println("4. giám sát");
                System.out.println("5. quản lý");
                System.out.println("6. giám đốc");
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        position = "trung cấp";
                        break;
                    case 2:
                        position = "cao đẳng";
                        break;
                    case 3:
                        position = "đại học";
                        break;
                    case 4:
                        position = "sau đại học";
                        break;
                }
                employeeList.get(i).setPosition(position);
                System.out.println("nhập lương của nhân viên :");
                double wage = Double.parseDouble(scanner.nextLine());
                employeeList.get(i).setWage(wage);
            }else {
                count++;
            }
        }
        if (count==employeeList.size()){
            System.out.println("không tìm thấy mã nhân viên ");
        }
    }

    @Override
    public void display() {
        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        employeeList.add(infoEmployee());
        System.out.println("thêm nhân viên thành công ");
    }

    public Employee infoEmployee(){
        System.out.println("hãy nhập mã nhân viên :");
        String code = scanner.nextLine();
        System.out.println("hãy nhập tên nhân viên :");
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
        System.out.println("chọn trình độ học vấn :");
        String level = "";
        int option;
        while (true){
            try {
                System.out.println("1. trung cấp ");
                System.out.println("2. cao đẳng ");
                System.out.println("3. đại học ");
                System.out.println("4. sau đại học ");
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        level = "trung cấp";
                        break;
                    case 2:
                        level = "cao đẳng";
                        break;
                    case 3:
                        level = "đại học";
                        break;
                    case 4:
                        level = "sau đại học";
                        break;
                }
                if (option!=1 && option!=2 && option!=3 && option!=4){
                    throw new IllegalArgumentException("hãy chọn 1 trong 4 trình độ trên ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());;
            }
        }
        System.out.println("chọn vị trí chức vụ :");
        String position = "";
        while (true){
            try {
                System.out.println("1. Lễ tân");
                System.out.println("2. phục vụ");
                System.out.println("3. chuyên viên");
                System.out.println("4. giám sát");
                System.out.println("5. quản lý");
                System.out.println("6. giám đốc");
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        position = "Lễ tân";
                        break;
                    case 2:
                        position = "phục vụ";
                        break;
                    case 3:
                        position = "chuyên viên";
                        break;
                    case 4:
                        position = "giám sát";
                        break;
                    case 5:
                        position = "quản lý";
                        break;
                    case 6:
                        position = "giám đốc";
                        break;
                }
                if (option!=1 && option!=2 && option!=3 && option!=4 &&option!=5 && option!=6 ) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 6 chức vụ trên ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhập lương của nhân viên :");
        double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(code,name,birthday,age,idNumber,phoneNumber,email,level,position,wage);
        return employee;
    }
}
