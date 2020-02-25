package homework6;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Human father = new Human("Vito", "Karleone", 1950);
        Human mother = new Human("Jane", "Karleone", 1955);
        Human human = new Human("Michael", "Karleone", 1977, 90, mother, father);


        human.greetPet("Bobby");
        human.describePet("bulldog", 12, 42);


        System.out.println(pet);

        System.out.println(human);


    }
}
