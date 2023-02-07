package Exercise02_Java_Primitives_and_Literals;

public class Start {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        char literal = 'L';
        System.out.print(literal);
        literal ='o';
        System.out.print(literal);
        literal ='r';
        System.out.print(literal);
        literal ='e';
        System.out.print(literal);
        literal ='n';
        System.out.print(literal);
        literal ='z';
        System.out.print(literal);
        literal ='o';
        System.out.print(literal);
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2()
    {
        System.out.println("\nExercise 2:");
        int literal = 22;
        System.out.println("Age:" +literal);
        boolean lunch = true;
        System.out.println("Have I lunch:" + lunch);
        double price =4.99;
        System.out.println("the price of lunch:" + price);
        // Write your code here
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        char favorite_letter;
        favorite_letter = 'L';
        System.out.println("My favorite letter=" + favorite_letter);
    }
}
