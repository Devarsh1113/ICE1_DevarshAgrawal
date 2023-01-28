package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++)
        {
            Card card = new Card();
            int j = (int)(Math.random()*13 + 1) ;
            card.setValue(j);
            int a = (int)(Math.random()*4 ) ;
            card.setSuit(Card.SUITS[a]);
            hand[i] = card; 
        }

        for (int i = 0; i < hand.length; i++)
        {
            //System.out.println("The Card Number is: " + hand[i].getValue() + " and the SUIT is: " + hand[i].getSuit());
        }
        System.out.println("Please Enter a card number to choose: " );
        int a = input.nextInt();
        System.out.println("Choose a Card Suit as well: " );
        String b = input.next();
        for(int i=0;i<hand.length;i++)
        {
            if(a == hand[i].getValue() && b.equalsIgnoreCase(hand[i].getSuit()))
            {
              printInfo();  
            }   
            
        }
    }

    public static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Devarsh G Agrawal, but you can call me Devarsh");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be a successfull program developer.");
        System.out.println("-- Top a Semester and my Course.");
	    System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Basketball");
        System.out.println("-- Gyming");
        System.out.println("-- Watching TV");
        System.out.println("-- Exploring new places.");

        System.out.println();

    }

}
