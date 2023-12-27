package principlesOOP7.calculator;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    Scanner scan = new Scanner(System.in);




    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    private int promptInt(String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

    private String prompt(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

    public void run(){
        while (true){
            String start = prompt ( "Для начала работы введите  \'(s)\' для завершения введите \'(e)\' ");
            if(start.equals ( "e" )){
                break;
            }else if (start.equals ( "s" )) {
                int primaryArg = promptInt ( "Введите первый аргумент: " ) ;
                Calculable calculator = calculableFactory.create (primaryArg);
                while (true) {
                    String cmd = prompt ( "Введите команду  (*, +, -, /, = ) 0 - для сброса значений : " );

                    if (cmd.equals ( "*" )) {
                        int arg = promptInt ( "Введите второй аргумент: " );
                        calculator.multi ( arg );
                        continue;
                    }
                    if (cmd.equals ( "+" )) {
                        int arg = promptInt ( "Введите второй аргумент: " );
                        calculator.sum ( arg );
                        continue;
                    }
                    if (cmd.equals ( "-" )) {
                        int arg = promptInt ( "Введите второй аргумент: " );
                        calculator.diff ( arg );
                        continue;
                    }
                    if (cmd.equals ( "/" )) {
                        int arg = promptInt ( "Введите второй аргумент: " );
                        calculator.div ( arg );
                        continue;
                    }
                    if (cmd.equals ( "=" )) {
                        calculator.getResult ();
                        continue;
                    }

                    if (cmd.equals ( "0" )) {
                        break;
                    }
                }
            }









        }
    }


}
