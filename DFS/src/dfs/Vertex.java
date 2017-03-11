/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Vertex {
    
    private String name;
    private boolean visited;
    private List<Vertex>adjacenciesList;
    private Vertex predecessor;
    
    Vertex(String name){
        this.name = name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }
    
    public void addNeighbour(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }
    

}
