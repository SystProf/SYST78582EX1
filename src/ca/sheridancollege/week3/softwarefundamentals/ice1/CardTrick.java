/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sheridan Archer
 * @modified by Sheridan Archer
 * Date = January 27, 2022.
 * Student number = 99163321
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        boolean card = false;
        Scanner in = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int index = random.nextInt(Card.SUITS.length);
            c.setSuit(Card.SUITS[index]);
            c.setValue(getRandomNumer(1,13));
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        System.out.println("Pick A Card");
        String userInput = in.nextLine();
        for(int i=0; i<magicHand.length;i++)
        {
            if(magicHand[i].getSuit().equals(userInput))
            {
                System.out.println("This card is in the deck");
                card = true;
                break;
                
            }
        }
        if(!card)
        {
            System.out.println("The card is not in the hand or does not exist"); 
        }
    }

    private static int getRandomNumer(int min, int max) {
        return (int) ((Math.random() * (max-min)) + min);    
    }
    
    public String PrintInfo()
    {
        return "My name is Sheridan Archer and I am excited to learn in this class and I am done with this exercise";
    }
}
