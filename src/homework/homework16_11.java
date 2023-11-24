package homework;

import java.util.Scanner;

public class homework16_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

       System.out.println(detectSign(number));

    }

   public static String detectSign( int n) {
/*
Написать метод, определяющий является ли целое число положительным, отрицательным или нулем.
Метод принимает целое число в качестве параметра и возвращает соответствующую строку. В методе main вывести результат на экран
 */
        if( n > 0){
            return "Number is positive";
        }
        else if (n < 0){
            return "Number is negative";
        }
        else{
            return "Number is zero";
        }

    }

}
