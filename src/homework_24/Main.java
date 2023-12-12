package homework_24;

public class Main {
    public static void main(String[] args) {
        Grandmother grandmother = new Grandmother();
        Grandmother son1 = new Son();
        Grandmother daughter1 = new Daughter();
        Grandmother grandson1 = new Grandson();

        Grandmother.name();
        System.out.println();
        Son.name();
        Son.work();
        System.out.println();
        Daughter.name();
        Daughter.work();
        System.out.println();
        Grandson.name();
        Grandson.work();






    }
}
