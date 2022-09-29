package additional_exercise1.service.impl;

import additional_exercise1.model.Student;
import additional_exercise1.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> listStudent= new ArrayList<>();
    @Override
    public  void addStudent() throws IOException {
        List<Student> studentList = getStudentFromFile();
        listStudent.add(inFoStudent());
        System.out.println("thêm học sinh thành công ");
        writeFile(studentList);
    }


    private List<Student> getStudentFromFile() throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\studentFile");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Student> studentList = new ArrayList<>();
        String[] info;
        Student student;
        while ((line = bufferedReader.readLine())!=null) {
            info = line.split(",");
            student = new Student(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4],Double.parseDouble(info[5]));
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;
    }
    private void writeFile(List<Student> studentList) throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\additional_exercise1\\data\\studentFile");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student student:studentList) {
            bufferedWriter.write(student.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
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

        int id;
        while (true){
            try {
                System.out.println("nhập id học sinh :");
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("điền sai định dạng, vui lòng nhập lại!!");
            }
        }
        System.out.println("nhập tên học sinh :");
        String name;
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

        System.out.println("nhập tên lớp :");
        String nameClass = scanner.nextLine();
        double scores;
        while (true){
            try {
                System.out.println("nhập điểm :");
                scores = Double.parseDouble(scanner.nextLine());
                while (scores < 0 || scores > 10){
                    System.out.println("hãy nhập thang điểm từ 0 đến 10, nhập lại:");
                    scores = Double.parseDouble(scanner.nextLine());
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập sai định dạng, hãy nhập lại:");
            }
        }
        Student student = new Student(id,name,birthDay,age,nameClass,scores);
        return student;
    }
}
