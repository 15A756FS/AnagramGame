/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author death-shoot
 */
import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String entrer, renverser = "";
      Scanner clavier = new Scanner(System.in);
 
      System.out.println("entrez votre chaine de caractere :");
      entrer = clavier.nextLine();
 
      int length = entrer.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         renverser = renverser + entrer.charAt(i);
 
      if (entrer.equals(renverser))
         System.out.println("votre chaine de caractere est un palindrome.");
      else
         System.out.println("votre chaine de caractere n'est pas un palindrome.");
 
   }
}
    

