package principlesOOP4.controller;

import principlesOOP4.model.Student;
import principlesOOP4.model.Teacher;
import principlesOOP4.service.StudentGroupService;
import principlesOOP4.service.StudentService;
import principlesOOP4.view.StudentView;
import principlesOOP4.view.UserView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService ();
    private final StudentGroupService studentGroupService = new StudentGroupService ();
    private final StudentView studentView = new StudentView();
    private final UserView userView = new UserView () {
        @Override
        public void sendOnConsole(List list) {
            userView.sendOnConsole ( dataService.getAll () );
        }
    };

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll ());
    }

    public void sendOnConcoleStudent(){
        studentView.sendOnConsole (dataService.getAll ());
    }

    public void sendOnConcole(){

    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}
