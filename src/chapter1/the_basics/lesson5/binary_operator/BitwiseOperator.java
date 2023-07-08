package chapter1.the_basics.lesson5.binary_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        //Bitwise Operator => &, |, ^
        /**
         * i. Bitwise exclusive AND (&)
         * ii. Bitwise exclusive OR (|)
         * iii. Exclusive OR (^)
         */

        boolean result2 = 3 > 4 & 5 < 10;
        System.out.println(result2);

        result2 = 3 > 4 | 5 < 10;
        System.out.println(result2);

        result2 = true ^ false;
        System.out.println(result2);

        result2 = true ^ true;
        System.out.println(result2);
    }
}
