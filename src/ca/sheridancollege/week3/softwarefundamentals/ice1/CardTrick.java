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
 * @author Arif Faysal
 * @date Jan 27, 2022
 * @modified by Megha Patel
 * @modified by Arif Faysal
 * @student no 991652842
 * 
 */
public class CardTrick {
    
    public static void printInfo(String msg) {
        System.out.println(msg);
        System.out.println("Arif Faysal - Edited from Github");
    }
    
    public static void checkCard(String input1, int input2, Card[] magicHand) {
        
        for (int i=0; i<magicHand.length; i++)
        {
            if( magicHand[i].getSuit().equalsIgnoreCase(input1) && magicHand[i].getValue()== input2) {
                printInfo("Found A Match with\n"+magicHand[i].getSuit()+"|"+magicHand[i].getValue() );
                break;
            } 
        }

    }
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        String msg1 = "Guess a Suit:\nHearts\nDiamonds\nSpades\nClubs";
        String msg2 = "Guess a Value:\n1: Ace\n2-10: 2-10\n11: Jack\n12: Queen\n13: King";
        
        String input1;
        int input2;
        
        Random randomSuit = new Random();
        Random randomValue = new Random();
       
        Scanner scn = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue( randomValue.nextInt(13-1)+1);
            c.setSuit( Card.SUITS[ randomSuit.nextInt(3) ] );
            magicHand[i] = c;
        }
        
//        for checking
//        for (int i=0; i<magicHand.length; i++)
//        {
//            System.out.println( magicHand[i].getSuit()+"|"+magicHand[i].getValue() );
//        }
        
        System.out.println(msg1);
        input1 = scn.next();
        System.out.println(msg2);
        input2 = scn.nextInt();
        
        checkCard(input1, input2, magicHand);
        
    }
    
}
