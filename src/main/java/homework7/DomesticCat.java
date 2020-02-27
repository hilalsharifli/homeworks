package homework7;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public DomesticCat() {
    }

    @Override
    void respond(String name) {

    }
}
