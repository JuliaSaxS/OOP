package StudentDomen;

/** наследник User */

public class Student extends User implements Comparable<Student> {
    private long studentId;

    /**
     * конструктор
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     * @param studentId  id
     */
    public Student(String firstName, String secondName, int age, long studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId = " + studentId + '\''
                + ", firstName = " + super.getFirstName() + '\'' +
                ", secondName = " + super.getSecondName() + '\'' +
                ", age = " + super.getAge()
                + "}";
    }

    /**
     * Перегрузка для сравнения
     */
    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if (super.getAge() == o.getAge()) {
            if (this.studentId == o.studentId) {
                return 0;
            }
            if (this.studentId < o.studentId) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }

}
