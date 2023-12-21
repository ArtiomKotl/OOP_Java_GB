package principlesOOP6;

import principlesOOP6.controller.StudentController;
import principlesOOP6.controller.TeacherController;
import principlesOOP6.model.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController ();
        controller.create ( "qwe", "qwewr", "ertyeye", LocalDate.ofEpochDay ( 2007-12-03 ) );
        controller.create ( "qwert", "qwewrh", "ertyeyetw", LocalDate.ofEpochDay ( 2007-11-05 ) );
        controller.create ( "qweert", "qwewrte", "ertyeyetw", LocalDate.ofEpochDay ( 1987-12-14 ) );
        controller.create ( "qwete", "qwewret", "ertyeyewgg", LocalDate.ofEpochDay ( 2007-10-25 ) );
        controller.sendOnConcoleStudent ();
        System.out.println ();
        TeacherController teacherController = new TeacherController ();
        teacherController.create ( "Bob", "Danvew","Viewtun", LocalDate.ofEpochDay ( ( 1987-12-14 ) ) );
        teacherController.create ( "Bibob", "Danonvew","Viewtun", LocalDate.ofEpochDay ( ( 1999-12-14 ) ) );
        teacherController.create ( "Bobop", "Daynvew","Viewsaetun", LocalDate.ofEpochDay ( ( 1985-12-15 ) ) );
        teacherController.create ( "Bobtr", "Darttnvew","Viewetatun", LocalDate.ofEpochDay ( ( 1987-12-10 ) ) );
        teacherController.sendOnConsoleTeacher ();







        }
}

