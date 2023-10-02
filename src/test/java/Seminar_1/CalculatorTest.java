package Seminar_1;

import static org.assertj.core.api.Assertions.*;
import Seminar_1.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testCalculateDiscount();
        calculatorTest.testCalculatorSaleExeption(50.5);
        calculatorTest.testCalculatorSaleExeption(0);
        calculatorTest.testCalculatorSaleExeption(-14);
        calculatorTest.testCalculatorSumCountExeption(9);
        calculatorTest.testCalculatorSumCountExeption(1010);
        calculatorTest.testCalculatorSumCountExeption(-100);
    }

    public void testCalculateDiscount () {
        assertThat(Calculator.calculateDiscount(1000, 10)).isEqualTo(900.0);
    }

    public void testCalculatorSaleExeption(double sale) {
        assertThatThrownBy(() -> Calculator.calculateDiscount(500, sale))
                .isInstanceOf(ArithmeticException.class);
    }

    public void testCalculatorSumCountExeption(double sumCount) {
        assertThatThrownBy(() -> Calculator.calculateDiscount(sumCount, 20))
                .isInstanceOf(ArithmeticException.class);
    }
}