/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementsScenarios;

import Spriters.StaticSprite;
import java.awt.Graphics;

/**
 * Used for the antibiotic to destroy the boxes and the bacterium
 * @author Maria y Karol
 */
public class Bomb extends StaticSprite{
    
    /**
     * Create a new bomb
     * @param x the position in the x axis
     * @param y the position in the x axis
     */
    public Bomb(int x, int y) {
        super(x, y, 42,42);
        super.setImage("src/Images/bomba.png"); 
    }
    
    /**
     * Paint the bomb
     * @param g 
     */
    @Override
    public void draw(Graphics g) {
        super.paint(g);
    }
}
