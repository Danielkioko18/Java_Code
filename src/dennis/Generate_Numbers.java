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
public class Generate_Numbers {
    public static void main(String[] args) {
        int n,i;
        n=800;
        i=1;
        while(i<=8){
          System.out.println(n);
          n -= 200;
          i++;                
        }
    }
}
