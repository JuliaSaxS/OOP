package StudentDomen;

/** наследник User */

public class Teacher extends User {
    private int teacherId;
    private String academicDegree;

    /**
     * конструктор
     * 
     * @param firstName   имя
     * @param secondName  фамилия
     * @param age         возраст
     * @param teacherId   id
     * @param academicDegree ученая степень
     */
    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher{"+"teacherId = " + teacherId +'\'' +", academicDegree = " 
        + academicDegree+'\'' +", firstName = " + super.getFirstName() + '\'' +
        ", secondName = " + super.getSecondName() + '\'' +
        ", age = " + super.getAge() + "}";
    }

    

}
