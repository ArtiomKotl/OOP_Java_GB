package principlesOOP4.view;

import principlesOOP4.model.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}