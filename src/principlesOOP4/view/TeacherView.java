package principlesOOP4.view;

import principlesOOP4.model.StudentGroup;
import principlesOOP4.model.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher user : teachers) {
        logger.info ( user.toString () );
    }
    public void sendOnConsoleUserGroup(Teacher tea){
        logger.info(studentGroup.toString());
    }


}
