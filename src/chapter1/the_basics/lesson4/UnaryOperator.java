package chapter1.the_basics.lesson4;

public class UnaryOperator {
    /**
     * Operators
     *  i. Unary Operator           one operand (++ <- increment, -- <- decrement)
     *      a. prefix       ++a, --a
     *      b. postfix      a++, a--
     *  ii. Binary Operator         two operands
     *  iii. Ternary Operator       three operands
     */

    // <- single line comment
    // /* */ <- multiline comment
    // /** */ <-documentation comment, also support html codes and have to generate them

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //11
        System.out.println(a++); //11
        System.out.println(a); //12

        int x = 5;
        int y = 3;
        int result = x + ++y;
        System.out.println(result);

        int b = 20;
        System.out.println(--b); //19
        System.out.println(b--); //19
        System.out.println(b); //18
    }
}
