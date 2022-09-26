package additional_exercise2.service.implement;

import additional_exercise2.model.Motorcycle;
import additional_exercise2.service.IMotorcycleService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Motorcycle> motorcycleList = new ArrayList<>();

    @Override
    public void addMotorcycle() {
        motorcycleList.add(inFoMotorcycle());
        System.out.println("thêm mới thành công ");
    }

    @Override
    public void displayMotorcycle() {
        for (Motorcycle motorcycle:motorcycleList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void deleteMotorcycle() {
        System.out.println("nhập biển kiểm soát của xe máy cần xóa ");
        String bienSo = "";
        for (int i = 0; i <motorcycleList.size() ; i++) {
            if (motorcycleList.get(i).getBienKiemSoat().equals(bienSo)){
                System.out.println("bấm Y để xóa ");
                String xoa = scanner.nextLine();
                if (xoa.equals("Y")){
                    motorcycleList.remove(i);
                    System.out.println("xóa thành công ");
                    break;
                }
            }

        }
    }

    @Override
    public void searchMotorcycle() {
        System.out.println("hãy nhập biển kiểm soát của xe cần tìm ");
        String bienSo = scanner.nextLine();
        for (int i = 0; i <motorcycleList.size() ; i++) {
            if (motorcycleList.get(i).getBienKiemSoat().equals(bienSo)){
                System.out.println(motorcycleList.get(i));
                break;
            }
        }
    }


    public Motorcycle inFoMotorcycle() {
        System.out.println("nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập tên hãng xe :");
        String tenHang = scanner.nextLine();
        System.out.println("nhập năm sản xuất :");
        String namSanXuat = scanner.nextLine();
        System.out.println("nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập số công suất :");
        String congSuat = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, congSuat);
        return motorcycle;
    }
}
