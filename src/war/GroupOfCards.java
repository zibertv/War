package war;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {   
    protected ArrayList<Card> cards;
    
    public GroupOfCards() {
        cards = new ArrayList<>();
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }
    public int getSize() {
        return this.cards.size();
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
}