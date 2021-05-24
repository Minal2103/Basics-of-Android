
// write a program to get four numbers input form the user and print average of it also cheak the average if it is greater than 40 print high average 

import java.util.Scanner;
public class minal4 {

    public static void main(String[] args){

    

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the first number");

    int a=sc.nextInt();

    System.out.println("enter the second  number");

    int b=sc.nextInt();

    System.out.println("enter the third number");

    int c=sc.nextInt();

    System.out.println("enter the fourth number");

    int d=sc.nextInt();

    double g=(a+b+c+d)/4.0;

    System.out.println(g);

    if(g>40){

        System.out.println("high average" );


    }
}
}

