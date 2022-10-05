package caseStudy_module2.model.resort;

public abstract class Facility {
    private String service;
    private double usableArea;
    private double cost;
    private int AmountPeople;
    private String rentStyle;

    public Facility() {
    }

    public Facility(String service, double usableArea, double cost, int amountPeople, String rentStyle) {
        this.service = service;
        this.usableArea = usableArea;
        this.cost = cost;
        AmountPeople = amountPeople;
        this.rentStyle = rentStyle;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountPeople() {
        return AmountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        AmountPeople = amountPeople;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    @Override
    public String toString() {
        return
                "service='" + service + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", cost=" + cost +
                ", AmountPeople='" + AmountPeople + '\'' +
                ", rentStyle='" + rentStyle + '\'' ;
    }
}
