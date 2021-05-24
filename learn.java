
// write a program to get marks of the students print the grade
// greading criteria of student programmer should take care that the marks should not be greater than 100 and less than 0


import java.util.Scanner;
public class learn {
    
    public static void main(String[] args){

        System.out.println("enter the grade");

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
         
      
        double p =(a+b+c+d+e)/5 ;
      
        if(p>100){
          System.out.println("marks should not be greater than 100");

        }

        else if (p<0){
          System.out.println("marks should not be less than 0");

        }
         
        else{

            if (p>80){

                System.out.println("A");
            }
            
            else if(p>60){
    
                System.out.println("B");
    
            }
    
            else if(p>50){
    
                System.out.println("C");
            }
           
             else if (p>40){
    
                System.out.println("D");
            }

            else {
              System.out.println("fail");

            }
    
            
    
        }
        
    }
}
