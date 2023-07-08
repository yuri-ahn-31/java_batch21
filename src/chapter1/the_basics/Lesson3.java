package chapter1.the_basics;

public class Lesson3 {
    public static void main(String[] args) {

        //Integers
        byte b1 = 126;
        short s1 = 32000;
        int i1 = 22222222;
        long l1 = 123456789;

        System.out.println("The byte value is " + b1);
        System.out.println("The short value is " + s1);
        System.out.println("The int value is " + i1);
        System.out.println("The long value is " + l1);

        //Float and Double
        int i = 3;
        float f1 = 5.5f;
        float f2 = 6.5f;
        double d1 = 4.54d;
        double d2 = 5.46;
        float result;
        result = f1 + f2;

        System.out.println(result);

        result = i + f1;
        System.out.println(result);

        //result  = d1 + d2; size a thy htl ko akyee htae loh m ya

        //boolean and Character

        int a = 5;
        int b = 4;
        boolean condition = a < b;
        System.out.println(condition);

        char ch = 'a';
        System.out.println(ch);

        ch = 80; //ASCII code
        System.out.println(ch);


    }
}

/*
    Data type
    i. primitive data type
        1. byte
        2. short
        3. int        } 1 to 4 integer
        4. long
        5. float
        6. double      }5 & 6 decimal number
        7. boolean      }7 true & false
        8. char         }8 character

    ii. non-primitive data type
        1.String
        2. Array

     Integers

     byte   short      int     long ( 1 byte = 8  bits(0000 0000 - 1111 1111))
     1byte  2byte      4byte   8byte

     2^7 = -128 to 127
     2^15

     Decimal
     float      double
     4byte      8byte
 */
