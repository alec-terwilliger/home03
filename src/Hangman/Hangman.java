/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hangman;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author (Your Name Here)
 */
public class Hangman extends javax.swing.JFrame
{

    ArrayList wordList = new ArrayList();
    WordList word = new WordList();
    Random rand = new Random();
    int wordIndex = rand.nextInt();
    String secretWord;
    String hiddenDisplay = word.getDisplay();
    Figure figure = new Figure();
    Gallows gallow = new Gallows();
    /**
     * Creates new form Hangman
     */
    public Hangman()
    {
        initComponents();
        easyWordRadioButton.setSelected(true);
        wordList = word.setEasyList();
        guessButton.setEnabled(false);        
    }

    @Override
     public void paint(Graphics g)
    {
        super.paint(g);
        gallow.drawGallows(g);
        if (word.getCount() >= 1) {
            figure.drawHead(g);
        }
        if (word.getCount() >= 2) {
            figure.drawBody(g);
        }
        if (word.getCount() >= 3) {
            figure.drawLeftArm(g);
        }
        if (word.getCount() >= 4) {
            figure.drawRightArm(g);
        }
        if (word.getCount() >= 5) {
            figure.drawLeftLeg(g);
        }
        if (word.getCount() >= 6) {
            figure.drawRightLeg(g);
            gallow.removeGallow(g);
            guessButton.setEnabled(false);
        } 
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        secretWordLabel = new javax.swing.JLabel();
        lettersUsedLabel = new javax.swing.JLabel();
        enterGuessLabel = new javax.swing.JLabel();
        guessInput = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();
        newWordButton = new javax.swing.JButton();
        customWordButton = new javax.swing.JButton();
        giveUpButton = new javax.swing.JButton();
        easyWordRadioButton = new javax.swing.JRadioButton();
        mediumWordRadioButton = new javax.swing.JRadioButton();
        hardWordRadioButton = new javax.swing.JRadioButton();
        secretWordOutput = new javax.swing.JLabel();
        lettersUsedOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        secretWordLabel.setText("Secret Word:");

        lettersUsedLabel.setText("Letters Used:");

        enterGuessLabel.setText("Enter Guess:");

        guessButton.setText("Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        newWordButton.setText("New Word");
        newWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWordButtonActionPerformed(evt);
            }
        });

        customWordButton.setText("Custom Word");
        customWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customWordButtonActionPerformed(evt);
            }
        });

        giveUpButton.setText("Give Up");
        giveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUpButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(easyWordRadioButton);
        easyWordRadioButton.setText("Easy Word");
        easyWordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyWordRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(mediumWordRadioButton);
        mediumWordRadioButton.setText("Medium Word");
        mediumWordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumWordRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(hardWordRadioButton);
        hardWordRadioButton.setText("Hard Word");
        hardWordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardWordRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hardWordRadioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newWordButton)
                        .addGap(66, 66, 66)
                        .addComponent(customWordButton)
                        .addGap(74, 74, 74)
                        .addComponent(giveUpButton))
                    .addComponent(guessButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lettersUsedLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lettersUsedOutput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterGuessLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(secretWordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(secretWordOutput))
                    .addComponent(easyWordRadioButton)
                    .addComponent(mediumWordRadioButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secretWordLabel)
                    .addComponent(secretWordOutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lettersUsedLabel)
                    .addComponent(lettersUsedOutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterGuessLabel)
                    .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guessButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newWordButton)
                    .addComponent(customWordButton)
                    .addComponent(giveUpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(easyWordRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediumWordRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hardWordRadioButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyWordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyWordRadioButtonActionPerformed
        wordList = word.setEasyList();
    }//GEN-LAST:event_easyWordRadioButtonActionPerformed

    private void mediumWordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumWordRadioButtonActionPerformed
        wordList = word.setMediumList();
    }//GEN-LAST:event_mediumWordRadioButtonActionPerformed

    private void hardWordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardWordRadioButtonActionPerformed
        wordList = word.setHardList();
    }//GEN-LAST:event_hardWordRadioButtonActionPerformed

    private void newWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWordButtonActionPerformed
        word.clearLettersUsedDisplay();
        guessButton.setEnabled(true);
        wordIndex = rand.nextInt(9 - 0 + 1) + 0;
        secretWord =  (String) wordList.get(wordIndex);
        secretWordOutput.setText(word.obscureWord(secretWord));  
        lettersUsedOutput.setText("");
        repaint();
    }//GEN-LAST:event_newWordButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        
        if(!word.validateGuess(guessInput.getText()))
        {
            JOptionPane.showMessageDialog(null, "Invalid guess, enter a letter.");
            guessInput.setText("");
            return;
        }
        secretWordOutput.setText(word.updateDisplayedPartOfWord(word.getDisplay(), secretWord, guessInput.getText().charAt(0)));
        lettersUsedOutput.setText(word.getLettersUsed());
        guessInput.setText("");
        repaint();
        if(word.getCount() == 6)
        {
            JOptionPane.showMessageDialog(null, "You lose");
            word.count = 0;            
            repaint();
        }
        if (!word.getDisplay().contains("?")) 
        {
            JOptionPane.showMessageDialog(null, "Congrats you have won!!");
            word.clearLettersUsedDisplay();
            lettersUsedOutput.setText("");
            word.count = 0;
            repaint();
        }
        
    }//GEN-LAST:event_guessButtonActionPerformed

    private static boolean validWord(String s)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!alphabet.contains(s.substring(i, i+1)))
            {
                return false;
            }
        }
        return true;
    }
    
    private void customWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customWordButtonActionPerformed
        word.clearLettersUsedDisplay();
        lettersUsedOutput.setText("");
        word.count = 0;
        repaint();
        secretWord = JOptionPane.showInputDialog(null, "Enter a word");
        while(!Hangman.validWord(secretWord))
        {
            secretWord = JOptionPane.showInputDialog(null, "Enter a word");
        }         
        secretWordOutput.setText(word.obscureWord(secretWord));
        guessButton.setEnabled(true);
    }//GEN-LAST:event_customWordButtonActionPerformed

    private void giveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUpButtonActionPerformed
        word.count = 6;
        repaint();
        JOptionPane.showMessageDialog(null, "You lose, the word was " + secretWord);
        secretWordOutput.setText(secretWord);
        word.count = 0;
    }//GEN-LAST:event_giveUpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Hangman().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton customWordButton;
    private javax.swing.JRadioButton easyWordRadioButton;
    private javax.swing.JLabel enterGuessLabel;
    private javax.swing.JButton giveUpButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JTextField guessInput;
    private javax.swing.JRadioButton hardWordRadioButton;
    private javax.swing.JLabel lettersUsedLabel;
    private javax.swing.JLabel lettersUsedOutput;
    private javax.swing.JRadioButton mediumWordRadioButton;
    private javax.swing.JButton newWordButton;
    private javax.swing.JLabel secretWordLabel;
    private javax.swing.JLabel secretWordOutput;
    // End of variables declaration//GEN-END:variables
}