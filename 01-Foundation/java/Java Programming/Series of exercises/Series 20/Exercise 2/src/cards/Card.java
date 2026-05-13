package cards;

import main.Playable;

public abstract class Card implements Playable {
    final Suit suit;

    Card(Suit suit) {
        this.suit = suit;
    }
}