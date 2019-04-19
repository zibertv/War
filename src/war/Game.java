package war;

import java.util.ArrayList;

public abstract class Game 
{
    private final String gameName;
    private ArrayList <Player> players;
    
    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList();
    }

    public String getGameName() {
        return gameName;
    }
    
    public ArrayList <Player> getPlayers() {
        return players;
    }
    
    public void setPlayer(Player player) {
        this.players.add(player);
    }
    
    public abstract void play();

    public abstract void declareWinner();   
}
