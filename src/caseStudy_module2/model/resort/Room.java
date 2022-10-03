package caseStudy_module2.model.resort;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String service, String usableArea, double cost, String amountPeople, String rentStyle, String freeService) {
        super(service, usableArea, cost, amountPeople, rentStyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
