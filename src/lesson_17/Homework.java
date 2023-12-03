package lesson_17;

import java.util.Arrays;

public class Homework {
    /*
    Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой. Метод возвращает boolean
    abcd - bcda acbd -анаграммы
    abcd - acb abkc - не анаграммы

    могут пригодится:
    to CharArray
    Arrays.sort
     */
    public static void main(String[] args) {
    String str1 = "abcd";
    String str2 = "bcda";

    boolean result = anagrams(str1,str2);
        System.out.println(result);
    }
    public static boolean anagrams(String str1,String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);
    }

}
