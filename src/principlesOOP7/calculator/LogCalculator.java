package principlesOOP7.calculator;

public class LogCalculator  implements Calculable{

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }


    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult ();
        logger.log ( String.format ( "Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg ) );
        Calculable result = decorated.sum ( arg );
        logger.log ( String.format ( "Вызов метода sum произошел" ) );
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult ();
        logger.log ( String.format ( "Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg ) );
        Calculable result = decorated.multi ( arg );
        logger.log ( String.format ( "Вызов метода multi произошол" ) );
        return null;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult ();
        logger.log(String.format ( "Получение результата %d", result ));
        return result;
    }
}
