/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author saniya
 * student Id = 991631555
 * date: 27 january 2022
 * @modified by Saniya Farishta
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
       Random ran = new Random();
       for(int i=0;i<magicHand.length;i++)
       {
           Card c = new Card();
          
           c.setValue(ran.nextInt(13)+1); 
           c.setSuit(Card.SUITS[ran.nextInt(4)]); 
           magicHand[i] = c; 
       }
      
       
       Card userCard = new Card();
       int value;
       String suit;
       boolean found = false;
      
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter the value of the card(1-13): ");
       value = scan.nextInt();
       System.out.print("Enter the suit of the card"+Arrays.toString(Card.SUITS)+": ");
       suit = scan.next();
      
       
       userCard.setValue(value);
       userCard.setSuit(suit);
      
       
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == userCard.getValue() && magicHand1.getSuit().equalsIgnoreCase(userCard.getSuit())) {

                found = true;

                 int i = 0;
                /***I'm done!"*/
                printInfo("Found A perfect Match with\n"+magicHand[i].getSuit()+"|"+magicHand[i].getValue() );

                break;
            }
        }
      
       
       if(found)
           System.out.println("User card found in magicHand");
       else
           System.out.println("User card not found in magicHand");
   }

    private static void printInfo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
