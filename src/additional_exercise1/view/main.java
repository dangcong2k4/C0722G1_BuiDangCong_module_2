package additional_exercise1.view;

import additional_exercise1.controller.StudentController;
import additional_exercise1.controller.TeacherController;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        do {

            System.out.println("1. kiểm tra Học sinh ");
            System.out.println("2. kiểm tra Giáo viên ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
            }
        }while (true);

    }
}
