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
 * @author Bernard Abalos
 * @modified by Bernard Abalos
 * Student ID: 991485289
 * 2022/01/29
 * 
 * 
 */
import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] magicHand = new String[7];
        
        Card c = new Card();
        
        for (int i=0; i<magicHand.length; i++)
        {
            int genSuit1 = random.nextInt(Card.SUITS.length);
            c.setValue(getRandomCardNumber(1, 13));
            c.setSuit(Card.SUITS[genSuit1]);
            magicHand[i] = (c.getSuit() + c.getValue());

         }
        
        while (true) {
            
            System.out.println("Pick a card: ");
            String userCardChoice = input.nextLine();
            
            for(int i = 0; i < magicHand.length; i++) {
                if (magicHand[i].equals(userCardChoice)) { 
                    System.out.println("The card is in the hand! Congratulations.");
                    printInfo();
                    System.exit(0);
                   
                }
            }
            System.out.println("The card is not in the hand. Sorry.");
        }
        
       
        
         }

    private static int getRandomCardNumber(int lowCardNum, int hiCardNum) {
        return (int) (Math.random() * (hiCardNum - lowCardNum) + lowCardNum);
    }
    
    private static void printInfo() {
       //I'm done!!!
        System.out.println("I am Bernard. I enjoy gaming and programming. Here's to a wonderful semester.");
        
  }
}
   

