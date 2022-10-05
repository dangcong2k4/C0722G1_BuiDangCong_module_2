package caseStudy_module2.service.impl;

import caseStudy_module2.model.person.Employee;
import caseStudy_module2.service.IEmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void edit() {
        employeeList = getEmployeeFromFile();
        System.out.println("nhập mã nhân viên cần chỉnh sửa ");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCode().equals(id)) {
                System.out.println("hãy nhập tên nhân viên :");
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
                employeeList.get(i).setName(name);
                System.out.println("hãy nhập ngày tháng năm sinh :");
                String birthday ;
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
                employeeList.get(i).setBirthday(birthday);

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
                employeeList.get(i).setIdNumber(idNumber);
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
                employeeList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("hãy nhập gmail :");
                String email ;
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
                employeeList.get(i).setEmail(email);
                System.out.println("chọn trình độ học vấn :");
                String level = "";
                int option;
                while (true) {
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
                        if (option != 1 && option != 2 && option != 3 && option != 4) {
                            throw new IllegalArgumentException("hãy chọn 1 trong 4 trình độ trên ");
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());

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
                double wage ;
                while (true){
                    try {
                        wage = Double.parseDouble(scanner.nextLine());
                        while (wage<5000000){
                            System.out.println("hãy nhập lương của nhân viên trên 5 triệu đồng ");
                            wage = Double.parseDouble(scanner.nextLine());
                        }
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("nhập sai định dạng, hãy nhập bằng số");
                    }
                }
                employeeList.get(i).setWage(wage);
            } else {
                count++;
            }
        }
        if (count == employeeList.size()) {
            System.out.println("không tìm thấy mã nhân viên ");
        }
        writeFile(employeeList);
    }

    @Override
    public void display() {
        employeeList = getEmployeeFromFile();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        writeFile(employeeList);
    }

    @Override
    public void add() {
        employeeList = getEmployeeFromFile();
        employeeList.add(infoEmployee());
        System.out.println("thêm nhân viên thành công ");
        writeFile(employeeList);
    }


    public Employee infoEmployee() {
        System.out.println("hãy nhập mã nhân viên :");
        String code;
        while (true) {
            try {
                code = scanner.nextLine();
                if (!code.matches("^[N][V][0-9]{2}$")) {
                    throw new IllegalArgumentException("hãy nhập đúng định dạng,VD:NV01");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("hãy nhập tên nhân viên :");
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
        System.out.println("chọn trình độ học vấn :");
        String level = "";
        int option;
        while (true) {
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
                if (option != 1 && option != 2 && option != 3 && option != 4) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 4 trình độ trên ");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
        System.out.println("chọn vị trí chức vụ :");
        String position = "";
        while (true) {
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
                if (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 6 chức vụ trên ");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhập lương của nhân viên :");
        double wage;
        while (true){
            try {
                wage = Double.parseDouble(scanner.nextLine());
                while (wage<5000000){
                    System.out.println("hãy nhập lương của nhân viên trên 5 triệu đồng ");
                    wage = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập sai định dạng, hãy nhập bằng số");
            }
        }
        Employee employee = new Employee(code, name, birthday, idNumber, phoneNumber, email, level, position, wage);
        return employee;
    }

    private List<Employee> getEmployeeFromFile() {
        FileReader file;
        List<Employee> employeeList1 = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader("src\\caseStudy_module2\\data\\employeeFile.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                employee = new Employee(info[0], info[1], info[2], info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9]));
                employeeList1.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList1;
    }

    private void writeFile(List<Employee> employeeList) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("src\\caseStudy_module2\\data\\employeeFile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(getInfo(employee));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getInfo(Employee employee) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", employee.getCode(), employee.getName(), employee.getBirthday(), employee.getIdNumber(), employee.getPhoneNumber(), employee.getEmail(), employee.getLevel(), employee.getPosition(), employee.getWage());
    }


}
