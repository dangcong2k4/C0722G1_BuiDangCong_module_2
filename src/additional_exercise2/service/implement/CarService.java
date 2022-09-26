package additional_exercise2.service.implement;

import additional_exercise2.model.Car;
import additional_exercise2.service.ICarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Car> listCar = new ArrayList<>();

    @Override
    public void addCar() {
        listCar.add(inFoCar());
        System.out.println("thêm mới thành công ");
    }

    @Override
    public void displayCar() {
        for (Car car:listCar) {
            System.out.println(car);
        }
    }

    @Override
    public void deleteCar() {
        System.out.println("nhập biển kiểm soát ");
        String bienSo = scanner.nextLine();

        boolean flagDelete = false;
        for (int i = 0; i < listCar.size(); i++) {
            if(listCar.get(i).getBienKiemSoat().equals(bienSo)){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    listCar.remove(i);
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
    public void searchCar() {
        System.out.println("nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                System.out.println(listCar.get(i));
                break;
            }
        }

    }

    public Car inFoCar(){
        System.out.println("nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập tên hãng xe :");
        String tenHang = scanner.nextLine();
        System.out.println("nhập năm sản xuất :");
        String namSanXuat = scanner.nextLine();
        System.out.println("nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập số chỗ ngồi :");
        String soChoNgoi = scanner.nextLine();
        System.out.println("chọn kiểu xe:");
        String kieuXe = "" ;
        int choose;
        do {
            System.out.println("1. kiểu xe: du lịch ");
            System.out.println("2. kiểu xe: xe khách ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    kieuXe = "du lịch ";
                    break;
                case 2:
                    kieuXe = "xe khách ";
                    break;
            }
        }while (choose<1 || choose>2);
        Car car = new Car(bienKiemSoat,tenHang,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        return  car;
    }
}
