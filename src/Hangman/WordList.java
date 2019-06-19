/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;

import java.util.ArrayList;

/**
 *
 * @author Alec Terwilliger
 */
public class WordList {
    
    private String guess = "";
    private String display;
    int count = 0;
    
    
    // Easy word List
    private ArrayList easyList = new ArrayList();
    private ArrayList mediumList = new ArrayList();
    private ArrayList hardList = new ArrayList();

    public WordList()
    {
   
    }
         
       
    
    public ArrayList setEasyList() 
    {
        easyList.add("elephant");
        easyList.add("paper");
        easyList.add("independent");
        easyList.add("arrangement");
        easyList.add("happy");
        easyList.add("organization");
        easyList.add("command");
        easyList.add("triangle");
        easyList.add("classroom");
        easyList.add("conversation");
        
        return easyList;
    }

    public ArrayList setMediumList() {
        mediumList.add("pink");
        mediumList.add("wrench");
        mediumList.add("bent");
        mediumList.add("canal");
        mediumList.add("zombie");
        mediumList.add("wax");
        mediumList.add("junk");
        mediumList.add("subway");
        mediumList.add("swivel");
        mediumList.add("kiosk");
        
        return mediumList;
    }

    public ArrayList setHardList() {
        hardList.add("zygote");
        hardList.add("ivy");
        hardList.add("axiom");
        hardList.add("khaki");
        hardList.add("chapped");
        hardList.add("razzmatazz");
        hardList.add("sky");
        hardList.add("bubbling");
        hardList.add("queue");
        hardList.add("biogas");
        
        return hardList;
    }
    
    public String obscureWord(String word)
    {
        int length = word.length();      
        String hiddenWord = "";
        for (int i = 0; i < length; i++) 
        {
            hiddenWord += "?";
        }
        display = hiddenWord;
        return hiddenWord;
    }
    
    public void clearLettersUsedDisplay()
    {
        guess = "";
        count = 0;
    }
    
    public String getDisplay()
    {
        return display;
    }        
    
    public String updateDisplayedPartOfWord(String display, String hidden, char guessed)
    {        
        // Find index values for correct letters
        // replace ? marks at those index values with correct letters       
        String temp = "";        
        boolean flag = false;        
        for (int i = 0; i < hidden.length(); i++) 
        {
            if (hidden.charAt(i) == guessed) 
            {
                temp += hidden.charAt(i);
                flag = true;
            }
            else
            {
                temp += display.charAt(i);
            }            
        }
        if(!flag)
        {
            count++;
        }
        this.display = temp;
        return temp;
    }
    public String getLettersUsed()
    {
        return guess;
    }
    
    
    public boolean validateGuess(String input)
    {
        if(input == null)
        {
            return false;
        }
        boolean flag = false;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (input.length() == 1) 
        {
            if (alphabet.contains(input) && !guess.contains(input)) 
            {
                flag = true;
                guess += input;
            }
        }
        return flag;
    }
    
    
    public int getCount()
    {
        return count;
    }
    
    
    
    
}
