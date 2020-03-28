package homework8;

import java.util.Set;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);
    }

    public DomesticCat() {
    }

    @Override
    void respond(String name) {

    }
}
