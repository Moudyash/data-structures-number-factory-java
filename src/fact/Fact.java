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



/* rec calcoulat avg of  number*/
public class Fact {
public static int avg (int n,int sum,int count){
    
    if (n==0) {
        return sum/count;
    }else{
        count=count+1;
        sum=sum+n;
      return avg(n-1,sum,count);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("ENTER THE NUMBER:");
        Scanner in = new Scanner(System.in); 
        
        int n=in.nextInt();
        int x = avg(n,0,0);
        System.out.println(x);
    }
    
}
