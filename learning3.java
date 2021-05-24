
// write a program to get year form the user and cheak wheather is leap year or not.


import java.util.Scanner;
public class learning3 {
    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a year");

        int a=sc.nextInt();

        if(a%4==0) {

            System.out.println("year is the leap year");
        }

            else {

              System.out.println("year is not a leap year");
            }
        }
      

    }

