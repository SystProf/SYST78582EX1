/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Megha Patel
 * @modified by Harriet Liwayan
 * @author Harriet Liwayan
 * Student ID: 991639959
 * Date: January 27, 2022
 */

import java.util.Scanner;

public class CardTrick {
    
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        Card[] magicHand = new Card[7];
        
        //Creating a new instance og Card.java object
        Card cardVal = new Card();
        

        System.out.println("Welcome!");    
        
        
        System.out.println( "Think of the value of the card from 1-13: ");
        int userVal = in.nextInt();
        cardVal.setUserVal(userVal); //calling Card.java setUserVal method
        
        System.out.println("Now pick a suit: 1 = Spades, 2 = Clubs, 3 = Hearts, 4 = Diamonds");
        int suitVal = in.nextInt();
        cardVal.setSuit(Card.SUITS[cardVal.randomSuit()]);  //calling Card.java setUserSuit method
        
        System.out.println("You chose the card: " + cardVal.getUserVal() + " " + cardVal.getSuit());

        for (int i = 0; i < magicHand.length; i++) {

            Card c = new Card();

            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);

            magicHand[i] = c;

        }        
        
        System.out.println("7 Cards will be displayed.");

        for (Card userHand : magicHand) {

            System.out.print(userHand.getValue() + " " + userHand.getSuit() + "\n");
        
            if(userHand.getSuit().equals(cardVal.getUserSuit()) && cardVal.getUserVal() == userHand.getValue()) {

                System.out.println("Matching Hand!");

            }else

                System.out.println("Not a Match");

        }
        
        System.out.println("Thanks for playing!");
    }
}



    
    
