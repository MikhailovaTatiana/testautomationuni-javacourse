package salt.testautouni.javacourse.exercises.coinTossGame;

import java.util.Random;

public class Coin {
    private String side;
    private final String HEAD = "head";
    private final String TAIL = "tail";

    protected String getSide() {
        return side;
    }

    protected void setSide(String side) {
        this.side = side;
    }

    protected String flip() {
        if (new Random().nextBoolean()) {
            setSide(HEAD);
        } else setSide(TAIL);
        return getSide();
    }
}
