package caseStudy_module2.model;

public class Booking {
    private String codeBooking;
    private String startDay;
    private String stopDay;
    private String codeCustomer;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String codeBooking, String startDay, String stopDay, String codeCustomer, String serviceName, String serviceType) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.stopDay = stopDay;
        this.codeCustomer = codeCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStopDay() {
        return stopDay;
    }

    public void setStopDay(String stopDay) {
        this.stopDay = stopDay;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", stopDay='" + stopDay + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
