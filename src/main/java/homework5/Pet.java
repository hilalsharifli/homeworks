package homework5;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;

    private String [] habits;

    public Pet(String species, String nickname) {
        this.species=species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public Pet() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    String checkSly (int trickLevel) {
        if (trickLevel>50) return "Very Sly";
        else {
            return "almost not sly";
        }
    }

    void eat() {
        System.out.println("I am eating");
    }

    void respond (String name) {
        System.out.printf("Hello owner. I am %s. I miss you", name);
    }

    void foul() {
        System.out.println("I need to cover up");
    }

    @Override
    public String toString()
    {return String.format( "dog{" + species + " nickname=" + nickname + ", age=" + age + " habits=" + Arrays.toString(habits) + "}"); }
}
