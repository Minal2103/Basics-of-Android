
// write a program to cheak if the number entered by the user is divisible by 7 or not 


import java.util.Scanner;
public class minal5 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a number");

        int a=sc.nextInt();

        if(a%7==0){
        
            System.out.println("the number is divisible by 7");



        }
        
         else{

            System.out.println("the number is not divisible by 7");
         }
    }
    
}
