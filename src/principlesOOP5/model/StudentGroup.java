package principlesOOP5.model;

import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> studentList;


    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
