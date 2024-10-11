package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * modified by Baldeen 4 October 2024
 */
public class GroupOfCards {
    private final ArrayList<Card> cards; // The group of cards
    private int size; // The size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>(size); // Initialize the card list with the specified size
    }

    // Get the group of cards
    public ArrayList<Card> getCards() {
        return cards;
    }

    // Shuffle the cards in the group
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Get the size of the group of cards
    public int getSize() {
        return size;
    }

    // Set the max size for the group of cards
    public void setSize(int size) {
        this.size = size;
    }

    // Main method for testing the GroupOfCards class
    public static void main(String[] args) {
        GroupOfCards group = new GroupOfCards(52); // Create a group of 52 cards

        // Adding ConcreteCard instances to the group
        for (int i = 1; i <= 52; i++) {
            group.getCards().add(new PlayingCard("Card " + i, "Type " + i)); // Provide required arguments
        }

        // Display the cards before shuffling
        System.out.println("Cards before shuffling:");
        for (Card card : group.getCards()) {
            System.out.println(card);
        }

        // Shuffle the cards
        group.shuffle();

        // Display the cards after shuffling
        System.out.println("\nCards after shuffling:");
        for (Card card : group.getCards()) {
            System.out.println(card);
        }
    }
}
