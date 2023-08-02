package javaCalcio;

public class Person {
   private String name;
   private int age;

    //COSTRUTTORI
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//override


    @Override
    public String toString() {
        return  "PLAYER:" + "name='" + name + ' ' +
                "age='" + age +' ' ;

    }
}
