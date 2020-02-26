package homework6;

public class Main {

    public static void main(String[] args) {
        Human father = new Human("Vito", "Karleone", 1950,90, new String[][]{{DayOfWeek.MONDAY.name(), DayOfWeek.TUESDAY.name() },{"Work","Training"}});
        Human mother = new Human("Jane", "Karleone", 1955,85, new String[][]{{DayOfWeek.MONDAY.name(), DayOfWeek.TUESDAY.name() },{"Playing","Walking"}});
        Human human = new Human("Michael", "Karleone", 1977, 90);
        human.setSchedule(new String[][]{{"monday", "tuesday"}, {"task1", "task2"}});
        Family family = new Family(mother,father);
        Human child = new Human("Sonny", "Karleone", 1975, 70,new String[][]{{"Monday","Tuesday"},{"Playing Soccer","Swimming"}});
        Human child1 = new Human("Johny","Karleone",1970, 70,new String[][]{{"Monday","Tuesday"},{"Working","Music Listening"}});
        Pet pet = new Pet(Species.TERRIERS, "Lily",12,60,new String[]{"hunting","coursing"});

        family.setPet(pet);
        family.addChild(child);
        family.addChild(child1);

        human.greetPet("Bobby");
        human.describePet("bulldog", 12, 42);



        System.out.println(human);

        System.out.println("Family members count is " +  family.countFamily(family));

        System.out.println(family);

        family.deleteChild(0);
        family.deleteChild(1);

        System.out.println("Family members count is " + family.countFamily(family));

        System.out.println(family);

        family.addChild(child1);

        System.out.println("Family members count is " + family.countFamily(family));

        System.out.println(family);


    }
}
