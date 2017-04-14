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
public class Impair {
   public static void main (String[]args){
    Scanner clavier=new Scanner(System.in);
    int n=0;
    String element="";
    
    System.out.println("entrez un nombre de votre choix et je vous listerais ça suite de nombre impaire ");
    n = clavier.nextInt();
     for(int i = 0; i <=n ; i++) { 
         if(i%2==1)
             System.out.println(i);
     }
}
}