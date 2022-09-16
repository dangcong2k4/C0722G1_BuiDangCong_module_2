package ss10_DSA_List.exercise.Implement_methods_of_ArrayList;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {
        Student student = new Student(1,"cong");
        Student student1 = new Student(2,"cong");
        Student student2 = new Student(3,"cong");
        Student student3 = new Student(4,"cong");
        Student student5 = new Student(15,"tan");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student);
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student5,3);

        for (int i = 0; i < studentMyList.size() ; i++) {
            Student student4 = (Student) studentMyList.elements[i];
            System.out.print(student4.getId()+" ");
            System.out.println(student4.getName());
        }
    }
}
