package principlesOOP6.view;

import principlesOOP6.model.StudentGroup;
import principlesOOP6.model.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
//    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            System.out.println (user + " ");
//            logger.info ( user.toString () );
        }

    }

}
