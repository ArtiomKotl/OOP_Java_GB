package principlesOOP5.controller;

import principlesOOP5.model.*;
import principlesOOP5.service.DataService;
import principlesOOP5.view.StudentView;
import principlesOOP5.view.TeacherView;

public class Controller {
    private final DataService srevice = new DataService ();
    private final StudentView studentView = new StudentView ();

    private final TeacherView teacherView = new TeacherView ();


    public void creteStudent(String firstName, String secondName, String lastName) {
        srevice.create ( firstName, secondName, lastName, Type.STUDENT );
    }

    public void getAllStudent() {
        for (User user : srevice.getAllUsers ()) {
            studentView.printOnConsole ( (Student) user );
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        srevice.create ( firstName, secondName, lastName, Type.TEACHER );
    }

    public void getAllTeacher(){
        for(User user : srevice.getAllUsers ()){
            teacherView.printOnConsole ( (Teacher) user);
        }
    }



}

