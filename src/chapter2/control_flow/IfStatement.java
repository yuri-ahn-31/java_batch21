package chapter2.control_flow;

public class IfStatement {
    public static void main(String[] args) {
        /**
         * syntax for if statement
         *  if => if(condition){implementation}
         *  if else => if(condition){implementation}else{implementation}
         */

        //if, if else
        int a = 6;
        if (a > 10){
            System.out.println("a is greater than 10");
        }
        else {
            System.out.println("a is less than 10");
        }

        //if else-if
        int day = 1;
        if (day == 1){
            System.out.println("This is super Sunday");
        }
        else if (day == 2) {
            System.out.println("This is happy Saturday");
        }
        else {
            System.out.println("This is week day");
        }
    }
}

/**
 * Control-Flow
 *  i. if statement (if, if else, if else-if, switch case)
 *  ii. while statement (while, do while)
 *  iii. for statement (for, fori, forr)
 */