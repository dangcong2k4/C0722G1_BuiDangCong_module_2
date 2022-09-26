package additional_exercise1.view;

import additional_exercise1.controller.StudentController;
import additional_exercise1.controller.TeacherController;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        do {

            System.out.println("1. kiểm tra Học sinh ");
            System.out.println("2. kiểm tra Giáo viên ");
            System.out.println("3. kết thúc ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                case 3:
                    System.out.println("kết thúc chương trình quản lý học sinh và giáo viên ");
                    return ;
            }
        }while (true);

    }
}
