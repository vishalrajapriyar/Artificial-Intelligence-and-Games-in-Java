/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class DepthFirstSearch {
    
    private Stack<Vertex> stack;
    
    public DepthFirstSearch(){
        this.stack = new Stack<>();
    }
    
    public void depthfirstsearch(Vertex root){
        
        stack.add(root);
        root.setVisited(true);
        
        while(!stack.isEmpty()){
            
            Vertex actualVertex = stack.pop();
            System.out.print(actualVertex+" ");
            for(Vertex v : actualVertex.getAdjacenciesList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    v.setPredecessor(actualVertex);
                    stack.push(v);
                }
            }
        }
        }
            
    }
