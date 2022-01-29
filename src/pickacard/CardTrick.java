package pickacard;

/*
 * Name: Priyanshu Patel
 * Student ID: 991624476
*/
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random()*13)+1);
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
        for (Card magicHand1 : magicHand) {
            System.out.printf("%-10d%s%n", magicHand1.getValue(), 
                    magicHand1.getSuit());
        }
        Scanner input = new Scanner(System.in);
        
        Card c1 = new Card();
        System.out.printf("%-50s", "Enter your desired card number");
        c1.setValue(input.nextInt());
        System.out.printf("%-50s", "Enter your desired suit");
        c1.setSuit(input.next());
        
        //Hard coded luckyCard
        Card luckyCard = new Card(1,"Spades");
        
        int control =0;
        for (Card magicHand1 : magicHand) {
            if ((c1.getSuit().equalsIgnoreCase(magicHand1.getSuit())) && 
                    (c1.getValue() == magicHand1.getValue())){
                
                c1.printInfo();
                
                control =1;
                break;
            } 
        }
        
        
        if(control==0){
            System.out.printf("%s%d %s%s%n","Magic hand does not contain"
                    + " your card(",c1.getValue(),c1.getSuit(),")");
        }
    }
}
    