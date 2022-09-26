package ss5_Access_modifier_static_method_static_property.Exercise.Building_classes_in_Java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        student.setName("cong");
        student.setClasses("C0722G1");
        System.out.println(student.toString());

    }
}
