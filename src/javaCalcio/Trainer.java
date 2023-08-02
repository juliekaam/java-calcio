package javaCalcio;

public class Trainer extends Person {

    private String strategy;

    public Trainer(String name, int age, String strategy) {
        super(name, age);
        this.strategy = strategy;
    }  //override

    @Override
    public String toString() {
        return super.toString() +",strategia"+ strategy;
    }
}
