/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DANIEL
 */
public class Grade_Marks {   
    public static void main(String[] args) {
        //declaring the variables to be used
        int mark1,mark2,mark3,mark4, total;
        double averange;
        DecimalFormat d=new DecimalFormat("0.0000");
        Scanner input=new Scanner(System.in);
        //capturing the inputs from the keyboard
        System.out.println("Enter mark1:\n");
        mark1=input.nextInt();
        
        System.out.println("Enter mark2:\n");
        mark2=input.nextInt();
        
        System.out.println("Enter mark3:\n");
        mark3=input.nextInt();
        
        System.out.println("Enter mark4:\n");
        mark4=input.nextInt();
        
        //calculating the total of the marks
        total=mark1+mark2+mark3+mark4;
        
        //calculating the averange
        averange=10/3;
        
        //printing the total and averange
        System.out.println("Total Marks:");
        System.out.println(total);
        System.out.println("Averange:");
        System.out.println(d.format(averange));
        
        //grading
        if(averange>=70 & averange<=100){
            System.out.println("Distinction");        
        }
        else if(averange>=60 & averange<70){
            System.out.println("Credit I");
        }
        else if(averange>=50 & averange<60){
            System.out.println("Pass");
        }
        else if(averange>=0 & averange<50){
            System.out.println("Fail");
        } 
        else{
            System.out.println("Invalid Entry");
            
        }
        
    }
}
