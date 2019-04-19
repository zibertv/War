package war;

import java.util.Scanner;
import java.util.ArrayList;

public class War extends Game {
    MainDeck mainDeck = new MainDeck();
    private GroupOfCards warPile;
    
    public War() {
        super("WAR");
    }
    
    @Override
    public void play() {
        System.out.println("Welcome to " + this.getGameName() + "!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerID = input.nextLine();
        System.out.println();
        this.setPlayer(new WarPlayer(playerID));
        this.setPlayer(new WarPlayer("CPU PLAYER"));
        
        ArrayList<Card> playerCards;
        playerCards = ((WarPlayer)this.getPlayers().get(0)).getCards().getCards();
        ArrayList<Card> cpuCards;
        cpuCards = ((WarPlayer)this.getPlayers().get(1)).getCards().getCards();
        
        mainDeck.dealCards(playerCards, cpuCards);
        
        while (playerCards.size() != 0 && cpuCards.size() != 0) {
            System.out.print("Press enter to flip...");
            input.nextLine();
            Card playerReveal = ((WarPlayer)this.getPlayers().get(0)).revealTopCard();
            Card cpuReveal = ((WarPlayer)this.getPlayers().get(1)).revealTopCard();
            System.out.println(this.getPlayers().get(0).getPlayerID() + 
                    " FLIPPED OVER " + playerReveal.toString());
            System.out.println("CPU PLAYER FLIPPED OVER " + 
                    cpuReveal.toString());
            
            warPile = new GroupOfCards();
            while (playerReveal.compareOrdinal(cpuReveal) == 0) {
                warPile.getCards().add(playerReveal);
                warPile.getCards().add(cpuReveal);
                
                System.out.println("WAR HAS OCCURED!");
                
                if (playerCards.size() <= 3 || cpuCards.size() <= 3) {
                    playerCards.clear();
                    System.out.println("NOT ENOUGH CARDS...");
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (!((RegularCard)playerCards.get(playerCards.size() - 1)).isFaceDown()) {
                        ((WarPlayer)this.getPlayers().get(0)).getCards().shuffle();
                        System.out.println(this.getPlayers().get(0).getPlayerID() + 
                                " SHUFFLED CARDS...");
                        for (Card cards : playerCards) {
                            ((RegularCard)cards).setFaceDown(true);
                        }
                    }
                    if (!((RegularCard)cpuCards.get(cpuCards.size() - 1)).isFaceDown()) {
                        ((WarPlayer)this.getPlayers().get(1)).getCards().shuffle();
                        System.out.println("CPU PLAYER SHUFFLED CARDS...");
                        for (Card cards : cpuCards) {
                            ((RegularCard)cards).setFaceDown(true);
                        }
                    }
                    warPile.getCards().add(playerCards.get(playerCards.size() - 1));
                    playerCards.remove(playerCards.size() - 1);
                    warPile.getCards().add(cpuCards.get(cpuCards.size() - 1));
                    cpuCards.remove(cpuCards.size() - 1);
                }
                playerReveal = ((WarPlayer)this.getPlayers().get(0)).revealTopCard();
                cpuReveal = ((WarPlayer)this.getPlayers().get(1)).revealTopCard();
                System.out.println(this.getPlayers().get(0).getPlayerID() + 
                    " FLIPPED OVER " + playerReveal.toString());
                System.out.println("CPU PLAYER FLIPPED OVER " + 
                    cpuReveal.toString());
            }
            for (int i = 0; i < warPile.getSize(); i++) {
                ((RegularCard)warPile.getCards().get(i)).setFaceDown(false);
            }
            if (playerReveal.compareOrdinal(cpuReveal) == 1) {
                System.out.println(this.getPlayers().get(0).getPlayerID() + 
                        " WINS!");
                ((RegularCard)cpuReveal).setFaceDown(false);
                playerCards.add(0, cpuReveal);
                ((RegularCard)playerReveal).setFaceDown(false);
                playerCards.add(0, playerReveal);
                for (Card card : warPile.getCards()) {
                    playerCards.add(0, card);
                }
            } else if (playerReveal.compareOrdinal(cpuReveal) == -1) {
                System.out.println("CPU PLAYER WINS!");
                
                ((RegularCard)cpuReveal).setFaceDown(false);
                cpuCards.add(0, cpuReveal);
                
                ((RegularCard)playerReveal).setFaceDown(false);
                cpuCards.add(0, playerReveal);
                
                for (Card card : warPile.getCards()) {
                    cpuCards.add(0, card);
                }
            }
            
            System.out.println();

            if (playerCards.size() != 0) {
                if (!((RegularCard)playerCards.get(playerCards.size() - 1)).isFaceDown()) {
                    ((WarPlayer)this.getPlayers().get(0)).getCards().shuffle();
                    System.out.println(this.getPlayers().get(0).getPlayerID() + 
                            " SHUFFLED CARDS...");
                    
                    for (Card cards : playerCards) {
                        ((RegularCard)cards).setFaceDown(true);
                    }
                    
                }
            }
            if (cpuCards.size() != 0) {
                if (!((RegularCard)cpuCards.get(cpuCards.size() - 1)).isFaceDown()) {
                    ((WarPlayer)this.getPlayers().get(1)).getCards().shuffle();
                    System.out.println("CPU PLAYER SHUFFLED CARDS...");
                    
                    for (Card cards : cpuCards) {
                        ((RegularCard)cards).setFaceDown(true);
                    }
                    
                }
            }
        }
    }
    
    public void declareWinner() {
        int numCards = ((WarPlayer)this.getPlayers().get(0)).getCards().getCards().size();
        if (numCards == 0) {
            System.out.println("CPU PLAYER WON THE GAME!");
        } else {
            System.out.println(this.getPlayers().get(0).getPlayerID() + 
                    "WON THE GAME!");
        }
    }
    
    public static void main(String[] args) {
        War game = new War();
        game.play();
        game.declareWinner();
    }
}