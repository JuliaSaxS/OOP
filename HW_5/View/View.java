package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {
    public void prinAllStudent(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public String prompt(String message){
        Scanner iScanner = new Scanner(System.in);
        System.out.println(message);
        return iScanner.nextLine();
    }
}
