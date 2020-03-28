package homework8;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Human father = new Human("Vito", "Karleone", 1950,90,new HashMap<String, String>() {{
            put("MONDAY", "WORK");
            put("TUESDAY", "TRAINING");
        }});
        Human mother = new Human("Jane", "Karleone", 1955,85, new HashMap<String, String>() {{
            put("MONDAY", "WORK");
            put("TUESDAY", "TRAINING");
        }});
        Human human = new Human("Michael", "Karleone", 1977, 90);
        human.setSchedule(new HashMap<String, String>() {{
            put("WEDNESDAY", "WORK");
            put("THURSSDAY", "TRAINING");
        }});
        Family family = new Family(mother,father);
        Human child = new Human("Sonny", "Karleone", 1975, 70,new HashMap<String, String>() {{
            put("SATURDAY", "WORK");
            put("SUNDAY", "TRAINING");
        }});
        Human child1 = new Human("Johny","Karleone",1970, 70,new HashMap<String, String>() {{
            put("FRIDAY", "WORK");
            put("TUESDAY", "TRAINING");
        }});
        Dog dog = new Dog();

      //  family.setPet(pet);
       family.addChild(child);
       family.addChild(child1);

       // dog.setHabits();



        human.greetPet("Bobby");
        human.describePet(Species.BULLDOG.name(), 12, 42);



        System.out.println(human);

        System.out.println("Family members count is " +  family.countFamily(family));

        System.out.println(family);

      //  family.deleteChild(child);
      //  family.deleteChild(child1);

        System.out.println("Family members count is " + family.countFamily(family));

        System.out.println(family);

        family.addChild(child);
        family.addChild(child1);


        family.printChildren();

        System.out.println("Family members count is " + family.countFamily(family));

        System.out.println(family);


    }
}
