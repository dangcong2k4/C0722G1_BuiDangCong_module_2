package caseStudy_module2.model.person;

import java.time.LocalDate;

public class Customer extends Person{
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, LocalDate birthday, String idNumber, String phoneNumber, String email, String typeOfGuest, String address) {
        super(code, name, birthday, idNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
