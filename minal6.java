

// write a program to get an input from the user and cheak if entered number is multiple of 2 if yes then print multiple of 
// two similary cheak and print
// the approriate message if the number turn out to be multiple of 7 and multiple of 5

import java.util.Scanner;
public class minal6 {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");

        int a =sc.nextInt();

        if(a%2==0){

            System.out.println("the number is multiple of 2");
        }
        if(a%5==0){

            System.out.println("the number is multiple of 5");
        
        }
        
        if(a%7==0){

            System.out.println("the number is multiple of 7");
        }

}
}