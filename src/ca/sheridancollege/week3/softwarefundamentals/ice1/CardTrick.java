/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static ca.sheridancollege.week3.softwarefundamentals.ice1.Card.SUITS;
//import com.sun.org.apache.bcel.internal.generic.InstructionConst;
//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//import sun.awt.SunHints;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by AmaanSheikh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {

        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            int randIndex = ThreadLocalRandom.current().nextInt(SUITS.length);
            String randElement = SUITS[randIndex];
            int valueNum = ThreadLocalRandom.current().nextInt(1,13);
            ///magicHand[i] = (this.randElement,valueNum);
            
        }
        
         }
    
    
}
