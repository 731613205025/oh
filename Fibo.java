/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fibo {
    private static int input;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=-1,b=1,c=0,i=1;
       // System.out.println(""+a +b);
        while(i<=n)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
            i++;
            
        }
    }
}
