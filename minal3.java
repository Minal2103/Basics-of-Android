
// write a program to get input of two number form the user and print the larger between the two 5>2 a>b


import java.util.Scanner;

public class minal3 {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the first nuber");
    int a=sc.nextInt();

    System.out.println("enter the second number");
    
    int b=sc.nextInt();
    
    if (a>b){
        System.out.println("the larger value " +a);

    }
     else {

        System.out.println("the larger value" +b);


     }
    }


    
}
