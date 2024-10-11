/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Author: Baldeen
 * Date: [4 October 2024]
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 4 October 2024
 */
public abstract class Game {

    private final String name; // the title of the game
    private ArrayList<Player> players; // the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Adds a player to the game.
     *
     * @param player the player to add
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Removes a player from the game.
     *
     * @param player the player to remove
     */
    public void removePlayer(Player player) {
        players.remove(player);
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

    /**
 * Main method for testing and demonstration purposes.
 *
 * @param args the command line arguments passed to the program (not used in this example)
 */
    public static void main(String[] args) {
        // Create a new SimpleGame instance
        SimpleGame myGame = new SimpleGame("Card Game");

        // Add players to the game
        myGame.addPlayer(new RandomPlayer("Alice"));
        myGame.addPlayer(new RandomPlayer("Bob"));

        // Play the game
        myGame.play();

        // Declare the winner
        myGame.declareWinner();
    }
}

// Simple concrete subclass for demonstration
class SimpleGame extends Game {

    public SimpleGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing the game: " + getName());
        // Implement specific game logic here
        for (Player player : getPlayers()) {
            player.displayInfo(); // Display player information
            player.play(); // Call the play method for each player
        }
    }

    @Override
    public void declareWinner() {
        // Example logic to declare a winner (for demonstration purposes)
        if (!getPlayers().isEmpty()) {
            System.out.println("The winner is: " + getPlayers().get(0).getName());
        } else {
            System.out.println("No players in the game to declare a winner.");
        }
    }
}

// A simple RandomPlayer class to demonstrate player actions
class RandomPlayer extends Player {

    public RandomPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Implement the logic for how a random player plays the game.
        System.out.println(getName() + " is taking their turn randomly.");
        // Add logic here for the player's actions during their turn.
    }
}
