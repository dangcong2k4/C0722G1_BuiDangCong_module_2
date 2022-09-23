package additional_exercise1.service.impl;

import additional_exercise1.model.Student;
import additional_exercise1.model.Teacher;
import additional_exercise1.service.ITeacherService;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Teacher> listTeacher = new ArrayList<>();
    @Override
    public void addTeacher() {
        listTeacher.add(inFoTeacher());
        System.out.println("thêm mới thành công ");
    }

    @Override
    public void deleteTeacher() {
        System.out.println("nhập id của giáo viên cần xóa ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flagDelete = false;
        for (int i = 0; i < listTeacher.size(); i++) {
            if(listTeacher.get(i).getId() == id){
                System.out.println("bấm Y để xóa thật: ");
                String choice = scanner.nextLine();
                if(choice.equals("Y")){
                    listTeacher.remove(i);
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
    public void displayTeacher() {
        for (Teacher teacher:listTeacher) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchTeacher() {
        System.out.println("Nhập tên giáo viên cần tìm:");
        String nameTeacher = scanner.nextLine();
        for (int i = 0; i < listTeacher.size(); i++) {
            if(listTeacher.get(i).getName().contains(nameTeacher)){
                System.out.println(listTeacher.get(i));
            }
        }
    }

    @Override
    public void sortNameTeacher() {
        for (int i = 0; i <listTeacher.size() ; i++) {
            for (int j = 0; j <listTeacher.size()-i-1 ; j++) {
                if (listTeacher.get(j).getName().compareTo(listTeacher.get(j+1).getName()) > 0){
                    Teacher nameTeacher = listTeacher.get(j);
                    listTeacher.set(j,listTeacher.get(j+1));
                    listTeacher.set(j+1,nameTeacher);
                }
                if (listTeacher.get(j).getName().compareTo(listTeacher.get(j+1).getName())==0){
                    if(listTeacher.get(j).getId()>listTeacher.get(j+1).getId()){
                        Teacher idTeacher = listTeacher.get(j);
                        listTeacher.set(j,listTeacher.get(j+1));
                        listTeacher.set(j+1,idTeacher);
                    }

                }
            }
        }
        for (int i = 0; i <listTeacher.size() ; i++) {
            System.out.println(listTeacher.get(i));
        }
    }

    public Teacher inFoTeacher(){
        System.out.println("nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên giáo viên :");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh :");
        String birthDay = scanner.nextLine();
        System.out.println("nhập giới tính :");
        String age = scanner.nextLine();
        System.out.println("nhập chuyên môn :");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,birthDay,age,specialize);
        return teacher;
    }
}
