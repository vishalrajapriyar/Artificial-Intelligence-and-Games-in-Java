/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfsrecursion;

/**
 *
 * @author Admin
 */
public class DFSRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vertex vertexA = new Vertex("A"); 
        Vertex vertexB = new Vertex("B"); 
        Vertex vertexC = new Vertex("C"); 
        Vertex vertexD = new Vertex("D"); 
        Vertex vertexE = new Vertex("E"); 
        
        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);
        
        
        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);
        
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.depthfirstsearch(vertexA);


        
    }
    
}
