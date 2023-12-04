package lesson_12;

import java.sql.SQLOutput;

public class Homework2 {
    // Переписать задачу про треугольник из предыдущего дз используя циклы for

    public static void main(String[] args) {
        printTriangle(6);
    }
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
