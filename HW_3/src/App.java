import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.*;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Юрий", "Баранов", 20, (long) 111);
        Student s2 = new Student("Соня", "Глазкова", 21, (long) 121);
        Student s3 = new Student("Елизавета", "Петрова", 22, (long) 211);
        Student s4 = new Student("Николай", "Колоша", 20, (long) 121);
        Student s5 = new Student("Илья", "Горличенко", 21, (long) 111);
        Student s6 = new Student("Ольга", "Иванова", 23, (long) 121);

        List<Student> lisStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        StudentGroup group = new StudentGroup(listStud, 111);

        List<Student> lisStud2 = new ArrayList<Student>();
        listStud2.add(s5);
        listStud2.add(s6);
        StudentGroup group2 = new StudentGroup(listStud2, 121);

        StudentSteam team = new StudentSteam(2);
        team.addTeam(group);
        team.addTeam(group2);
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        Collections.sort(team.getTeams());
        for(StudentGroup studentGroup : team){
            System.out.println(studentGroup);
        }

    }
}
