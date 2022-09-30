package ss17_io_binary_file_serialization.exercise.exercise1.model;


public class Clothes extends Product  {
    private String color;
    private String size;

    public Clothes() {
    }

    public Clothes(int productCode, String productName, String manufacturer, double price, String color, String size) {
        super(productCode, productName, manufacturer, price);
        this.color = color;
        this.size = size;
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

    @Override
    public String toString() {
        return "Clothes{" + super.toString() +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
