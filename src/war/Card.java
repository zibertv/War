package war;

public abstract class Card {
    //default modifier for child classes
    private Rank rank;
    private String suit;
    
    public Card(Rank rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public Rank getRank() {
        return this.rank;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public String getSuit() {
        return this.suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public int compareOrdinal(Card card) {
        if (this.getRank().ordinal() < card.getRank().ordinal()) {
            return -1;
        } else if (this.getRank().ordinal() == card.getRank().ordinal()) {
            return 0;
        } else {
            return 1;
        }
    } 
    
    @Override
    public abstract String toString();
}