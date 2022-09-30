package additional_exercise1.model;

public abstract class Person {
    private int id;
    private String name;
    private String birthDay;
    private String age;

    public Person() {
    }

    public Person(int id, String name, String birthDay, String age) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", age='" + age + '\'';
    }


}


