/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class MainMenu implements ActionListener {

    private JButton startThreeCardGameButton;
    private JButton startOneCardGameButton;
    
    public MainMenu(){
        startOneCardGameButton = new JButton("Start One Card Draw Game");
        startOneCardGameButton.addActionListener(this);
        startThreeCardGameButton = new JButton("Start Three Card Draw Game");
        startThreeCardGameButton.addActionListener(this);
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
