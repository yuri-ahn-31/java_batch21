package chapter1.the_basics.lesson5.binary_operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        //Assignment Operator (=, +=, -=, *=, /=, %=, <<=, >>=)

        int a = 7;
        a += 6;
        System.out.println(a);

        a  -= 2;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 5;
        System.out.println(a);

        a %= 4;
        System.out.println(a);

        a <<= 2;
        System.out.println(a);

        a >>= 2;
        System.out.println(a);
    }
}
