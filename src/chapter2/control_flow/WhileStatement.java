package chapter2.control_flow;

public class WhileStatement {
    public static void main(String[] args) {
        /**
         * Syntax for while statement
         *  i. while => while(condition){implementation}
         *  ii. do while => do{implementation}while(condition)
         */

        //while
        int a = 0;
        while (a <= 5){
            System.out.println(a);
            a++;
        }

        //do while
        a = 0;
        do{
            System.out.println(a);
        }while (a > 5);

        do{
            System.out.print(a + " ");
            a++;
        }while (a < 5);
    }
}
