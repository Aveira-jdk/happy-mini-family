package org.example.version3;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("*silent sounds*");
    }

    @Override
    public Species getSpecies() {
        return Species.FISH;
    }

    @Override
    public void foul() {
        System.out.println("Fish has fouled, I need to cover it up!");
    }
}
