package principlesOOP6.view;

import principlesOOP6.model.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}