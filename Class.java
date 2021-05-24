
// write a program to take a 4 digit number from the user and print the sum of its digit

import java.util.Scanner;
public class Class {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the sum of digits");

        int a=sc.nextInt(); //a=1782

        int digit1 = a%10 ;   //digit1= 2

        a=a/10;  //  a=178  

        int digit2 =a%10 ;  //  digit2= 8

        a=a/10; // a=17

        int digit3 =a%10;  //digit3=7
       
        a=a/10; // a=1 

        int digit4 =a%10; //digit4=1
        
        a=a/10; // a=0

        int sum= digit1 + digit2 + digit3 + digit4 ;
        
        
        System.out.println(sum);

        
    }
}
