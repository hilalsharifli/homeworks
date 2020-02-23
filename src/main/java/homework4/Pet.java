package homework4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;

    String [] habits;

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

    String checkSly (int trickLevel) {
        if (trickLevel>50) return "Very Sly";
        else {
            return "almost not sly";
        }
    }
    @Override
    public String toString()
    {return String.format( "dog{" + species + " nickname=" + nickname + ", age=" + age + " habits=" + Arrays.toString(habits) + "}"); }
}
