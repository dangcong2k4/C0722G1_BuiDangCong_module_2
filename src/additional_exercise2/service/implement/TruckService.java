package additional_exercise2.service.implement;

import additional_exercise2.model.Motorcycle;
import additional_exercise2.model.Truck;
import additional_exercise2.service.ITruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Truck> truckList = new ArrayList<>();

    @Override
    public void addTruck() {
        truckList.add(inFoTrack());
        System.out.println("thêm mới thành công ");
    }

    @Override
    public void displayTruck() {
        for (Truck truck:truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void deleteTruck() {
        System.out.println("nhập biển kiểm soát ");
        String bienSo = scanner.nextLine();

        boolean flagDelete = false;
        for (int i = 0; i < truckList.size(); i++) {
            if(truckList.get(i).getBienKiemSoat().equals(bienSo)){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    truckList.remove(i);
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
    public void searchTruck() {
        System.out.println("nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                System.out.println(truckList.get(i));
                break;
            }
        }
    }

    public Truck inFoTrack(){
        System.out.println("nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập tên hãng xe :");
        String tenHang = scanner.nextLine();
        System.out.println("nhập năm sản xuất :");
        String namSanXuat = scanner.nextLine();
        System.out.println("nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập trọng tải của xe :");
        String trongTai = scanner.nextLine();

        Truck truck = new Truck(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, trongTai);
        return truck;
    }
}
