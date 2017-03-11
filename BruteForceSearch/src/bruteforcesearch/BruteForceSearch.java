/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruteforcesearch;

/**
 *
 * @author Admin
 */
public class BruteForceSearch {

    public static double f(double x){
    return -(x*x)+2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double startPositionX = -2;
        double maximumX = startPositionX;
        double dx=0.1;
        double max = f(startPositionX);
        double i;
        
        for(i = startPositionX ; i < 2 ; i+=dx){
            
            if(f(i) > max){
                max = f(i);
                maximumX = i;
            }
        }
        System.out.println("The maximum is at x="+maximumX+" y="+f(maximumX));
    }
    
}
