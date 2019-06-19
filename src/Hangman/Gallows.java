/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alec Terwilliger
 */
public class Gallows {
    
    public Gallows()
    {
        
    }
    
    public void drawGallows(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(25, 200, 150, 25);
        
        g.fillRect(25, 220, 300, 25);
        
        g.fillRect(35, 80, 10, 120);
        
        g.fillRect(35, 80, 80, 10);
        
        g.fillRect(108, 80, 5, 30);
                
    }
    
    public void removeGallow(Graphics g)
    {
        g.clearRect(25, 200, 150, 25);
        g.clearRect(25, 220, 300, 25);
    }
    
}
