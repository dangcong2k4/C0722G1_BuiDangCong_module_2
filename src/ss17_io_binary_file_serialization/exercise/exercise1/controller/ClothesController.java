package ss17_io_binary_file_serialization.exercise.exercise1.controller;

import ss17_io_binary_file_serialization.exercise.exercise1.service.IClothesService;
import ss17_io_binary_file_serialization.exercise.exercise1.service.impl.ClothesService;

import java.util.Scanner;

public class ClothesController<iClothesService> {
    private static IClothesService iClothesService = new ClothesService();
    public static void MenuClothes(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Hiển thị sản phẩm ");
            System.out.println("3. tìm kiếm thông tin sản phẩm ");
            System.out.println("4. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iClothesService.AddClothes();
                    break;
                case 2:
                    iClothesService.DisplayClothes();
                    break;
                case 3:
                    iClothesService.SearchClothes();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
