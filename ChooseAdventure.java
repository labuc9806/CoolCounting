/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseadventure;

import java.util.Scanner;

/**
 *
 * @author labuc9806
 */
public class ChooseAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner keyedInput = new Scanner (System.in) ;
        
        String response1;
        String response2;
        String response3;
        String response4;
        
        System.out.println("Congratulations!");
        System.out.println ("You have been selected to join Space Mission X! ");
        System.out.println("You will be piloting our very first catstronaut to space,");
        System.out.println("all in a great effort to save Earth from a perilous threat of Space Dinosaurs!");
        System.out.println("So let's begin our adventure!");
        
        System.out.println("Choose your method of transportation. Taco or Racecar ?");
        response1 = keyedInput.nextLine();
        
        if (response1.equals("Taco"))
        {
            System.out.println("Everyone knows a cat's favourite method of transportation is by taco!");
            System.out.println("You 3, 2, 2 BLAST OFF into space!");
            System.out.println("You enter the depths of space, and pick up a transmission...");
            System.out.println("You listen to the transmission and find that it's a cry for help!");
            System.out.println("Answer it? yes/no? ");
            response2 = keyedInput.nextLine();
            if (response2.equals ("no"))
            { 
                System.out.println("You continue on your journey.");
                System.out.println("After days of space travel, the catstronaute encounters a strange object.");
                System.out.println("You decided to investigate, and stumble upon a flaoting bottle of...");
                System.out.println("Dr. Pepper?!");
                System.out.println("Do you wish to take the mystical powers of Dr. Pepper? yes/no?" );
                response3 = keyedInput.nextLine();
            }
             else if (response2.equals ("yes"))
            {
             System.out.println("Upon answering the transmission, you meet a lonely planet.");
             System.out.println("The lonely planet wants to befriend the catstronaut.");
             System.out.println("The catstronaut abandons mission, and enjoys the rest of his days with his stellar new friend.");
             }
            }
    
     
     
    
    }
