
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Hangman3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create a scanner 
        Scanner input = new Scanner(System.in);
       
       char letter; 
     // ask player one to enter a word 
        System.out.println("Please enter a word");
        // create a varibale for the word entered by player one 
        String word = input.nextLine();
       // create a variable for 
        String dash = " _";
        
        
        int length = word.length();
        
        for(int i=0; i<length; i++){
           String lines =(word.replace(word, dash));
            System.out.print(lines);
        }
        
        System.out.println("");
        
        
         //asking player 2 to guess a letter 
            System.out.println("Guess a letter");
            // create a variable for the letter guessed by player 2
            String guess = input.nextLine();
            
            String guesses = "";
            
            //lllllllllllllllll
            letter = guess.charAt(0);
            System.out.println(word.indexOf(letter));
            guesses += letter;
       
            if(word.indexOf(letter)<0){
            System.out.println("bad guess ");
        
            }
            
           
            
    }
}
