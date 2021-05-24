// write a program to take 2 digit interger input from the user in a variable named n and print n/10 & n%10



import java.util.Scanner;
public class minal {
    
    public static void main(String[] args){
    

    Scanner sc=new Scanner(System.in);
    System.out.println("enter two digit number");

    int n=sc.nextInt();
    
    System.out.println(n/10);
    System.out.println(n%10);
}
}
