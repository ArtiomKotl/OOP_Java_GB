package principlesOOP4.controller;

import principlesOOP4.model.Teacher;
import principlesOOP4.service.TeacherService;
import principlesOOP4.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher>{

    private final TeacherView teacherView = new TeacherView ();
    private final TeacherService teacherService = new TeacherService ();


    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create ( firstName, secondName, patronymic, dateOfBirth );

    }

    

    public void sendOnConsoleTeacher(){
        teacherView.sendOnConsole ( teacherService.getAll () );
    }
}
