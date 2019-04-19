package war;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public abstract class Player 
{
    private String playerID;
    
    public Player() {
        
    }
    public Player(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerID() 
    {
        return this.playerID;
    }

    public void setPlayerID(String playerID) 
    {
        this.playerID = playerID;
    }
    
    public abstract void play();
}
