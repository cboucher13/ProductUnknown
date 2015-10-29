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
<<<<<<< HEAD
public class MainMenu extends JPanel implements ActionListener {

    private JFrame theFrame;
    private JButton startThreeCardGameButton;
    private JButton startOneCardGameButton;
    
    public MainMenu(JFrame newPrototypeFrame){
        theFrame = newPrototypeFrame;
=======
public class MainMenu implements ActionListener {

    private JButton startThreeCardGameButton;
    private JButton startOneCardGameButton;
    
    public MainMenu(){
>>>>>>> parent of 1e622bb... Merge origin/master
        startOneCardGameButton = new JButton("Start One Card Draw Game");
        startOneCardGameButton.addActionListener(this);
        startThreeCardGameButton = new JButton("Start Three Card Draw Game");
        startThreeCardGameButton.addActionListener(this);
<<<<<<< HEAD
        this.add(startOneCardGameButton);
        this.add(startThreeCardGameButton);
        theFrame.add(this);
=======
>>>>>>> parent of 1e622bb... Merge origin/master
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
