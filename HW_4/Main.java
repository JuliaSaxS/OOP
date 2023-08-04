import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentService.AverageAge;
import StudentDomen.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", "Иванов", 25, (long) 101);
        Student s2 = new Student("Андрей", "Андреев", 23, (long) 111);
        Student s3 = new Student("Пётр", "Петров", 23, (long) 301);
        Student s4 = new Student("Елена", "Ленина", 24, (long) 121);
        Student s5 = new Student("Инна", "Инина", 25, (long) 231);
        Student s6 = new Student("Сергей", "Сергеев", 23, (long) 2345);
        Teacher t1 = new Teacher("Олег", "Орлов", 45, 3450, "Доцент");
        Teacher t2 = new Teacher("Татьяна", "Букина", 65, 330, "Доктор наук");

        List<Student> lisStud = new ArrayList<Student>();
        lisStud.add(s1);
        lisStud.add(s2);
        lisStud.add(s3);
        lisStud.add(s4);
        StudentGroup group = new StudentGroup(lisStud, 23454);

        List<Student> lisStud2 = new ArrayList<Student>();
        lisStud2.add(s5);
        lisStud2.add(s6);
        StudentGroup group2 = new StudentGroup(lisStud2, 15454);

        List<Teacher> listT = new ArrayList<>();
        listT.add(t1);
        listT.add(t2);

        StudentSteam team = new StudentSteam(2);
        team.addTeam(group);
        team.addTeam(group2);
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        Collections.sort(team.getTeams());
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        System.out.println("Средний возраст Группы 1: ");
        AverageAge.getAverageAge(lisStud);
        System.out.println("Средний возраст Группы 2: ");
        AverageAge.getAverageAge(lisStud2);
        System.out.println("Средний возраст Teacher: ");
        AverageAge.getAverageAge(listT);

    }
}
