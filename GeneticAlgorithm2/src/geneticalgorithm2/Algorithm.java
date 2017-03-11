/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Algorithm {
    
    private Random randomGenerator;
	
	public Algorithm(){
		this.randomGenerator = new Random();
	}
	
    public Population evolvePopulation(Population population) {
        
    	Population newPopulation = new Population(population.size());

        for (int index = 0; index < population.size(); ++index) {
            Individual firstIndividual = randomSelection(population);
            Individual secondIndividual = randomSelection(population);
            Individual newIndividual = crossover(firstIndividual, secondIndividual);
            newPopulation.saveIndividual(index, newIndividual);
        }

        for (int index = 0; index < newPopulation.size(); ++index) {
            mutate(newPopulation.getIndividual(index));
        }

        return newPopulation;
    }

    private Individual randomSelection(Population population) {
       
        Population newPopulation = new Population(Constants.TOURNAMENT_SIZE);
        
        for (int index = 0; index < Constants.TOURNAMENT_SIZE; ++index) {
            int randomIndex = (int) (Math.random() * population.size());
            newPopulation.saveIndividual(index, population.getIndividual(randomIndex));
        }
        
        Individual fittestIndividual = newPopulation.getFittest();
        
        return fittestIndividual;
    }
    
    private Individual crossover(Individual firstIndividual, Individual secondIndividual) {
        
    	Individual newSolution = new Individual();
        
        for (int geneIndex = 0; geneIndex < Constants.GENE_LENGTH; ++geneIndex) {
            
            if (Math.random() <= Constants.UNIFORM_RATE) {
                newSolution.setGene(geneIndex, firstIndividual.getGene(geneIndex));
            } else {
                newSolution.setGene(geneIndex, secondIndividual.getGene(geneIndex));
            }
        }
        
        return newSolution;
    }
    
    private void mutate(Individual individual) {
        
        for (int geneIndex = 0; geneIndex < Constants.GENE_LENGTH; ++geneIndex) {
            
        	if (Math.random() <= Constants.MUTATION_RATE) {
                int gene = randomGenerator.nextInt(10);
                individual.setGene(geneIndex, gene);
            }
        }
    }
}

    

