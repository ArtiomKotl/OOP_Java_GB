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

        Student student5 = new Student ( 5, "qwe", "qwewr", "qwertys" );
        Student student6 = new Student ( 6, "qwer", "qwewry", "qwertym" );
        Student student7 = new Student ( 8, "qwery", "qwewru", "qwertyi" );
        Student student8 = new Student ( 7, "qwerty", "qwewri", "qwertyni" );
        List<Student> students1 = new ArrayList<> ();
        students1.add ( student5 );
        students1.add ( student6 );
        students1.add ( student7 );
        students1.add ( student8 );


//   //        Итерация студентов

//        StudentGroup studentGroup = new StudentGroup ( students );
//        StudentGroupService service = new StudentGroupService (studentGroup);
//        for (Student student : service.getStudents ()) {
//            System.out.println (student);
//        }
//
//
//        System.out.println ();
//
//        for (Student student : service.getSortedStudentGroup ()) {
//            System.out.println (student);
//        }
//        System.out.println ();
//
//
//        for (Student student : service.getSortedStudentGroupByFIO ()) {
//            System.out.println (student);
//        }


//        StudentGroupIteretor groupIteretor = new StudentGroupIteretor ( studentGroup );
//        while (groupIteretor.hasNext ()){
//            System.out.println (groupIteretor.next () );
//        }


        Group streamGroup = new Group (4, students);
        Group streamGroup2 = new Group ( 1, students1);
        Group streamGroup3 = new Group ( 2, students);
        Group streamGroup4 = new Group( 3, students1);
        List<Group> streamGroupList = new ArrayList<> ();
        streamGroupList.add ( streamGroup );
        streamGroupList.add ( streamGroup2 );
        streamGroupList.add ( streamGroup3 );
        streamGroupList.add ( streamGroup4 );
        Group streamGroup5 = new Group (5, students);
        Group streamGroup6 = new Group ( 7, students1);
        Group streamGroup7 = new Group ( 6, students);
        Group streamGroup8= new Group( 9, students1);

        List<Group> streamGroupList2 = new ArrayList<> ();
        streamGroupList2.add ( streamGroup5 );
        streamGroupList2.add ( streamGroup6 );
        streamGroupList2.add ( streamGroup7 );
        streamGroupList2.add ( streamGroup8 );

        Stream stream = new Stream (  streamGroupList);
        Stream stream2 = new Stream (  streamGroupList2);
        List<Stream> studentSteamList = new ArrayList<> ();
        studentSteamList.add ( stream );
        studentSteamList.add ( stream2 );



       StreamIterator streamIterator = new StreamIterator ( streamGroupList );
        while (streamIterator.hasNext ()){
            System.out.println (streamIterator.next () );
       }
        System.out.println ();


//        StreamIterator streamIterator1 = new StreamIterator (streamGroupList2);
//        while (streamIterator1.hasNext ()){
//            System.out.println (streamIterator1.next ());
//        }
//        System.out.println ();

        StreamService service = new StreamService (stream);
        for (Group group : service.getSortedGroup ()) {
            System.out.println (group);
        }
        System.out.println ();

        StreamService service1 = new StreamService ( stream2 );
        for (Group group : service1.getSortedStream ()) {
            System.out.println (group);
        }









    }
}

