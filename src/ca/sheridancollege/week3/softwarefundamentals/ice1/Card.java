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
 * @modified by Harriet Liwayan
 * @author Harriet Liwayan
 * Student ID: 991639959
 * Date: January 27, 2022
 */
import java.util.Scanner;

public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   public int userVal;
   public String userSuit;
   

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card() {
        
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
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public int randomValue() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ranVal = (int)(Math.random()*13) + 1;
        return ranVal;
    }
   
    public int randomSuit() {
        int ranSuit = (int)(Math.random()*4) + 0;
        return ranSuit;
    
    }
    public int getUserVal() {
      return userVal;
    }
    
    public void setUserVal(int userVal) {
        this.userVal = userVal;
    }
    
    public String getUserSuit() {
        return userSuit;
    }
    
    
}
