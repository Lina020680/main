package homework18;

public class Student {
    public String name;
    public int age;
    public String place;
    public String hobby;

    public Student() {
        name = "no name";
        age = 0;
        place = "no place";
        hobby = "No hobbies";
    }

    public Student(String name, int age, String place, String hobby) {
        this.name = name;
        this.age = age;
        this.place = place;
        this.hobby = hobby;
    }

    public void canDraw() {

        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " lives in Berlin");
        System.out.println(name + " can draw pictures");
    }
}
