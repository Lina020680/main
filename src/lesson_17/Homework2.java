package lesson_17;

public class Homework2 {
    /*
    Написать свой собственный метод substring, работающий аналогично методу в Джаве. Метод принимает строку ,
    индексы начала и конца и возвращает подстроку.
    String mySubstring( String string, int begin, int end).
     */
    public static void main(String[] args) {
        System.out.println(mySubstring("Homework", 3,8));

    }
    public static String mySubstring(String string, int begin, int end){
    if (begin >= 0 && begin < string.length() && end >= 0 && end <= string.length()){
        return string.substring(begin,end);
        }
        else {
            return string;
        }
    }
    }





