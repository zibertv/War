package war;

public class RegularCard extends Card {
    private boolean faceDown;
    
    public RegularCard(Rank rank, String suit, boolean faceDown) {
        super(rank, suit);
        this.faceDown = faceDown;
    }
    
    public boolean isFaceDown() {
        return this.faceDown;
    }
    public void setFaceDown(boolean faceDown) {
        this.faceDown = faceDown;
    }
    
    @Override
    public String toString() {
        return this.getRank() + " OF " + this.getSuit();
    }
}
