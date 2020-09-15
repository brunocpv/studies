/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.even;

import java.util.Scanner;

/**
 *
 * @author Skywalker
 */
public class Verify {
       
        
          public static void checar() {
        Scanner  myObj = new Scanner(System.in);
                
      System.out.println("Enter the number to check if it s even ");
        int num = myObj.nextInt();  // Read user input
        
           for ( int c =1 ; c <= num; c++ ) {
              int rem = c % 2 ;
               if ( rem == 0 ) {
              System.out.println("Number: " + c + " is Even"); 
          } else {  System.out.println("Number: " + c + " is Odd"); }
          }
        }
}
          
        
    
    
    
    

