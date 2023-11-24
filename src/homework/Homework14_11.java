package homework;

import javax.swing.*;

public class Homework14_11 {
    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 5;

        if (a == b && b == c){
            System.out.println("All numbers are equal");
        }
        else if (a != b && b != c  && a != c){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Some numbers are equal");
        }

        int num1 = 2;
        int num2 = 2;

        int sum = num1 + num2;

        if (num1 == num2){
            System.out.println("double sum " + 2 * sum);
        }
        else {
            System.out.println("sum" + sum);
    }
    }
}

