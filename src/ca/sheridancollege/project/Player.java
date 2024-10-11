/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 4 October 2024
 * 
 */
public abstract class Player {

    private String name; // the unique name for this player

    /**
     * A constructor that allows you to set the player's unique name
     *
     * @param name the unique name to assign to this player.
     */
    public Player(String name) {
        setName(name);
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the player name ensuring it is unique.
     *
     * @param name the player name to set
     * @throws IllegalArgumentException if the name is null or empty
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Player name cannot be null or empty");
        }
        // Here you could add additional logic to ensure uniqueness across all players
        this.name = name;
    }

    /**
     * Displays the player's information.
     */
    public void displayInfo() {
        System.out.println("Player Name: " + getName());
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player
     * and filled in with logic to play your game.
     */
    public abstract void play();

    /**
     * Main method for testing the Player class.
     */
    
    public static void main(String[] args) {
        // Create an instance of a concrete subclass of Player
        PlayingCard player1 = new PlayingCard("Alice");
        PlayingCard player2 = new PlayingCard("Bob");

        // Display player information
        player1.displayInfo();
        player2.displayInfo();

        // Call the play method
        player1.play();
        player2.play();
    }
}

// A simple concrete subclass of Player for demonstration
class PlayingCard extends Player {

    public PlayingCard(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing their turn.");
        // Add specific logic for the player's turn here
    }
}
