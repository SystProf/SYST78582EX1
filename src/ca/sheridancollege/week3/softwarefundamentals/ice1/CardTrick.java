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
 * @author Julian Ellis 29/01/2022
 * @modified by Julian Ellis 991654874 
 * 
 */
public class CardTrick {
    
    public static void main(String[] args) throws Exception
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            c.setValue(rand.nextInt(12)+1);
            magicHand[i]=c;
             }
        //firt card in magic hand for testing purposes
//        System.out.println(magicHand[0].getValue()+" of "+magicHand[0].getSuit());

        Scanner s = new Scanner(System.in);
        Card pc = new Card();
        
        System.out.println("Pick a Card");
        System.out.println("Enter Suit Number   (Hearts = 0, Diamonds = 1, Spades = 2, Clubs = 3)");        
        pc.setSuit(Card.SUITS[s.nextInt()]);
        
        System.out.println("Enter Card Number (1= Ace, 11= Jack, 12= Queen, 13= Ace");
        pc.setValue(s.nextInt());
        System.out.println("Card selected: "+pc.getValue()+" of "+pc.getSuit());
        
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit() == pc.getSuit() && magicHand[i].getValue() == pc.getValue()) {
                printInfo();
                return;
            }
            else{
                i++;                
            }            
        }
        
        }
//I'm Done!!!
    private static void printInfo() {
        System.out.println("My name is Julian Ellis and I am a magician");
    }
        
        
         }
    

