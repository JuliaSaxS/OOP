package call;

/*
 * Интерфейс
 */
public interface iCalculator {

    /**
     * сложение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumber add(ComplexNumber n1, ComplexNumber n2);

    /**
     * умножение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2);

    /**
     * деление
     * 
     ** @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumber divide(ComplexNumber n1, ComplexNumber n2);
}
