/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm2;

/**
 *
 * @author Admin
 */
public class GeneticAlgorithm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Algorithm algorithm = new Algorithm();
        Population population = new Population(100);
        population.initialize();
        
        int generationCount = 0;
        
        while (generationCount < Constants.SIMULATION_LENGTH) {
            ++generationCount;
            System.out.println("Generation: " + generationCount + " Fittest: " + population.getFittest().getFitness());
            System.out.println(population.getFittest()+"\n");
            population = algorithm.evolvePopulation(population);
        }
        
        System.out.println("Solution found:");
        System.out.println(population.getFittest());
    }
    }
    

