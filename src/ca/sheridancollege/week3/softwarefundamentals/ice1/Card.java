package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 *
 * @author dancye
 * @modified by Megha Patel
 * @modified by Yves Donato
 *
 */
public class Card {

    private String suit; // clubs, spades, diamonds, hearts
    private int suitnum;// 1-4
    private int value;// 1-13

    public static final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };
    /**
     * Card Constructors
     */
    public Card(){}
    public Card(int suitnum, int value){
        this.suitnum = suitnum;
        suit = SUITS[suitnum];
        this.value = value;
    }
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suitnum) {
        suit = SUITS[suitnum];
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    /**
     * @return the Card
     */
    public String getCard(){
        String randcard = getSuit() + " " + getValue();
        return randcard;
    }
    /**
     * @return printInfo
     */
    public static String printInfo(){
        String info = "\nI'm Yves, I love video games and I want to be a " +
                "gamedev in the future. \nI'am taking this program to improve" +
                " my coding skills before I take what program I actually want" +
                "to do in the future. \nThe Program is only 16 months so I'll" +
                " be finish soon :)";
        return info;
    }
}