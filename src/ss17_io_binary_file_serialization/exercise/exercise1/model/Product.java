package ss17_io_binary_file_serialization.exercise.exercise1.model;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private int ProductCode;
    private String ProductName;
    private String Manufacturer;
    private double Price;

    public Product() {
    }

    public Product(int productCode, String productName, String manufacturer, double price) {
        ProductCode = productCode;
        ProductName = productName;
        Manufacturer = manufacturer;
        Price = price;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "ProductCode=" + ProductCode +
                ", ProductName='" + ProductName + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Price=" + Price ;
    }

}
