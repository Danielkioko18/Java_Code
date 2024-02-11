/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis;

import java.util.Scanner;
/**
 *
 * @author DANIEL
 */
public class DanielAssignment3Q1 {
    public static final String[] KEYS={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    int length,i;
    String input,pn;//pn=phonenumber and input is the input string of the user
    Scanner sc= new Scanner(System.in);
    
    //method for validating the user input
    public boolean isValidInput(){
       System.out.println("Enter Phone number:");
       input= sc.nextLine();
       length=input.length();//getting length of the input string
       
       //counting the number of dashes
       int dashes = input.length() - input.replace("-", "").length();
       if(length<10){
           System.out.println("Invalid Phone number. Must be 10 characters plus optional dashes.");
           return false;
        }
       //checking the number of dashes
       else if(dashes>2){
           System.out.println("Invalid Phone number. Must be 10 characters plus optional dashes.");
           return false;
       }
       //validating empty inputs
       else if(input==null||input==""){
           System.out.println("Invalid Phone number. Must be 10 characters plus optional dashes.");
           return false;
       }       
        return true;
    }
    //method for getting the digit of the string entered
    public void getDigit(){
        //issuing thephone number after the entry of the string
        char[] ch=KEYS[i].toCharArray();
        
        CharSequence s=new StringBuilder(1).append(ch);       
        String pn=input.toLowerCase()
                .replace("a", "2").replace("b", "2").replace("c", "2")
                .replace("d", "3").replace("e", "3").replace("f", "3")
                .replace("g", "4").replace("h", "4").replace("i", "4")
                .replace("j", "5").replace("k", "5").replace("l", "5")
                .replace("m", "6").replace("n", "6").replace("o", "6")
                .replace("p", "7").replace("q", "7").replace("r", "7").replace("s", "7")
                .replace("t", "8").replace("u", "8").replace("v", "8")
                .replace("w", "9").replace("x", "9").replace("y", "9").replace("z", "9");
        System.out.println(pn);
        }
        
        
    //main method of the class
    public static void main(String args[]){
        DanielAssignment3Q1 phonenumber=new DanielAssignment3Q1();
        for(int j=0;j<=3;j++){
            phonenumber.isValidInput();
            if(phonenumber.isValidInput()==true){
                phonenumber.getDigit();
            }
            else if(phonenumber.isValidInput()==false){
                
            }
        }        
    }
}
