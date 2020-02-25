package homework6;

public class Human {
    String name;
    String surname;
    int year;
    int IQ;
    Pet pet = new Pet("BullDog", "Bobby", 12, 60, new String[]{"run", "bark", "jump"});
    Human mother;
    Human father;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int IQ, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }

    String[][] schedule = new String[7][2];

    void greetPet(String name) {
        System.out.printf("Hello, %s \n", name);
    }

    void describePet(String specie, int age, int sly) {
        System.out.println("I have a " + specie + " he is " + age + " years old, he is " + pet.checkSly(sly));
    }

    @Override
    public String toString()
    {return String.format( "Human{name=" + name + " surname=" + surname + ", year=" + year + ", iq=" + IQ + ", mother= " + mother.name + " " + mother.surname + ", father= " + father.name + " " + father.surname + ", pet=" + pet + "}"); }
}

