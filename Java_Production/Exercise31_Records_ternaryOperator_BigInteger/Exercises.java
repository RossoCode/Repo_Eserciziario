package Java_Production.Exercise31_Records_ternaryOperator_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        int x = (int) (Math.random() * 100);
        System.out.println(x);
        String message = x >= 50 ? "x è maggiore o uguale a 50" : "x è minore di 50";
        System.out.println(message);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Franco" , 18 , "via molise");
        System.out.println(person);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("30000000000000000");
        BigDecimal bigDecimal = new BigDecimal("151.000000000000001113333355555000000000000000000");

        BigInteger bigDivideInteger;
        bigDivideInteger = bigInteger.divide(new BigInteger("3"));
        System.out.println(bigDivideInteger);

        BigDecimal bigDecimalPI;
        bigDecimalPI = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.UP);
        System.out.println(bigDecimalPI);

    }

}
