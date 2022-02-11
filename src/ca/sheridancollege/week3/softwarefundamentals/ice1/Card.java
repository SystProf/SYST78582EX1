/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modified by Megha Patel
 * 
 */
public class Card {

    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }
}
