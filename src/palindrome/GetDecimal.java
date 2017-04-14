package palindrome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author death-shoot
 */
import java.util.*;
public class GetDecimal {
   public static void main (String[]args){
    Scanner clavier=new Scanner(System.in);
    int n=0;
    String element="";
    
    System.out.println("entrez le nombre a convertir en binaire ");
    n = clavier.nextInt();
    String bin="";
    do{
        int reste=n%2;
         n=(n-reste)/2;
         if(reste==1){
              bin=bin+"1";
         }else{
              bin=bin+"0";
         }
    }while(n!=0);
    
    
    System.out.println("le nombre en binaire en lisant de la droite vers la gauche est :"+bin);

}
    }

