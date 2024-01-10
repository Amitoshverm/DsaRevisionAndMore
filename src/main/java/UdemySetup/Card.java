package UdemySetup;

public class Card {

    private Suit suit;
    private String face;
    private int rank;

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        return "ok";
    }

    public Card getNumericCard(Suit suit, int number){
        return null;
    }

    public Card getFaceCard(Suit suit, char abbrev) {
        return null;

    }

}
