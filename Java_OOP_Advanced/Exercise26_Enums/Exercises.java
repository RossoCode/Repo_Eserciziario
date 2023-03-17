package Java_OOP_Advanced.Exercise26_Enums;

import static Java_OOP_Advanced.Exercise26_Enums.Operator.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days nameDays : Days.values()) {
            System.out.println(nameDays);
        }

    }

    /**
     * 2:
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        for (Seasons nameSeasons : Seasons.values()) {
            System.out.println(nameSeasons + ":");
            System.out.println(nameSeasons.getStartMonth() + " to " + nameSeasons.getFinalMonth());

        }
    }

    private enum Seasons {
        SPRING("20 march", "20 june"),
        SUMMER("21 june", "21 september"),
        FALL("22 september", "20 december"),
        WINTER("21 december", "19 march");

        private String startMonth, finalMonth;

        Seasons(String startMonth, String finalMonth) {
            this.startMonth = startMonth;
            this.finalMonth = finalMonth;

        }

        public String getStartMonth() {
            return startMonth;
        }

        public String getFinalMonth() {
            return finalMonth;
        }
    }

    /**
     * 3:
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * Write code that simulates the behavior of a traffic light.
     * It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
       TrafficLight light = TrafficLight.RED;
        System.out.println();
        for (int i = 0; i < 3 ; i++) {
            light = light.trafficLight();
            System.out.println(light);
        }
    }

    public enum TrafficLight {
        RED,
        YELLOW,
        GREEN;
        public  TrafficLight trafficLight() {
            if (this.equals(RED))
            {   System.out.print("TrafficLight is: ");
                return YELLOW;
            } else if (this == YELLOW) {
                System.out.print("TrafficLight is: ");
                return GREEN;
            } else if (this == GREEN) {
                System.out.print("TrafficLight is: ");
                return RED;
            } else {
                System.out.println("error : unknown color");
            }
            return null;
        }
    }


    /**
     * 4:
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        for (Days nameDays : Days.values()) {
            System.out.println(nameDays + " is weekend days ? " + nameDays.getIsWeekend());

        }
    }

    /**
     * 5:
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        System.out.println("Add result: " + ADD(num1,num2));
        System.out.println("Subtract result: " +SUBTRACT(num1, num2));
        System.out.println("Multiply result: " + MULTIPLY(num1, num2));
        System.out.println("Divide result: " +DIVIDE(num1, num2));
    }


}