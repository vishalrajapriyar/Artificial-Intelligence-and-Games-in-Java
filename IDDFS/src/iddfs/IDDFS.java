/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iddfs;

/**
 *
 * @author Admin
 */
public class IDDFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        
        node1.addNeighbour(node2);
        node2.addNeighbour(node3);
        
        Algorithm algorithm = new Algorithm(node3);
        algorithm.runDeepeningSearch(node1);
    }
    
}
