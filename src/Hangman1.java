
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
        
     // ask player one to enter a word 
        System.out.println("Please enter a word");
        // create a varibale for the word entered by player one 
        String word = input.nextLine();
       // creat a variable for  
        String dash = " _";
        
        
        int length = word.length();
        
        for(int i=0; i<length; i++){
           String lines =(word.replace(word, dash));
            System.out.print(lines);
        }
        
        System.out.println("");
        
        while(true){
            
            //asking player 2 to guess a letter 
            System.out.println("Guess a letter");
            // create a variable for the letter guessed by player 2
            String guess = input.nextLine();
            
   
      
             if(!word.contains(guess)){
         
                System.out.println("You have " + " lives left");
                
                 }
            
            if(word.contains(guess)){
               word.indexOf(guess);
          
               
               
            }
           
           
       
        
        
        
            
    }
    }
    }



