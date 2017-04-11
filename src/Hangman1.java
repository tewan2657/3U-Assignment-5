
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Hangman1 {

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
        
        String englishWord = word;
       // create a variable for 
        String dash = "_ ";
        
     
        
        int length = word.length();
        
     
        
        System.out.println("");
        
      
        
        
        //goes through each letter in the word
        for (int i = 0; i < word.length(); i++) {
            //takes each letter in word
            String temp = word.substring(i, i+1);
            //converts it to character
            char temp1 = temp.charAt(0);
            
            //replaces each character with the dashes
            word = word.replace(temp1, '-');
        }
        
        
        //print out
        System.out.println(word);
        
       StringBuilder realWord = new StringBuilder(word);
        
        
        
        
        while(true){
            
            //asking player 2 to guess a letter 
            System.out.println("Guess a letter");
            // create a variable for the letter guessed by player 2
            String guess = input.nextLine();
            
            
   
      
             if(!word.contains(guess)){
         // System.out.println("You have " + " lives left");
                
                 }
           
            if(word.contains(guess)){
                // 0
                int temp = word.indexOf(guess);
                // char = guess (a)
                 letter = guess.charAt(0);
                realWord.setCharAt(temp, letter);
                
//                String temp1 = word.substring(temp, temp);
//                lines = lines.replace(temp1, guess);
                System.out.println(realWord);
               
            }
           
           
       
        
        
        
            
    }
    }
    }



