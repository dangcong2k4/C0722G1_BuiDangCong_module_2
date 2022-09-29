package additional_exercise1.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String birthDay, String age, String specialize) {
        super(id, name, birthDay, age);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getBirthDay(),this.getAge(),this.getSpecialize());
    }
}
