package boolean_type;

public class Main {

    public static void main(String[] args) {

        /*
        == равенство
        != не равно
        >  больше
        <  меньше
        >= больше равно
        <= меньше равно

        логические операторы

        &  AND (И)
        |  OR  (ИЛИ)
        !  NOT (НЕ)
        ^  XOR (исключающее ИЛИ)
         */

        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        if (10 > 9){
            System.out.println("10 > 9");
        }

        int n , d;

        n = 10;
        d = 2;
        System.out.println(n % d == 0);

        if ( d != 0 && ( n % d) == 0){
            System.out.println(" can be divided without remainder");
        }

    }
}
