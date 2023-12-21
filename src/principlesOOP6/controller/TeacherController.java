package principlesOOP6.controller;

import principlesOOP6.model.Teacher;
import principlesOOP6.service.TeacherService;
import principlesOOP6.view.TeacherView;

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
