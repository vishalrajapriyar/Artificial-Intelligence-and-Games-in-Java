/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iddfs;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Algorithm {
    private Node targetNode;
    private boolean isTargetFound;
    
    public Algorithm(Node targetNode){
        this.targetNode = targetNode;
    }
    
    public void runDeepeningSearch(Node startNode){
        
        int depth = 0;
        
        while(!isTargetFound){
            System.out.println();
            dfs(startNode, depth);
            depth++;
        }
    }

    private void dfs(Node startNode, int depth) {
        Stack<Node> stack = new Stack<>();
        startNode.setDepthLevel(0);
        stack.push(startNode);
        
        while(!stack.isEmpty()){
            
            Node actualNode = stack.pop();
            System.out.println(actualNode+" ");
            
            if(actualNode.getName().equals(this.targetNode.getName())){
                System.out.println("\nNode has been found...");
                this.isTargetFound=true;
                return;
            }
            
            if(actualNode.getDepthLevel() >= depth){
                continue;
            }
            
            for(Node node : actualNode.getAdjacenciesList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }
    }
    
    
}
