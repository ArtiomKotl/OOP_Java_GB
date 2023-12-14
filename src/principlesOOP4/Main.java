package principlesOOP4;

import principlesOOP4.controller.StudentController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController ();
        controller.create ( "qwe", "qwewr", "ertyeye", LocalDate.ofEpochDay ( 2007-12-03 ) );
        controller.create ( "qwert", "qwewrh", "ertyeyetw", LocalDate.ofEpochDay ( 2007-11-05 ) );
        controller.create ( "qweert", "qwewrte", "ertyeyetw", LocalDate.ofEpochDay ( 1987-12-14 ) );
        controller.create ( "qwete", "qwewret", "ertyeyewgg", LocalDate.ofEpochDay ( 2007-10-25 ) );
        //controller.sendOnConcoleStudent ();
        controller.sendOnConcole ();

        }
}

