public class Main {
    /* Implement the program based on instructions */

    /* Implement the program based on instructions */

    public static char asChar(Token a) {
        switch (a) {
            case RED:
                return 'R';
            case YELLOW:
                return 'Y';
            default:
                return ' ';
        }
    }

    public static void display(Token[][] gameState) {
        int nCols = gameState.length;
        int nRows = gameState[0].length;

        for (int i = 0; i < nRows + 2; i++) {
            System.out.print('-');
        }
        System.out.println();

        for (int i = 0; i < nCols; i++) {
            System.out.print('|');
            for (int j = 0; j < nRows; j++) {
                System.out.print(asChar(gameState[i][j]));
            }
            System.out.println('|');
        }

        for (int i = 0; i < nRows + 2; i++) {
            System.out.print('-');
        }
        System.out.println();

        Token w = winner(gameState);
        if (w != Token.NONE) {
            System.out.println("  The winner is: " + w);
        }
    }

    public static boolean isWinningSuite(int i, int j, int di, int dj, int len, Token[][] gameState) {
        Token c = gameState[i][j];
        if (c == Token.NONE) {
            return false;
        }

        for (int k = 1; k < len; k++) {
            int i1 = i + k * di, j1 = j + k * dj;
            if (isOutside(i1, j1, gameState)) {
                return false;
            }
            if (gameState[i1][j1] != c) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOutside(int i1, int j1, Token[][] gameState) {
        return i1 < 0 || i1 >= gameState.length || j1 < 0 || j1 >= gameState[i1].length;
    }

    public static boolean isAnyWinningPattern(int i, int j, Token[][] gameState) {
        int len = 4;
        return isWinningSuite(i, j, +1, 0, len, gameState) ||
                isWinningSuite(i, j, +1, +1, len, gameState) ||
                isWinningSuite(i, j, +1, -1, len, gameState) ||
                isWinningSuite(i, j, 0, +1, len, gameState);
    }

    public static Token winner(Token[][] gameState) {
        for (int i = 0; i < gameState.length; i++) {
            for (int j = 0; j < gameState[i].length; j++) {
                if (isAnyWinningPattern(i, j, gameState)) {
                    return gameState[i][j]; // the color of that cell gives the winner
                }
            }
        }
        return Token.NONE; // no winner
    }

    //----------------------------------------------------------------------------
    //  Small Test
    //----------------------------------------------------------------------------
    public static void tryToPlay(Token player, int colNr, Token[][] gameState) {
        try {
            play(player, colNr, gameState);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int nCols = 6, nRows = 7;

        Token[][] gameState = new Token[nCols][nRows]; // filled with null
        for (int i = 0; i < nCols; i++) {
            for (int j = 0; j < nRows; j++) {
                gameState[i][j] = Token.NONE;
            }
        }
        int[] sequenceOfMoves = {0, 5, 0, 0, 6, 5, 0, 0, 0, 4, 4, 0, 2, 5, 6, 5};
        boolean isPlayer1 = true;

        for (int colNr : sequenceOfMoves) {
            Token player = isPlayer1 ? Token.RED : Token.YELLOW;
            tryToPlay(player, colNr, gameState);
            display(gameState);
            isPlayer1 = !isPlayer1;
        }
    }
}
