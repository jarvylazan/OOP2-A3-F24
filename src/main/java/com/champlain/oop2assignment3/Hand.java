package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Represents a hand of playing cards.
 * <p>
 * This class allows for adding cards to the hand and checking if the hand is empty.
 * It also provides an iterator to traverse the cards in the hand.
 * </p>
 */
public class Hand extends CardCollection implements ScoringStrategy  {
    /**
     * The list of cards in this hand.
     */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Adds a card to this hand.
     *
     * @param pCard the card to be added
     */
    public void addCard(Card pCard) {
        this.aCards.add(pCard);
    }

    /**
     * Checks if this hand is empty.
     *
     * @return true if the hand has no cards, false otherwise
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this hand.
     *
     * @return an iterator for the cards
     */
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    public int calculateScore(CardCollection pCards) {
       int score = 0;
        for (Card pCard : pCards) {
           score = score +
       }
    }

   /** public void score(int pScore, String pChoice){
        if (Objects.equals(pChoice, "Simple Count")){
            calculateScore(pScore);
        }
        else if (Objects.equals(pChoice, "Number Of Aces")){

        }

    }
    */
}

