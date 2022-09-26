package additional_exercise2.model;

public class Car extends vehicle{
    private String soChoNgoi;
    private String kieuXe;

    public Car() {
    }

    public Car(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, String congSuat) {
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+
                "soChoNgoi='" + soChoNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
