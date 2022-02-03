import java.lang.Math;
import java.util.Scanner;

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
 *
 * @author dancye
 * @modified by Megha Patel
 * @modified by Yves Donato
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int randval;
        int randsuit;
        String strSuit;
        int val;
        int checkVal;
        String checkSuit;
        int numCards =0;

        Card[] magicHand = new Card[7];
        //7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            randval = (int)(Math.random() * 13) + 1;
            randsuit = (int)(Math.random() * 3);
            magicHand[i] = new Card(randsuit, randval);
        }

        //Input
        System.out.println("Pick any Card \n(Suit = clubs, spades, diamonds, " +
                "hearts Case doesn't matter Value = 1-13 number) " +
                "\nnote: Ace = 1, Jack = 11, Queen = 12, King = 13");
        System.out.print("Suit: ");
        strSuit = scan.nextLine();
        System.out.print("Value: ");
        val = scan.nextInt();

        //Checks if inputted value is within the "hand"
        for (int a = 0; a < magicHand.length; a++) {
            checkVal = magicHand[a].getValue();
            checkSuit = magicHand[a].getSuit();
            if(checkVal == val && checkSuit.equalsIgnoreCase(strSuit)){
                numCards++;
            }
        }

        if(numCards > 0) {
            System.out.println("\nThey are " + numCards + " Card in the hand");
            System.out.println(Card.printInfo());
        }
        else{
            System.out.println("They are no Cards in the hand");
        }
    }
}
