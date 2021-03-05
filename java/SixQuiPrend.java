

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        int bullHeads = 0;
        if(value == 55)
            bullHeads = 7;
        else if( (value % 5) == 0 && (value % 10) != 0)
            bullHeads = 2;
        else if( (value % 10) == 0)
            bullHeads = 3;
        else if( (value % 10) == value / 10)
            bullHeads = 5;
        else
            bullHeads = 1;
        return bullHeads;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
