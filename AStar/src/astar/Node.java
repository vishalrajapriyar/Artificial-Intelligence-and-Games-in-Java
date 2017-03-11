/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Node implements Comparable<Node>{
    private String value;
    private double gScore;
    private double fScore;
    private double x;
    private double y;
    private List<Edge> adjacenciesList;
    private Node parentNode;
    
    public Node (String value){
        this.value = value;
        this.adjacenciesList = new ArrayList<Edge>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public double getfScore() {
        return fScore;
    }

    public void setfScore(double fScore) {
        this.fScore = fScore;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }
    

    @Override
    public String toString() {
        return this.value; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Node otherNode) {
        return Double.compare(this.fScore, otherNode.getfScore());
    }

    
    
}
    
    
