package homework5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int IQ;
    private String[][] schedule = new String[7][2];
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int IQ, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.family = family;
    }

    public Human(String name, String surname, int year, int IQ, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int IQ) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
    }

    public Human() {

    }

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

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    void greetPet(String name) {
        System.out.printf("Hello, %s \n", name);
    }

    void describePet(String specie, int age, int sly) {
        System.out.println("I have a " + specie + " he is " + age + " years old, he is " );
    }


    @Override
    public String toString()
    {return String.format( "Human{name=" + name + " surname=" + surname + ", year=" + year + ", iq=" + IQ + "}"); }
}

