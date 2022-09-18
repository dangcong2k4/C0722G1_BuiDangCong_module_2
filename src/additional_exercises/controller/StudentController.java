package additional_exercises.controller;

import additional_exercises.service.IStudentService;
import additional_exercises.service.impl.StudentService;

import java.util.Scanner;

public class StudentController<iStudentService> {
    private static IStudentService iStudentService = new StudentService();
    public static void menuStudent(){

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. Xem danh sách học sinh");
            System.out.println("4. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                     break;
                case 3:
                    iStudentService.displayStudent();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
