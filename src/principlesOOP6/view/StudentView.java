package principlesOOP6.view;

import principlesOOP6.model.Student;
import principlesOOP6.model.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{



    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            System.out.println (user + " ");
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){

    }

}

