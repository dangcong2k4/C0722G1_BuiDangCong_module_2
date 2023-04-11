package caseStudy_module2.model.resort;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String service, String serviceCode, double usableArea, double cost, int amountPeople, String rentStyle, String roomStandard, int numberFloors) {
        super(service, serviceCode, usableArea, cost, amountPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
