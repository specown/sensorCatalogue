/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.selectorcatologue.main;

import javax.swing.JFrame;

/**
 *
 * @author Lukas
 */
public class Main 
{
    public static void main(String [] args)
    {
	MainView GUIView = new MainView();
        
        GUIView.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        
        GUIView.setVisible(true);

        GUIView.setResizable(false);
    }
}
