package homework8;

import java.util.Set;

public class Dog extends Pet {


    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Dog() {
    }

    @Override
    void respond(String name) {

    }
}
