package ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.model;

public class Clothes extends Product {
    private String nameClothes;
    private String id;
    private double price;



    public Clothes( String nameClothes, String id, String color, String size, String fabricMaterial, double price) {
        super(color, size, fabricMaterial);
        this.nameClothes = nameClothes;
        this.price = price;
        this.id = id;
    }


    public String getNameClothes() {
        return nameClothes;
    }

    public void setNameClothes(String nameClothes) {
        this.nameClothes = nameClothes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "nameClothes='" + nameClothes + '\'' +
                ", id='" + id + '\'' +
                super.toString()+
                ", price=" + price +
                '}';
    }
}
