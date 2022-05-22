/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;


import java.util.Scanner;

/**
 *
 * @author pc
 */
public class fact2 {
    
    public static int sum (int n){
    if (n==0) {
        return 0;
    }else{
        return n *sum(n-2);
    }
}
      public static void main(String[] args) {
      
      System.out.println("ENTER THE NUMBER:");
        Scanner in = new Scanner(System.in); 
        
        int n=in.nextInt();
        int x = sum(n);
        System.out.println(x);
      }
      
}
