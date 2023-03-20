package Java_OOP_Advanced.Exercise27_Junit;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator();
        //Add Method
        Assert.assertEquals(calculator.add(3, 5), 8);
        Assert.assertEquals(calculator.add(-5,-5),-10);
        Assert.assertEquals(calculator.add(5,-5), 0);
        //Subtract Method
        Assert.assertEquals(calculator.subtract(5, 3), 2);
        Assert.assertEquals(calculator.subtract(6,7),-1);
        Assert.assertEquals(calculator.subtract(6, 6), 0);
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calculator = new Calculator();

        //Multiply Method
        Assert.assertEquals(calculator.multiply(3,3),9);
        Assert.assertEquals(calculator.multiply(3,-3),-9);
        Assert.assertEquals(calculator.multiply(3,0),0);
        //Divide Method
        Assert.assertEquals(calculator.divide(6,3),2);
        Assert.assertEquals(calculator.divide(3,-9),0);
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();
        //Power Methods
        Assert.assertEquals(calculator.power(5,2),25);

    }
}