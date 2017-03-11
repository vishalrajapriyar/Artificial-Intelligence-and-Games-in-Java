/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Admin
 */
public enum Player {
    
    COMPUTER("X"), USER("O"), NONE("-");
    
    private Player (String text){
        this.text = text;
    }
    
    private final String text;

    @Override
    public String toString() {
        return this.text; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
