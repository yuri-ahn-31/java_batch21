package chapter1.the_basics.lesson5.binary_operator;

public class Relational_Operator {
    public static void main(String[] args) {
        /**
         * Relational Operator (Comparison Operator)
         * <, >, <=, >=, ==, !=
         */

        int a = 10;
        int b = 5;
        boolean result;

        result = a < b;
        System.out.println(result);

        result = a > b;
        System.out.println(result);

        result = a <= b;
        System.out.println(result);

        result = a >= b;
        System.out.println(result);

        result = a == b;
        System.out.println(result);

        result = a != b;
        System.out.println(result);
    }
}
