/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;
import javax.swing.border.Border;
public class Prototype {
    
    XMLDecoder de, xe;

    public static void main(String[] args) {
        System.out.println("Hello");
        
        int x;
        int y;
        for (x = 0; x < 10; x++)
            System.out.println("Is it working?");
        
        for (x = 0; x < 5; x++)
        {
            for (y = 0; y <= x; y++)
            System.out.print("*");
            System.out.println();
        }
        
        System.out.println("Hi?");
       PrototypeFrame frame = new PrototypeFrame();
     
    }
    
}
