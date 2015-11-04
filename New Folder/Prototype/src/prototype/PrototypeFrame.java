package prototype;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class PrototypeFrame extends JFrame{
    
    private JButton startGame;
    private JLabel cardDeck;
    private JTextArea cardOne;
    
    private JFrame sf = this;
    
    public PrototypeFrame()
    {
        //createComponent();
        //createPanel();
        this.setSize(235, 505);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void createComponents()
    {
        createButtons();
        //createTextField();
    }
    
    private void createButtons()
    {
        startGame= new JButton("Start Game");
    }
    
    
    public static void main (String[] args)
    {
        @SuppressWarnings("unused")
        JFrame testFrame = new PrototypeFrame();
    }
}

