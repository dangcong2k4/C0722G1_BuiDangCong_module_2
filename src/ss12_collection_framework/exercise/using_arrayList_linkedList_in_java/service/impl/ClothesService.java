package ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.service.impl;

import ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.model.Clothes;
import ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.service.IClothesService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ClothesService implements IClothesService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Clothes> listClothes = new ArrayList<>();
    @Override
    public void addClothesService() {
        listClothes.add(inFoClothes());
        System.out.println("thêm mới thành công ");
    }

    @Override
    public void fixClothesService() {
        System.out.println("Nhập iD cần update");
        String iD = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < listClothes.size(); i++) {
            if (listClothes.get(i).getId().equals(iD)){
                System.out.println("nhập tên sản phẩm :");
                String nameClothes = scanner.nextLine();
                listClothes.get(i).setNameClothes(nameClothes);
                System.out.println("nhập màu sắc :");
                String color = scanner.nextLine();
                listClothes.get(i).setColor(color);
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
                listClothes.get(i).setSize(size);
                System.out.println("nhập tên chất liệu :");
                String fabricMaterial = scanner.nextLine();
                listClothes.get(i).setFabricMaterial(fabricMaterial);
                System.out.println("nhập giá bán :");
                double price = Double.parseDouble(scanner.nextLine());
                listClothes.get(i).setPrice(price);

            }else {
                count++;
            }
            if (count==listClothes.size()){
                System.out.println("Không tìm thấy iD "+iD+ " để sửa ");
            }
        }
    }

    @Override
    public void deleteClothesService() {
        System.out.println("nhập id của sản phẩm cần xóa : ");
        String id = scanner.nextLine();

        boolean flagDelete = false;
        for (int i = 0; i < listClothes.size(); i++) {
            if(listClothes.get(i).getId().equals(id)){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    listClothes.remove(i);
                    System.out.println("Xóa thành công");
                }
                break;
            }
            if(!flagDelete){
                System.out.println("Không tìm thấy đối tượng cần xóa.");
            }
        }
    }

    @Override
    public void displayClothesService() {
        for (Clothes clothes:listClothes) {
            System.out.println(clothes);
        }
    }

    @Override
    public void searchClothesService() {
        System.out.println("Nhập tên sản phẩm cần tìm:");
        String nameClothes = scanner.nextLine();
        for (int i = 0; i < listClothes.size(); i++) {
            if(listClothes.get(i).getNameClothes().contains(nameClothes)){
                System.out.println(listClothes.get(i));
            }
        }

    }

    @Override
    public void sortClothesService() {
        Collections.sort(listClothes, (Clothes clothes1, Clothes clothes2)->{
            if(clothes1.getPrice() < clothes2.getPrice()){
                return -1;
            } else if(clothes1.getPrice() == clothes2.getPrice()){
                return 0;
            } else {
                return 1;
            }
        });
        displayClothesService();
    }

    public Clothes inFoClothes(){
        System.out.println("nhập tên sản phẩm :");
        String nameClothes = scanner.nextLine();
        System.out.println("nhập id sản phẩm :");
        String id = scanner.nextLine();
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
        System.out.println("nhập tên chất liệu :");
        String fabricMaterial = scanner.nextLine();
        System.out.println("nhập giá bán :");
        double price = Double.parseDouble(scanner.nextLine());
        Clothes clothes = new Clothes(nameClothes,id,color,size,fabricMaterial,price);
        return clothes;
    }

}
