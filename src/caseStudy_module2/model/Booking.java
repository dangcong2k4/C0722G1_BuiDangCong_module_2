package caseStudy_module2.model;

import Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers.Colorable;

import java.time.LocalDate;

public class Booking implements Comparable<Booking> {
    private String codeBooking;
    private LocalDate startDay;
    private LocalDate stopDay;
    private String codeCustomer;
    private String serviceCode;
    private String serviceType;

    public Booking() {
    }

    public Booking(String codeBooking, LocalDate startDay, LocalDate stopDay, String codeCustomer, String serviceCode, String serviceType) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.stopDay = stopDay;
        this.codeCustomer = codeCustomer;
        this.serviceCode = serviceCode;
        this.serviceType = serviceType;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getStopDay() {
        return stopDay;
    }

    public void setStopDay(LocalDate stopDay) {
        this.stopDay = stopDay;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getServiceName() {
        return serviceCode;
    }

    public void setServiceName(String serviceName) {
        this.serviceCode = serviceName;
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
                ", serviceName='" + serviceCode + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }


    @Override
    public int compareTo(Booking o) {
        int compareStartDate = this.getStartDay().compareTo(o.getStartDay());
        if (compareStartDate != 0){
            return compareStartDate;
        }
        return this.getStopDay().compareTo(o.getStopDay());
    }
}
