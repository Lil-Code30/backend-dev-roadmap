public class Letter {
    private final char letter;
    public Letter(char c) {
        this.letter = c;
    }
    public char shownLetter() {
        return this.letter;
    }
    public boolean isSecret() {
        return false;
    }
    public boolean isWrong() {
        return false;
    }
    public boolean isPlayed() {
        return false;
    }
}
