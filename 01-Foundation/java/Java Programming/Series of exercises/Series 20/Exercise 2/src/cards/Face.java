package cards;

public enum Face {
    JACK,
    QUEEN,
    KING,
    ACE;

    @Override
    public String toString() {
        switch (this) {
            case ACE:
                return "ace";
            case KING:
                return "king";
            case QUEEN:
                return "queen";
            case JACK:
                return "jack";
        }
        return "unknown";
    }
}