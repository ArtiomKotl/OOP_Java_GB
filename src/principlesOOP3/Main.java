package principlesOOP3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student ( 3, "qwe", "qwewr", "qwertys" );
        Student student2 = new Student ( 1, "qwer", "qwewry", "qwertym" );
        Student student3 = new Student ( 4, "qwery", "qwewru", "qwertyi" );
        Student student4 = new Student ( 2, "qwerty", "qwewri", "qwertyni" );
        List<Student> students = new ArrayList<> ();
        students.add ( student1 );
        students.add ( student2 );
        students.add ( student3 );
        students.add ( student4 );

        StudentGroup studentGroup = new StudentGroup ( students );
        StudentGroupService service = new StudentGroupService (studentGroup);
        for (Student student : service.getStudents ()) {
            System.out.println (student);
        }


        System.out.println ();

        for (Student student : service.getSortedStudentGroup ()) {
            System.out.println (student);
        }
        System.out.println ();


        for (Student student : service.getSortedStudentGroupByFIO ()) {
            System.out.println (student);
        }


//        StudentGroupIteretor groupIteretor = new StudentGroupIteretor ( studentGroup );
//        while (groupIteretor.hasNext ()){
//            System.out.println (groupIteretor.next () );
//        }

    }
}

