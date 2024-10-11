package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 */

/**
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 4 October 2024
 */
public abstract class Card {
    // Default modifier for child classes
    protected String rank;
    protected String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card, etc.
     */
    @Override
    public abstract String toString();

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        // Create an array of Card objects
        Card[] cards = new Card[3];

        // Adding PlayingCard instances to the array
        cards[0] = new PlayingCard("Ace", "Hearts");
        cards[1] = new PlayingCard("2", "Diamonds");
        cards[2] = new PlayingCard("King", "Spades");

        // Print out each card
        System.out.println("Deck of cards:");
        for (Card card : cards) {
            System.out.println(card); // Calls the toString method of PlayingCard
        }
    }
}

// A subclass representing a playing card
class PlayingCard extends Card {
    
    public PlayingCard(String rank, String suit) {
        super(rank, suit);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
