package principlesOOP5;

import principlesOOP5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller ();
        controller.creteStudent ( "asd", "dsa", "qwer" );
        controller.creteStudent ( "qwe21", "qwert", "wiuyert" );
        controller.creteStudent ( "qwe", "weryqt", "etwerwy" );
        controller.getAllStudent ();
        Controller controllerT = new Controller ();
        controllerT.createTeacher (  "Bob", "Danvew","Viewtun");
        controllerT.createTeacher ( "Bibob", "Danonvew","Viewtun" );
        controllerT.getAllTeacher ();

    }
}
