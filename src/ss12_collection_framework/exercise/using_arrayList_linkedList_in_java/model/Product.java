package ss12_collection_framework.exercise.using_arrayList_linkedList_in_java.model;

public abstract class Product {
    private String color;
    private String size;
    private String fabricMaterial;

    public Product() {
    }

    public Product(String color, String size, String fabricMaterial) {
        this.color = color;
        this.size = size;
        this.fabricMaterial = fabricMaterial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabricMaterial() {
        return fabricMaterial;
    }

    public void setFabricMaterial(String fabricMaterial) {
        this.fabricMaterial = fabricMaterial;
    }

    @Override
    public String toString() {
        return ",color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", fabricMaterial='" + fabricMaterial +'\'';
    }
}
