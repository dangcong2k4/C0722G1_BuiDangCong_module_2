package caseStudy_module2.service.impl;

import caseStudy_module2.model.person.Customer;
import caseStudy_module2.model.resort.Facility;
import caseStudy_module2.model.resort.House;
import caseStudy_module2.model.resort.Room;
import caseStudy_module2.model.resort.Villa;
import caseStudy_module2.service.IFacilityService;

import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    @Override
    public void add() {
        while (true){
            try {
                System.out.println("1. thêm mới Vila");
                System.out.println("2. thêm mới House");
                System.out.println("3. thêm mới Room");
                System.out.println("4. thoát");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        villaMap = getVillaFromFile();
                        Villa villa = this.infoVilla();
                        villaMap.put(villa,0);
                        writeVillaFile(villaMap);
                        System.out.println("thêm thành công");

                        break;
                    case 2:
                        House house = this.infoHouse();
                        houseMap.put(house,0);
                        System.out.println("thêm thành công");
                        break;
                    case 3:
                        Room room = this.infoRoom();
                        roomMap.put(room,0);
                        System.out.println("thêm thành công");
                        break;
                    case 4:
                        return;
                }
                if (option!=1 && option!=2 && option!=3){
                    throw new IllegalArgumentException("hãy chọn 1 trong 4 chức năng trên");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public void display() {

        while (true){
            try {
                System.out.println("1. hiện thị danh sách Villa");
                System.out.println("2. hiện thị danh sách House");
                System.out.println("3. hiện thị danh sách Room");
                System.out.println("4. thoát");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        villaMap = getVillaFromFile();
                        Set<Villa> villas;
                        villas = villaMap.keySet();
                        for (Villa villa: villas) {
                            System.out.println(villa.toString());
                        }
                        break;
                    case 2:
                        Set<House> houses;
                        houses = houseMap.keySet();
                        for (House house:houses) {
                            System.out.println(house.toString());
                        }
                        break;
                    case 3:
                        Set<Room> rooms;
                        rooms = roomMap.keySet();
                        for (Room room:rooms) {
                            System.out.println(room.toString());
                        }
                        break;
                    case 4:
                        return;
                }
                if (option!=1 && option!=2 && option!=3) {
                    throw new IllegalArgumentException("hãy chọn 1 trong 4 chức năng trên");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void maintenance() {

    }
    public Villa infoVilla(){
        System.out.println("nhập tên dịch vụ");
        String service;
        while (true){
            try {
                service = scanner.nextLine();
                if (!service.matches("^([a-z]+[ ])+[a-z]+$")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng tên dịch vụ ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage() );
            }
        }
        System.out.println("nhập diện tích sự dụng m^2");
        double usableArea;
        while (true){
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                while (usableArea < 20){
                    System.out.println("diện tích sử dụng phải lớn hơn 20 m^2");
                    usableArea = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập chi phí thuê (VND)");
        double cost;
        while (true){
            try {
                cost = Double.parseDouble(scanner.nextLine());
                while (cost <= 2000000){
                    System.out.println("chi phí thuê phải lớn hơn 20 triệu đồng ");
                    cost = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số lượng người tối đa");
        int amountPeople;
        while (true){
            try {
                amountPeople = Integer.parseInt(scanner.nextLine());
                while (amountPeople <1){
                    System.out.println("số lượng người phải là số nguyên dương ");
                    amountPeople = Integer.parseInt(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập kiểu thuê");
        String rentStyle = "";
        while (true){
            try {
                System.out.println("1. thuê theo năm");
                System.out.println("2. thuê theo tháng ");
                System.out.println("3. thuê theo ngày ");
                System.out.println("4. thuê theo giờ ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        rentStyle = "thuê theo năm";
                    case 2:
                        rentStyle = "thuê theo tháng";
                    case 3:
                        rentStyle = "thuê theo ngày";
                    case 4:
                        rentStyle = "thuê theo giờ";
                }
                if (option!=1 && option!=2 && option!=3 && option!=4) {
                    throw new IllegalArgumentException("hãy nhập 1 trong 4 chức năng trên");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println("hãy nhập bằng chữ số ");
            }
        }
        System.out.println("nhập tiêu chuẩn phòng ");
        String roomStandard;
        while (true){
            try {
                roomStandard = scanner.nextLine();
                if (!roomStandard.matches("^[a-z 0-9]+$")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng,VD:1 sao ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage() );
            }
        }
        System.out.println("nhập diện tích hồ bơi");
        double poolArea;
        while (true){
            try {
                poolArea = Double.parseDouble(scanner.nextLine());
                while (poolArea < 10){
                    System.out.println("diện tích hồ bơi phải lớn hơn 10 m^2");
                    poolArea = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số tầng");
        int numberFloors;
        while (true){
            try {
                numberFloors = Integer.parseInt(scanner.nextLine());
                while (numberFloors <1){
                    System.out.println("số tầng phải là số nguyên dương ");
                    numberFloors = Integer.parseInt(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        Villa villa = new Villa(service,usableArea,cost,amountPeople,rentStyle,roomStandard,poolArea,numberFloors);
        return villa;
    }
    public House infoHouse(){
        System.out.println("nhập tên dịch vụ");
        String service ;
        while (true){
            try {
                service = scanner.nextLine();
                if (!service.matches("^([a-z]+[ ])+[a-z]+$")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng tên dịch vụ ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage() );
            }
        }
        System.out.println("nhập diện tích sự dụng");
        double usableArea;
        while (true){
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                while (usableArea < 20){
                    System.out.println("diện tích sử dụng phải lớn hơn 20 m^2");
                    usableArea = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập chi phí thuê ");
        double cost ;
        while (true){
            try {
                cost = Double.parseDouble(scanner.nextLine());
                while (cost <= 2000000){
                    System.out.println("chi phí thuê phải lớn hơn 20 triệu đồng ");
                    cost = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số lượng người tối đa");
        int amountPeople;
        while (true){
            try {
                amountPeople = Integer.parseInt(scanner.nextLine());
                while (amountPeople <1){
                    System.out.println("số lượng người phải là số nguyên dương ");
                    amountPeople = Integer.parseInt(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập kiểu thuê");
        String rentStyle = "";
        while (true){
            try {
                System.out.println("1. thuê theo năm");
                System.out.println("2. thuê theo tháng ");
                System.out.println("3. thuê theo ngày ");
                System.out.println("4. thuê theo giờ ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        rentStyle = "thuê theo năm";
                    case 2:
                        rentStyle = "thuê theo tháng";
                    case 3:
                        rentStyle = "thuê theo ngày";
                    case 4:
                        rentStyle = "thuê theo giờ";
                }
                if (option!=1 && option!=2 && option!=3 && option!=4) {
                    throw new IllegalArgumentException("hãy nhập 1 trong 4 chức năng trên");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println("hãy nhập bằng chữ số ");
            }
        }
        System.out.println("nhập tiêu chuẩn phòng ");
        String roomStandard;
        while (true){
            try {
                roomStandard = scanner.nextLine();
                if (!roomStandard.matches("^[a-z 0-9]+$")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng,VD:1 sao ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage() );
            }
        }
        System.out.println("nhập số tầng");
        int numberFloors ;
        while (true){
            try {
                numberFloors = Integer.parseInt(scanner.nextLine());
                while (numberFloors <1){
                    System.out.println("số tầng phải là số nguyên dương ");
                    numberFloors = Integer.parseInt(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        House house = new House(service,usableArea,cost,amountPeople,rentStyle,roomStandard,numberFloors);
        return house;
    }
    public Room infoRoom(){
        System.out.println("nhập tên dịch vụ");
        String service;
        while (true){
            try {
                service = scanner.nextLine();
                if (!service.matches("^([a-z]+[ ])+[a-z]+$")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng tên dịch vụ ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage() );
            }
        }
        System.out.println("nhập diện tích sự dụng");
        double usableArea ;
        while (true){
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                while (usableArea < 20){
                    System.out.println("diện tích sử dụng phải lớn hơn 20 m^2");
                    usableArea = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập chi phí thuê ");
        double cost;
        while (true){
            try {
                cost = Double.parseDouble(scanner.nextLine());
                while (cost <= 2000000){
                    System.out.println("chi phí thuê phải lớn hơn 20 triệu đồng ");
                    cost = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số lượng người tối đa");
        int amountPeople;
        while (true){
            try {
                amountPeople = Integer.parseInt(scanner.nextLine());
                while (amountPeople <1){
                    System.out.println("số lượng người phải là số nguyên dương ");
                    amountPeople = Integer.parseInt(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("hãy nhập bằng số");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập kiểu thuê");
        String rentStyle = "";
        while (true){
            try {
                System.out.println("1. thuê theo năm");
                System.out.println("2. thuê theo tháng ");
                System.out.println("3. thuê theo ngày ");
                System.out.println("4. thuê theo giờ ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        rentStyle = "thuê theo năm";
                    case 2:
                        rentStyle = "thuê theo tháng";
                    case 3:
                        rentStyle = "thuê theo ngày";
                    case 4:
                        rentStyle = "thuê theo giờ";
                }
                if (option!=1 && option!=2 && option!=3 && option!=4) {
                    throw new IllegalArgumentException("hãy nhập 1 trong 4 chức năng trên");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println("hãy nhập bằng chữ số ");
            }
        }
        System.out.println("dịch vụ miễn phí đi kèm");
        String freeService;
        while (true){
            try {
                freeService = scanner.nextLine();
                if (!freeService.matches("[a-z ]+")){
                    throw new IllegalArgumentException("hãy nhập đúng định dạng ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        Room room = new Room(service,usableArea,cost,amountPeople,rentStyle,freeService);
        return room;
    }
    private Map<Villa, Integer> getVillaFromFile() {
        FileReader file ;
        Map<Villa, Integer> villas = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader("src\\caseStudy_module2\\data\\villaFile.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            Villa villa;
            while ((line = bufferedReader.readLine())!=null) {
                info = line.split(",");
                villa = new Villa(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],Double.parseDouble(info[6]),Integer.parseInt(info[7]));
                villas.put(villa,0);
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
        return villas;
    }
    private void writeVillaFile(Map<Villa, Integer> villaMap) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("src\\caseStudy_module2\\data\\villaFile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villas;
            villas = villaMap.keySet();
            for (Villa villa:villas) {
                bufferedWriter.write(getInfoVilla(villa));
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
    private String getInfoVilla(Villa villa) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",villa.getService(),villa.getUsableArea(),villa.getCost(),villa.getAmountPeople(),villa.getRentStyle(),villa.getRoomStandard(),villa.getPoolArea(),villa.getNumberFloors());
    }


}
