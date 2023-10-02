package Seminar_1;

public class Calculator {

    public static double calculateDiscount (double summCount, double sale) throws ArithmeticException {
        if (sale <= 0 || sale > 50) {
            throw new ArithmeticException("Такой скидки не существует");
        }
        if (summCount < 10 || summCount > 1000) {
            throw new ArithmeticException("Товара такой стоимости не существует");
        }
        return summCount - (summCount*sale/100);
    }

}