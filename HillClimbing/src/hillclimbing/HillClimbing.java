/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hillclimbing;

/**
 *
 * @author Admin
 */
public class HillClimbing {
    
    public static double f(double x){
        return -(x-1)*(x-1)+2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double dx = 0.01;
        double actualPointX = -2;
        double max = f (actualPointX);
        
        while( f(actualPointX + dx) > max){
            max = f(actualPointX + dx);
            System.out.println("x: "+actualPointX+" y:"+f(actualPointX));
            actualPointX =+ dx;
        }
        System.out.println("Local Maximum is: "+max);
    }
    
}
