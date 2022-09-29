package additional_exercise1.service.impl;

import additional_exercise1.model.Student;
import additional_exercise1.model.Teacher;
import additional_exercise1.service.ITeacherService;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Teacher> listTeacher = new ArrayList<>();
    @Override
    public void addTeacher() throws IOException {
        List<Teacher> teacherList = getTeacherFromFile();
        listTeacher.add(inFoTeacher());
        System.out.println("thêm mới thành công ");
        writeFile(teacherList);
    }


    private List<Teacher> getTeacherFromFile() throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\teacher.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Teacher> teacherList = new ArrayList<>();
        String[] info;
        Teacher teacher;
        while ((line = bufferedReader.readLine())!=null) {
            info = line.split(",");
            teacher = new Teacher(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]);
            teacherList.add(teacher);
        }
        bufferedReader.close();
        return teacherList;
    }
    private void writeFile(List<Teacher> teacherList) throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\teacher.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Teacher teacher: teacherList) {
            bufferedWriter.write(teacher.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

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
        int id;
        while (true){
            try {
                System.out.println("nhập id giáo viên :");
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("điền sai định dạng, vui lòng nhập lại!!");
            }
        }
        System.out.println("nhập tên giáo viên :");
        String name ;
        while (true){
            try {
                name = scanner.nextLine();
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i)>0&&name.charAt(i)<32 || name.charAt(i)>32&&name.charAt(i)<65 || name.charAt(i)>90&&name.charAt(i)<97 || name.charAt(i)>122){
                        throw new IllegalArgumentException("phải nhập tên bằng chữ, hãy nhập lại!");
                    }
                }
                break;

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập ngày sinh :");
        String birthDay = scanner.nextLine();
        System.out.println("nhập giới tính :");
        String age = scanner.nextLine();
        while (!age.equals("Nam") && !age.equals("Nữ") && !age.equals("giới tính thứ 3")){
            System.out.println("hãy nhập đúng giới tính, hãy nhập lại:");
            age = scanner.nextLine();
        }
        System.out.println("nhập chuyên môn :");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,birthDay,age,specialize);
        return teacher;
    }
}
