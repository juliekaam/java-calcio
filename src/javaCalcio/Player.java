package javaCalcio;

public class Player extends Person {
    private String role;
    public Player(String name, int age,String role) {
        super(name, age);
        this.role=role;

    }
    //override

    @Override
    public String toString() {
        return super.toString() + ",ruolo"+ role;
    }
}
