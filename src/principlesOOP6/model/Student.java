package principlesOOP6.model;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private int studentId;

//    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
//        super(firstName, secondName, patronymic, dateOfBirth);
//    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, int studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId = " + studentId +
                ", firstName = '" + super.getFirstName() + '\'' +
                ", secondName = '" + super.getSecondName() + '\'' +
                ", patronymic = '" + super.getPatronymic() + '\'' +
                ", dateOfBirth = " + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId () > studentId)
            return -1;
        if (o.getStudentId () > studentId)
            return 1;
        return 0;

    }
}