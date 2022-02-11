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
 *
 * @author dancye, Wasim Nasser/February 3, 2022
 * @modified by Megha Patel, Wasim Nasser/991658922
 */
public class CardTrick {

    // updated with enums

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creates an array to hold 7 cards
        Card[] magicHand = new Card[7];

        // We'll use Random to generate random numbers
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card.Value value = Card.Value.values()[random.nextInt(13)];
            Card c = new Card(suit, value);
            magicHand[i] = c;
            // System.out.println(c.getSuit() + " " + c.getValue()); // this is just to test the code
        }

        System.out.println("Pick any card combination!");

        System.out.println("First, pick the card suit: ");

        for (int i = 0; i < Card.Suit.values().length; i++) {
            System.out.println((i + 1) + ": " + Card.Suit.values()[i]);
        }

        int choiceOfSuit = scanner.nextInt() - 1;
        Card.Suit chosenSuit = Card.Suit.values()[choiceOfSuit];

        System.out.print("Now pick the card value: ");

        for (int i = 0; i < Card.Value.values().length; i++) {
            System.out.println((i + 1) + ": " + Card.Value.values()[i]);
        }

        int choiceOfValue = scanner.nextInt() - 1;
        Card.Value chosenValue = Card.Value.values()[choiceOfValue];

        // Card userCard = new Card(chosenSuit, chosenValue);

        for (Card card : magicHand) {
            if (chosenSuit.equals(card.getSuit()) && chosenValue.equals(card.getValue())) {
                printInfo();
                return;
            }
        }
        System.out.println("Unfortunately your card does not match one of the 7 magical cards. =(");

    }

    private static void printInfo() {
        // i'm done - was able to push the code to the branch created, edit it on github, fetch/pull it back to intellij, and now will do one final merge
        System.out.println("The card combo you have chosen matches one of the 7 magical cards! =) =) =)");
    }

}
