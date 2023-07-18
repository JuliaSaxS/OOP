package StudentDomen;

/** наследник User */

public class Student extends User implements Comparable<Student> {
    private long studentid;

    /**
     * конструктор
     * 
     * @param firstName  Имя
     * @param secondName Фамилия
     * @param age        возраст
     * @param studentid  id
     */
    public Student(String firstName, String secondName, int age, long studentid) {
        super(firstName, secondName, age);
        this.studentid = studentid;
    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    @Override
    public String toString() {
        return "Student{" + "studentid = " + studentid + '\''
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
            if (this.studentid == o.studentid) {
                return 0;
            }
            if (this.studentid < o.studentid) {
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
