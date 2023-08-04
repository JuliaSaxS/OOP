import java.util.ArrayList;
import java.util.List;

import Model.*;
import View.*;
import Controller.*;

public class Main {
  public static void main(String[] args) throws Exception {
    List<Student> students = new ArrayList<Student>();
    Student s1 = new Student("Иван", "Иванов", 21, 101);
    Student s2 = new Student("Андрей", "Андреев", 22, 111);
    Student s3 = new Student("Пётр", "Петров", 22, 121);
    Student s4 = new Student("Игорь", "Соколов", 23, 301);
    Student s5 = new Student("Инна", "Инина", 25, 171);
    Student s6 = new Student("Елена", "Ленина", 23, 104);
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    students.add(s6);

    FileModel fModel = new FileModel("StudentsDB.txt");
    for (Student student : students) {
            fModel.addStudent(student);
        }
        
    iGetModel newFModel = fModel;
    iGetView viewEng = new ViewEng();

    Controller controller = new Controller(viewEng, newFModel);
    controller.run();
  }
}
