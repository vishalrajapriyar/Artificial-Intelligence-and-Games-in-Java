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
public class Individual {
    
    private int[] genes;
	private Random randomGenerator;
	
	public Individual() {
		this.genes = new int[Constants.GENE_LENGTH];
		this.randomGenerator = new Random();
	}

	public void generateIndividual() {
		for (int i = 0; i < Constants.GENE_LENGTH; ++i) {
			int gene = randomGenerator.nextInt(10);			
			genes[i] = gene;
		}
                System.out.println("Generated Individual: "+geneToDouble());
	}

	public double getFitness() {
                
            double  geneInDouble = geneToDouble();
            return f(geneInDouble);
        }
        
        public double f(double x){
            return -((x-4)*(x-4))+3;
        }
        
        public double geneToDouble(){
            
            int base =1;
            double geneinDouble = 0;
            
            for(int i=0;i<Constants.GENE_LENGTH;i++){
                if(this.genes[i] == 1){
                    geneinDouble += base;
                }
                base = base * 2;
            }
            geneinDouble = geneinDouble / 104.f;
            return geneinDouble;
        }

	public int getGene(int index) {
		return this.genes[index];
	}

	public void setGene(int index, int value) {
		this.genes[index] = value;
	}

	@Override
	public String toString() {
		return "x coordinate: "+this.geneToDouble()+ " -> f(x) = "+f(geneToDouble());
	}
}

    

