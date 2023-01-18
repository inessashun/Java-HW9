package homework_class9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /*Create an array of chars and store grades into it: A,B,C,D,E,F.
       Then print a grade B (use 2 different ways of creating an array).
        */
        Scanner data=new Scanner(System.in);

        char grade[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        String str = new String(grade);

        System.out.println("Grade "+(grade[1]));



    }

}
