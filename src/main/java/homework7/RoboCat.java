package homework7;

public class RoboCat extends Pet {

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public RoboCat() {
    }

    @Override
    void respond(String name) {

    }
}
