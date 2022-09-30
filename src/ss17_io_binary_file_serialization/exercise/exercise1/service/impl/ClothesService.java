package ss17_io_binary_file_serialization.exercise.exercise1.service.impl;

import ss17_io_binary_file_serialization.exercise.exercise1.model.Clothes;
import ss17_io_binary_file_serialization.exercise.exercise1.service.IClothesService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClothesService implements IClothesService {
    private static Scanner scanner =new Scanner(System.in);
    private static List<Clothes> listClothes = new ArrayList<>();
    @Override
    public void AddClothes() {
        listClothes = readFileClothes();
        listClothes.add(inFoClothes());
        System.out.println("thêm mới thành công ");
        writeFileClothes(listClothes);
    }


    @Override
    public void DisplayClothes() {
        listClothes = readFileClothes();
        for (Clothes clothes:listClothes) {
            System.out.println(clothes.toString());
        }
    }

    @Override
    public void SearchClothes() {

    }
    public Clothes inFoClothes(){
        System.out.println("nhập mã sản phẩm :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm :");
        String nameClothes = scanner.nextLine();
        System.out.println("nhập hãng sản xuất :");
        String manufacturer = scanner.nextLine();
        System.out.println("nhập giá bán :");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập màu sắc :");
        String color = scanner.nextLine();
        System.out.println("nhập kích thước :\n"+
                "1. size S\n"+
                "2. size M\n"+
                "3. size L\n"+
                "4. size XL");
        String size = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                size ="S";
                break;
            case 2:
                size ="M";
                break;
            case 3:
                size ="L";
                break;
            case 4:
                size ="XL";
                break;
        }
        Clothes clothes = new Clothes(id,nameClothes,manufacturer,price,color,size);
        return clothes;

    }


    private List<Clothes> readFileClothes(){
        FileInputStream file = null;
        List<Clothes> clothesList = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        try {
            file  = new FileInputStream("src\\ss17_io_binary_file_serialization\\exercise\\exercise1\\data\\fileClothes");
            objectInputStream = new ObjectInputStream(file);

            clothesList= (List<Clothes>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException |NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return clothesList;
    }

    private void writeFileClothes(List<Clothes> clothes1){
        ObjectOutputStream objectOutputStream = null;
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_io_binary_file_serialization\\exercise\\exercise1\\data\\fileClothes");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(clothes1);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getInfo(Clothes clothes){
        return String.format("%s,%s,%s,%s,%s,%s",clothes.getProductCode(),clothes.getProductName(),clothes.getManufacturer(),clothes.getPrice(),clothes.getColor(),clothes.getSize());
    }
}
