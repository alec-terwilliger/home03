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
public class Figure {
    

    public void drawHead(Graphics g)
    {
        g.fillOval(100, 110, 20, 20);
    }
    
    public void drawBody(Graphics g)
    {
        g.drawLine(110, 130, 110, 160);
    }
    
    public void drawLeftArm(Graphics g)
    {
        g.drawLine(90, 125, 110, 145);
    }
    
    public void drawRightArm(Graphics g)
    {
        g.drawLine(130, 125, 110, 145);
    }
    
    public void drawLeftLeg(Graphics g)
    {
        g.drawLine(95, 180, 110, 160);
    }
    
    public void drawRightLeg(Graphics g)
    {
        g.drawLine(125, 180, 110, 160);
    }
}
