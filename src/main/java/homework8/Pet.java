package homework8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;

    private Set<String> habits = new HashSet<String>();

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, Set habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public Pet() {

    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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

    public Set getHabits() {
        return habits;
    }

    public void setHabits(Set habits) {
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

    abstract void respond (String name);

    void foul() {
        System.out.println("I need to cover up");
    }

    @Override
    public String toString()
    {return String.format( "dog{" + species + " nickname=" + nickname + ", age=" + age + " habits=" + habits.toString() + "}"); }
}
