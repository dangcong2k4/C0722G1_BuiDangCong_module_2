package additional_exercises.controller;

import additional_exercises.service.ITeacherService;
import additional_exercises.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController<iTeacherService> {
    private static ITeacherService iTeacherService = new TeacherService();
    public static void menuTeacher(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Thêm mới giáo viên ");
            System.out.println("2. Xóa giáo viên ");
            System.out.println("3. Xem danh sách giáo viên ");
            System.out.println("4. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.deleteTeacher();
                    break;
                case 3:
                    iTeacherService.displayTeacher();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
