
// write a program to get and input of 4 digit number from the user and print reverse of this number 
// user input 1782  output -2871

import java.util.Scanner;
public class learning4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a reverse number");

        int a=sc.nextInt();    //a= 1782 

        int digit1 =a%10 ;   // digit1=2

        a=a/10;  //  a=178  

        int digit2 =a%10 ;  //  digit2= 8

        a=a/10; // a=17

        int digit3 =a%10;  //digit3=7
       
        a=a/10; // a=1 

        int digit4 =a%10; //digit4=1
        
        a=a/10; // a=0

        System.out.println( digit1 + "" + digit2+ "" + digit3 +""  + digit4 );







    }


    
}
