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

/**
 *
 * @author Admin
 */
public class DepthFirstSearch {
    
    public void depthfirstsearch(Vertex vertex){
        
        System.out.print(vertex+ " ");
        
        for(Vertex v : vertex.getAdjacenciesList()){
            if(!v.isVisited()){
                v.setVisited(true);
                v.setPredecessor(vertex);
                depthfirstsearch(v);
            }
        }
    }
            
    }
