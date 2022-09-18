package additional_exercises.service.impl;

import additional_exercises.model.Student;
import additional_exercises.service.IStudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> listStudent= new ArrayList<>();
    @Override
    public  void addStudent() {
        listStudent.add(inFoStudent());
        System.out.println("thêm học sinh thành công ");
    }

    @Override
    public void deleteStudent() {
        System.out.println("nhập id của học sinh cần xóa ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flagDelete = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == id){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    listStudent.remove(i);
                    System.out.println("Xóa thành công");
                }
//                flagDelete =true;
                break;
            }
            if(!flagDelete){
                System.out.println("Không tìm thấy đối tượng cần xóa.");
            }
        }
    }

    @Override
    public void displayStudent() {
        for (Student student: listStudent) {
            System.out.println(student);
        }
    }
    public  Student inFoStudent(){
        System.out.println("nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên học sinh :");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh :");
        String birthDay = scanner.nextLine();
        System.out.println("nhập giới tính :");
        String age = scanner.nextLine();
        System.out.println("nhập tên lớp :");
        String nameClass = scanner.nextLine();
        System.out.println("nhập điểm :");
        double scores = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id,name,birthDay,age,nameClass,scores);
        return student;
    }
}
