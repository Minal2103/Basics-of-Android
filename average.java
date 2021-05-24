
// \*write a program to take 4 numbers as input from the user and print its average*/

import java.util.Scanner;
public class average {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();

        double average=(a+b+c+d)/4;

        System.out.println(average);




    
    }
    
}
