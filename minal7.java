

// write a program to get the length and breadth of a rectangle and cheak if it is square or not 


import java.util.Scanner;
public class minal7 {
    
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter a length");

    int a=sc.nextInt();

    System.out.println("enter a breadth");

    int b=sc.nextInt();


    if(a==b){

        System.out.println("it is a square");

    }
    else{

        System.out.println("it is not a square");
    }

    }
}
