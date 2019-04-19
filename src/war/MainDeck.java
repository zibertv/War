/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public class MainDeck extends GroupOfCards {
    
    public MainDeck() {
        String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
        for (Rank rank : Rank.values()) {
            for (String suit: suits) {
                this.cards.add(new RegularCard(rank, suit, true));
            }
        }
        this.shuffle();
    }
    
    public void dealCards(ArrayList<Card> deckOne, ArrayList<Card> deckTwo) {
        for (int i = 0; i < this.cards.size(); i++) {
            if (i % 2 == 0) {
                deckOne.add(this.cards.get(i));
            } else {
                deckTwo.add(this.cards.get(i));
            }
        }
    }
}
