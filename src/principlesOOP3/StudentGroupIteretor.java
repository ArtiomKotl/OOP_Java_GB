package principlesOOP3;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIteretor implements Iterator {



    private final List<Student> students;
    private int counter;
    public StudentGroupIteretor(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents ();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size () ;
    }

    @Override
    public Object next() {
        if (hasNext ()){
            return students.get (counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        students.remove ( counter );
    }
}
