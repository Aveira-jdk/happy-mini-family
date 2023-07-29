package org.example.version3.animals;

import org.example.version3.enums.Species;

public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Failure!");
    }

    @Override
    public Species getSpecies() {
        return Species.DOG;
    }

    @Override
    public void foul(){
        System.out.println("Dog has fouled, I need to cover it up!");
    }
}
