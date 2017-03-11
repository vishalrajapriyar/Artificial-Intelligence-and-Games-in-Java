/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Vertex {
    private int data;
    private boolean visited;
    private List <Vertex> neighbourlist;
    
    public Vertex(int data){
        this.data = data;
        this.neighbourlist = new ArrayList<>();
}
    
    public void addNeighbour(Vertex vertex){
       
    }
    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighbourlist() {
        return neighbourlist;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourlist(List<Vertex> neighbourlist) {
        this.neighbourlist = neighbourlist;
    }

    @Override
    public String toString() {
        return ""+this.data; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
