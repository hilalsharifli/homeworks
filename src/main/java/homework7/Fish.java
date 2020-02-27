package homework7;

public class Fish extends Pet {

    public Fish(String nickname) {
        super(nickname);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Fish() {
    }

    @Override
    void respond(String name) {

    }
}
