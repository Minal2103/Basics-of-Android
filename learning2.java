
// write a program to print grade of the students depending upon the percentage marks they have scored . percentage will be calculate based 
// 5 subjectsmarks.below conditin shows the grading system 
// 1. % greater than 80=A  
// % greater than 60=B
// % greater than 50=C 
// % greater than 40=D
// % Less than 40=F

import java.util.Scanner;
public class learning2 {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the percentage marks for five marks");
        
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         double c=sc.nextDouble();
         double d=sc.nextDouble();
         double e=sc.nextDouble();

         double P=((a+b+c+d+e)/500)*100;

         System.out.println("percentage=" + P);

         if(a>80){

            System.out.println("A");
         }
         else if(a>60){
            System.out.println("B");
         }
         else if(a>50){
             System.out.println("C");
         }
         else if(a>40){
             System.out.println("D");
         }
         else if(a<40){
             System.out.println("F");
         }

         




    }


    
}
