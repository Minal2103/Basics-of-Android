

// write a program to get a digit as an input from the user and print its number name  ex 9 =nine output

import java.util.Scanner;
public class learning {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter a number");

    int a=sc.nextInt();

    if(a==9){

        System.out.println("nine");}

        else if (a==1) {

            System.out.println("one");
        }
        else if(a==2){

            System.out.println("two");
        }
        else if(a==3){
            System.out.println("three");
        }
        else if(a==4){
            System.out.println("four");
        }
        else if(a==5){
            System.out.println("five");
        }
        else if(a==6){
            System.out.println("six");
        }
        else if(a==7){
            System.out.println("seven");
        }
        else if(a==8){
            System.out.println("eight");
        }

    }
        
    
    
}
