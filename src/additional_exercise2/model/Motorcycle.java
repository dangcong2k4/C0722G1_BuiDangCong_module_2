package additional_exercise2.model;

public class Motorcycle extends vehicle{
    private String congSuat;

    public Motorcycle() {
    }

    public Motorcycle(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString()+
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
