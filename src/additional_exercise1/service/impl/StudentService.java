package additional_exercise1.service.impl;

import additional_exercise1.model.Student;
import additional_exercise1.service.IStudentService;

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

    @Override
    public void searchStudent() {
        System.out.println("Nhập tên học sinh cần tìm:");
        String nameStudent = scanner.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getName().contains(nameStudent)){
                System.out.println(listStudent.get(i));
            }
        }
    }

    @Override
    public void sortNameStudent() {
        for (int i = 0; i <listStudent.size() ; i++) {
            for (int j = 0; j <listStudent.size()-i-1 ; j++) {
                if (listStudent.get(j).getName().compareTo(listStudent.get(j+1).getName()) > 0){
                    Student nameStudent = listStudent.get(j);
                    listStudent.set(j,listStudent.get(j+1));
                    listStudent.set(j+1,nameStudent);
                }
                if (listStudent.get(j).getName().compareTo(listStudent.get(j+1).getName()) == 0){
                    if (listStudent.get(j).getId()>listStudent.get(j+1).getId()){
                        Student nameStudent = listStudent.get(j);
                        listStudent.set(j,listStudent.get(j+1));
                        listStudent.set(j+1,nameStudent);
                    }

                }
            }
        }


        for (int i = 0; i <listStudent.size() ; i++) {
            System.out.println(listStudent.get(i));
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
