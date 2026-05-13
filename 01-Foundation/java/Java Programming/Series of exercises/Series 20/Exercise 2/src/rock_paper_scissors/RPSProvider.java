package rock_paper_scissors;

import main.Provider;
import main.Playable;

import java.security.SecureRandom;

public class RPSProvider implements Provider {

    private final SecureRandom rand = new SecureRandom();

    @Override
    public boolean hasMore() {
        /* Implement the program based on instructions */
    }

    @Override
    public Playable getNext() {
        // You can use `rand.nextInt(3)` that returns a random int between 0 and 2
        /* Implement the program based on instructions */
    }
}