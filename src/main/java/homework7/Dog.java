package homework7;

public class Dog extends Pet {


    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Dog() {
    }

    @Override
    void respond(String name) {

    }
}
