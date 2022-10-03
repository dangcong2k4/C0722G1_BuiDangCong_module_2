package caseStudy_module2.model;

public class Contract {
    private String syncNumber;
    private String codeBooking;
    private String deposit;
    private String payments;
    private String codeCustomer;

    public Contract() {
    }

    public Contract(String syncNumber, String codeBooking, String deposit, String payments, String codeCustomer) {
        this.syncNumber = syncNumber;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.payments = payments;
        this.codeCustomer = codeCustomer;
    }

    public String getSyncNumber() {
        return syncNumber;
    }

    public void setSyncNumber(String syncNumber) {
        this.syncNumber = syncNumber;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "syncNumber='" + syncNumber + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", deposit='" + deposit + '\'' +
                ", payments='" + payments + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                '}';
    }
}
