/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Adam Zarkovic
 * @modified by Adam Zarkovic
 * @studentNumber 991641747
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] magicHand = new String[7];

        Card c = new Card();

        for (int i = 0; i < magicHand.length; i++) {
            int generatedSuit = random.nextInt(Card.SUITS.length);
            c.setValue(getRandomCardNumber(1, 13));
            c.setSuit(Card.SUITS[generatedSuit]);
            magicHand[i] = (c.getSuit() + c.getValue());
        }

        while (true) {

            System.out.println("Pick a card, any card Ex(Hearts7): ");
            String userCardChoice = input.nextLine();

            for (int i = 0; i < magicHand.length; i++) {
                if (magicHand[i].equals(userCardChoice)) {
                    System.out.println("The card you selected IS in the 7 card hand, excellent guess!");
                    printInfo();
                    System.exit(0);
                }
            }
            System.out.println("The card you selected is NOT in the 7 card hand, better luck next time!");
        }
    }

    private static int getRandomCardNumber(int lowestCardNumber, int highestCardNumber) {
        return (int) (Math.random() * (highestCardNumber - lowestCardNumber) + lowestCardNumber);
    }

    private static void printInfo() {
        System.out.println("My name is Adam. I am looking forward to learning from you this semester!");
    }
}
