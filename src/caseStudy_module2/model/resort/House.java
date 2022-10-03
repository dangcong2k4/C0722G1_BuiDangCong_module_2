package caseStudy_module2.model.resort;

public class House extends Facility {
    private String roomStandard;
    private String numberFloors;

    public House() {
    }

    public House(String service, String usableArea, double cost, String amountPeople, String rentStyle, String roomStandard, String numberFloors) {
        super(service, usableArea, cost, amountPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
