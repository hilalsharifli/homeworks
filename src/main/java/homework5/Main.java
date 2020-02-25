package homework5;

public class Main {

    public static void main(String[] args) {

        Human father = new Human("Vito", "Karleone", 1950);
        Human mother = new Human("Jane", "Karleone", 1955);
        Human human = new Human("Michael", "Karleone", 1977, 90);
        human.setSchedule(new String[][]{{"monday", "tuesday"}, {"task1", "task2"}});
        Family family = new Family(mother,father);
        Human child = new Human("Sonny", "Karleone", 1975, 70,family);
        Human child1 = new Human("Johny","Karleone",1970, 70,family);
        Pet pet = new Pet("Terrier", "Lily",12,60,new String[]{"hunting","coursing"});

        family.setPet(pet);
        family.addChild(child);
        family.addChild(child1);

        human.greetPet("Bobby");
        human.describePet("bulldog", 12, 42);



        System.out.println(human);

        System.out.println(family);


    }
}
