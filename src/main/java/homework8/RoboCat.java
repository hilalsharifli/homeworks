package homework8;

import java.util.Set;

public class RoboCat extends Pet {

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);
    }

    public RoboCat() {
    }

    @Override
    void respond(String name) {

    }
}
