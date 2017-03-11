/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stochasticsearch;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class StochasticSearch {
    
    public static double f(double x){
        return -(x-1)*(x-1)+2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        double startPointX = 0;
        double max = f(startPointX);
        
        for(int i=0;i<1000;i++){
            double index = 2*random.nextDouble();
            
            if(f(index) > max){
                max = f(index);
            }
        }
        System.err.println("Maximum value y=f(x) is "+max);
    }
    
}
