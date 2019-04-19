package war;

import java.util.ArrayList;

public class WarPlayer extends Player {
    private GroupOfCards cards;

    public WarPlayer() {
        cards = new GroupOfCards();
    }
    
    public WarPlayer(String playerID) {
        super(playerID);
        cards = new GroupOfCards();
    }
    
    public GroupOfCards getCards() {
        return this.cards;
    }
    
    public Card revealTopCard() {
        Card topCard = cards.getCards().get(cards.getCards().size() - 1);
        cards.getCards().remove(topCard);
        return topCard;
    }
    
    @Override
    public void play() {
        // do nothing
    }
}
