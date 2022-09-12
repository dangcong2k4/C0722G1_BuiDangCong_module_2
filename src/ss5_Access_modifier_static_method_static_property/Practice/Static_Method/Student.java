package ss5_Access_modifier_static_method_static_property.Practice.Static_Method;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        id = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(id + " "+ name + " "+ college);
    }
}
