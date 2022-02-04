/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye, Wasim Nasser/February 3, 2022
 * @modified by Megha Patel, Wasim Nasser/991658922
 * 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Random random = new Random();
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
            // System.out.println(c.getSuit() + " " + c.getValue()); // this is just to test the code
        }

        System.out.println("Pick any card combination!");

        System.out.print("Pick the card suit: 'Hearts', 'Diamonds', 'Spades', 'Clubs':");

        String userSuit = scanner.nextLine().trim(); // to help get rid of any whitespaces

        System.out.print("Now pick the card value: 1-13 , where 11 is jack, 12 is queen, and 13 is king:");

        int userValue = scanner.nextInt();

        for (Card magicHand1 : magicHand) {
            String suit = magicHand1.getSuit();
            int value = magicHand1.getValue();
            if (userValue == value && userSuit.equals(suit)) {
                printInfo();
                return;
            }
        }
        System.out.println("Unfortunately your card does not match one of the 7 magical cards. =(");
        
    }

    private static void printInfo() {
        System.out.println("The card combo you have chosen matches one of the 7 magical cards! =) =) =)");
    }
    
}
