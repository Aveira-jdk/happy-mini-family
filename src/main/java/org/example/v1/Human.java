package org.example.v1;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
//        this.pet = pet;
//        this.mother = mother;
//        this.father = father;
        this.schedule = schedule;
    }

//    public void greetPet() {
//        System.out.printf("Hello, %s\n", pet.getNickname());
//    }

//    public void describePet() {
//        if (pet.getTrickLevel() >= 50)
//            System.out.printf("I have a %s, he is %s years old, he is very sly \n", pet.getSpecies(), pet.getAge());
//        else
//            System.out.printf("I have a %s, he is %s years old, he is almost not sly \n", pet.getSpecies(), pet.getAge());
//
//    }

//    public void feedPet(boolean isfeed) {
//        if (isfeed) {
//            System.out.println("the owner feeds the pet ");
//            System.out.printf("%s feeds %s", name, pet.getNickname());
//        } else if (!isfeed) {
//            Random r = new Random();
//            int rValue = r.nextInt(101);
//
//            if (pet.getTrickLevel() < rValue) System.out.println("I think Jack is not hungry.");
//            else if (pet.getTrickLevel() > rValue)
////                System.out.println("Hm... I will feed Jack's "+pet.getNickname());
//                System.out.printf("Hm... I will feed %s", pet.getNickname());
//
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", year=" + year + ", iq=" + iq + ", schedule=" + Arrays.deepToString(schedule) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }


}