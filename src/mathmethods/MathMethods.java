/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;

/**
 *
 * @author rkaune
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNumberRounded;
        double myNumber=15.5;
        double pi = Math.PI;
        myNumberRounded = (int) Math.round(myNumber);
//        myNumber *=10; // this is the same as myNumber = myNumber *10;
//        myNumber +=5;
//        myNumber /=10;
//        myNumberRounded =(int)(myNumber);
        System.out.println(myNumberRounded);
    }
    
}
