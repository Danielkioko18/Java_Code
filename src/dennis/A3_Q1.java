/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis;

/**
 *
 * @author DANIEL
 */

// -------------------------------------------------------
// Assignment {include number}
// Written by: {include your name and student ID}
// For COMP 248 Section {your section} – Fall 2022
// -------------------------------------------------------
public class A3_Q1 {
    public static void main(String ar[]){
        String str = "CloudiKnow is good";
    String output = "";
    for (int i = 0; i < str.length(); i++) {
      // swap only if the next char is within the string
      if (i + 1 < str.length()) {
        output = output + str.charAt(i + 1);
        output = output + str.charAt(i);
      }
      i = i + 1;
    }
    System.out.println("Given   String: " + str);
    System.out.println("Swapped String: " + output);
        
        //System.out.println(new StringBuffer(s.substring(0,L)).reverse()
        //.toString().concat(s.substring(L)));
  }
}
