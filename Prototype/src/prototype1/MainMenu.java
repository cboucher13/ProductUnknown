/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class MainMenu extends JPanel implements ActionListener {

    private JFrame theFrame;
    private JButton startThreeCardGameButton;
    private JButton startOneCardGameButton;
    
    public MainMenu(JFrame newPrototypeFrame){
        theFrame = newPrototypeFrame;
        startOneCardGameButton = new JButton("Start One Card Draw Game");
        startOneCardGameButton.addActionListener(this);
        startThreeCardGameButton = new JButton("Start Three Card Draw Game");
        startThreeCardGameButton.addActionListener(this);
        this.add(startOneCardGameButton);
        this.add(startThreeCardGameButton);
        theFrame.add(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == startOneCardGameButton){
            // This will load the settings so that a one card game is loaded.
            
        }
        else if(obj == startThreeCardGameButton){
            // This will load the settings so that a three card game is loaded.
            
        }
    }

}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

