package org.example.version4.people;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, String[][] schedule){
        super(name, surname, year, iq, schedule);
    }

    public void makeup() {
        System.out.println("Woman is doing makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my pet");
    }
}