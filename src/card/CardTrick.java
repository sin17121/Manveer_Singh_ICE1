/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Name:Manveer Singh
 * Student ID: 991788544
 * Date: 28/1/2025
 *  
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random= new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card from 1 ro 13");
        int userValue=scanner.nextInt();
        System.out.println("Pick a suit (Hearts, Diamond, Spades, Clubs):");
        String userSuit = scanner.next();
        
        Card userCard  =new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        // and search magicHand here
        boolean found = false;
        for (Card c : magicHand) {
            if(c.getValue()== userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())){
                found=true;
                break;
            }
        }
        //Then report the result here
        if(found){
            System.out.println("You found your card is in agic Hand");
        }
        else{
          System.out.println("NO! Your card is not in magic hand");

        }
        // add one luckcard hard code 2,clubs
        Card luckyCard= new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        boolean luckyFound = false;
        for(Card c: magicHand){
            if(c.getValue()== luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                luckyFound=true;
                break;
            }
         
        }
        if(luckyFound){
            System.out.println("You found your card is in agic Hand");
        }
        else{
          System.out.println("NO! Your card is not in magic hand");
        }
    }
}
