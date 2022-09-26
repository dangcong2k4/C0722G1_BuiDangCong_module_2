package additional_exercise2.model;

public class Truck extends vehicle{
    private String trongTai;

    public Truck() {
    }

    public Truck(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString()+
                "trongTai='" + trongTai + '\'' +
                '}';
    }
}
