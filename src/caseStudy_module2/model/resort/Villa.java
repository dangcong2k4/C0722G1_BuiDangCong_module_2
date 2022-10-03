package caseStudy_module2.model.resort;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String service, String usableArea, double cost, String amountPeople, String rentStyle, String roomStandard, String poolArea, String numberFloors) {
        super(service, usableArea, cost, amountPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
