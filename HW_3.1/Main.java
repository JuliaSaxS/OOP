import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Юлия", "Акишина", 25, (long) 1);
        Student s2 = new Student("Андрей", "Карпаков", 23, (long) 2);
        Student s3 = new Student("Александр", "Смирнов", 23, (long) 3);
        Student s4 = new Student("Елена", "Перелыгина", 24, (long) 4);
        Student s5 = new Student("Юрий", "Баранов", 25, (long) 5);
        Student s6 = new Student("Тимур", "Буланов", 23, (long) 6);
        Student s7 = new Student("Ирина", "Комарова", 22, (long) 7);

        List<Student> listStudents1 = new ArrayList<Student>();
        listStudents1.add(s1);
        listStudents1.add(s2);
        listStudents1.add(s3);
        listStudents1.add(s4);
        StudentGroup group1 = new StudentGroup(listStudents1, 112);   

        List<Student> listStudents2 = new ArrayList<Student>();
        listStudents2.add(s5);
        listStudents2.add(s6);
        listStudents2.add(s7);
        StudentGroup group2 = new StudentGroup(listStudents2, 211);
                  
        StudentSteam team = new StudentSteam(11211);
        team.addTeam(group1);
        team.addTeam(group2);
        System.out.println(team);
        
        Collections.sort(team.getTeams());
        for(StudentGroup studentGroup : team){
            System.out.println(studentGroup);
        }
    }
}
