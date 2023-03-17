package Java_OOP_Advanced.Exercise26_Enums;

public enum Operator {
    ADD,
    DIVIDE,
    MULTIPLY,
    SUBTRACT;
    public static double ADD(double num1, double num2) {
            double result = num1 + num2;
            return result;
    }
    public static double SUBTRACT(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
    public static double MULTIPLY(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double DIVIDE(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}