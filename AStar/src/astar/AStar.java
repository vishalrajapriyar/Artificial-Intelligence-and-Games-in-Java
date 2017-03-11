/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astar;

import java.util.List;

/**
 *
 * @author Admin
 */
public class AStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node node1 = new Node("A");
	Node node2 = new Node("B");
	Node node3 = new Node("C");
        Node node4 = new Node("D");
	Node node5 = new Node("E");
        Node node6 = new Node("F");
		
	node1.addNeighbour(new Edge(node2,4));
        node1.addNeighbour(new Edge(node3,2));
		
	node2.addNeighbour(new Edge(node3, 5));
        node2.addNeighbour(new Edge(node4, 10));
		
	node3.addNeighbour(new Edge(node5, 3));
		
        node4.addNeighbour(new Edge(node6, 11));
		
	node5.addNeighbour(new Edge(node4, 4));
        
        Algorithm algorithm = new Algorithm();
		
            algorithm.aStarSearch(node1, node6);

	    List<Node> path = algorithm.printPath(node6);
            System.out.println("Path " + path);
	}

    }
    

