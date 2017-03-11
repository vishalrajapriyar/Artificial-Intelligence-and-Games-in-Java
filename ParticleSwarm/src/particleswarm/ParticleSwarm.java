/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particleswarm;

/**
 *
 * @author Admin
 */
public class ParticleSwarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Algorithm algorithm = new Algorithm();
		algorithm.solve();
		algorithm.showSolution();
    }
    
}
