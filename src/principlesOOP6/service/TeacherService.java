package principlesOOP6.service;

import principlesOOP6.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<> ();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        int countMaxId = 0;
        for (Teacher teacher : teachers){
            if (teacher.getTeacherId ()>countMaxId){
                countMaxId = teacher.getTeacherId ();
            }
        }
        countMaxId++;
        teachers.add (new Teacher ( countMaxId, firstName, secondName, patronymic, dateOfBirth ) );

    }
}
