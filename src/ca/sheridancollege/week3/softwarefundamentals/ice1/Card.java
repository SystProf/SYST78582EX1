/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import sun.awt.SunHints;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author amaan
 * @modified by AmaanSheikh
 * 
 */
public class Card {

    String randElement;
    int valueNum;
    
   //public String suit; //clubs, spades, diamonds, hearts
   //public int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
/*
   Random random = new Random();
   String randomString = SUITS[random.nextInt(SUITS.length)];
*/
   
   //int randIndex = ThreadLocalRandom.current().nextInt(SUITS.length);
   //String randElement = SUITS[randIndex];
   //return randElement;
   
   public void Card(String randElement,int valueNum) {
       this.randElement = "a";
       this.valueNum = 2;
    }
    
    
   /**
     * @param suit the suit to set
     */
    public void setSuit(String newRandElement) {
        this.randElement = newRandElement;
    }
   /**
     * @return the suit
     */
    public String getSuit() {
        return this.randElement;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int newValueNum) {
        this.valueNum = newValueNum;
    }

    /**
     * @return the value
     */
    public int getValue() {
        //value = (int)Math.random()*13;
        return this.valueNum;
    }


   
   @Override
 public String toString(){
     return "number: " + this.valueNum + "Suit: " + this.randElement;
 }
    
}
