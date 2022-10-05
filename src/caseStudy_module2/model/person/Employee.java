package caseStudy_module2.model.person;

public class Employee extends Person{
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String code, String name, String birthday, String idNumber, String phoneNumber, String email, String level, String position, double wage) {
        super(code, name, birthday, idNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
