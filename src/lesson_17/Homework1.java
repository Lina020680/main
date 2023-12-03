package lesson_17;

public class Homework1 {
    /*
    Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.

    Пример:
    int index = 3
    String str = "Hello"

    public static String removeCharAtIndex( String str, int index) -> "Helo"
    */
    public static void main(String[] args) {
        int index =3;
        String str = "Hello";

        System.out.println(removeCharAtIndex(str,index));
    }
    public static String removeCharAtIndex( String str, int index){
    if (index >= 0 && index <str.length()){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.deleteCharAt(index);
        return stringBuilder.toString();
    }
    else{
        return str;
    }
    }
}
