
// write a program to take 3 input from the user and find the greates among them 


import java.util.Scanner;
public class learning5 {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the greatest number");

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();


    if(a>b) {


        if (a>c) {

            System.out.println("a is the greatest");
    
        }
      
    }



        if (b>a) {

            if (b>c){

                System.out.println("b is the greatest");
            }
        
              
        }

        if (c>a) {

            if(c>b) {
         
                System.out.println("c is the greatest");
            

            }
        }



    


}

}




    

