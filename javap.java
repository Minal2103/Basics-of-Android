
// write a write a program to take 4 input from the user and find the greates among them 

import java.util.Scanner;
public class javap {
    

    public static void main (String[] args){


        Scanner sc=new Scanner(System.in);

        System.out.println("greatest number");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();


        if(a>b){

            if (a>c){

                if (a>d){

                    System.out.println("a is the greatest");

                    
                }
            }
        }


        if (b>a) {

            if (b>c){

                if(b>d){

                    System.out.println("b is the greatest");
                }
            }
        }


        

        if (c>a){

            if (c>b){

                if (c>d){

                    System.out.println("c is the greatest");
                }
            }
        }



        
        

        if(d>a){

            if(d>b){

                if(d>c){

                    System.out.println("d is the greatest");
                }
            }
        }
    }
}
