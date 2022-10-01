package additional_exercise1.service.impl;

import additional_exercise1.model.Teacher;
import additional_exercise1.service.ITeacherService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> listTeacher = new ArrayList<>();
    @Override
    public void addTeacher() {
        listTeacher = getTeacherFromFile();
        listTeacher.add(inFoTeacher());
        System.out.println("thêm mới thành công ");
        writeFile(listTeacher);
    }

    @Override
    public void deleteTeacher() {
        listTeacher = getTeacherFromFile();
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
                flagDelete =true;
                break;
            }

        }
        if(!flagDelete){
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        writeFile(listTeacher);
    }

    @Override
    public void displayTeacher() {
        listTeacher = getTeacherFromFile();
        for (Teacher teacher:listTeacher) {
            System.out.println(teacher);
        }
        writeFile(listTeacher);
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
                if (!name.matches("([A-Z][a-z]+[ ])+[A-Z][a-z]+")){
                    throw new IllegalArgumentException("phải nhập tên bằng chữ và có họ tên , hãy nhập lại!");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập ngày sinh :");
        String birthDay ;

        while (true) {
            try {
                birthDay = scanner.nextLine();
                if (!birthDay.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")){
                    throw new IllegalArgumentException("nhập ngày sinh không đúng định dạng, hãy nhập lại!");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập giới tính :");
        String age = scanner.nextLine();
        while (!age.equals("Nam") && !age.equals("Nữ") && !age.equals("giới tính thứ 3")){
            System.out.println("hãy nhập đúng giới tính, hãy nhập lại:");
            age = scanner.nextLine();
        }
        System.out.println("nhập chuyên môn :");
        String specialize;
        while (true){
            try {
                specialize = scanner.nextLine();
                if (!specialize.matches("([a-z]+[ ])+[a-z]+")){
                    throw new IllegalArgumentException("hãy nhập đúng chuyên môn ");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        Teacher teacher = new Teacher(id,name,birthDay,age,specialize);
        return teacher;
    }

    private List<Teacher> getTeacherFromFile() {

        FileReader file = null;
        List<Teacher> teacherList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\teacher.txt");
            bufferedReader = new BufferedReader(file);
            String line;
            String[] info;
            Teacher teacher;
            while ((line = bufferedReader.readLine())!=null) {
                info = line.split(",");
                teacher = new Teacher(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]);
                teacherList.add(teacher);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacherList;
    }
    private void writeFile(List<Teacher> teacherList) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\teacher.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher: teacherList) {
                bufferedWriter.write(getInfo(teacher));
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getInfo(Teacher teacher){
        return String.format("%s,%s,%s,%s,%s",teacher.getId(),teacher.getName(),teacher.getBirthDay(),teacher.getAge(),teacher.getSpecialize());
    }
}
