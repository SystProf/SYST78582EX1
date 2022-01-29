package pickacard;

/*
* Name: Priyanshu patel
* Student id: 991624476
*/

public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   
   public Card(int value, String suit){
       this.value = value;
       this.suit = suit;
   }
   public Card(){}
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    void printInfo() {
        System.out.printf("%s%d %s%s%n","Magic hand contains "
                        + "your card(",this.getValue(),this.getSuit(),")");
    }

   
      
}