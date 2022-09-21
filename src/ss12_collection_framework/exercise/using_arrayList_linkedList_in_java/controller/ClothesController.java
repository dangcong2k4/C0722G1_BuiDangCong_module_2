package ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.controller;

import ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.service.IClothesService;
import ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.service.impl.ClothesService;

import java.util.Scanner;

public class ClothesController<iClothesService> {
    private static IClothesService iClothesService = new ClothesService();
    public static void menuClothes(){

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Xoá sản phẩm ");
            System.out.println("3. Hiển thị danh sách sản phẩm ");
            System.out.println("4. Sửa thông tin sản phẩm ");
            System.out.println("5. Tìm kiếm sản phẩm ");
            System.out.println("6. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iClothesService.addClothesService();
                    break;
                case 2:
                    iClothesService.deleteClothesService();
                    break;
                case 3:
                    iClothesService.displayClothesService();
                    break;
                case 4:
                    iClothesService.fixClothesService();
                    break;
                case 5:
                    iClothesService.searchClothesService();
                case 6:
                    return;
            }
        }while (true);
    }
}
