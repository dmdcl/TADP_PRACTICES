/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FramePanels;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class PaginaUno extends JPanel {
    JLabel titulo;
    public PaginaUno(){
        titulo = new JLabel("PAGINA UNO");
        titulo.setFont(new Font("ALEGRIAN", Font.BOLD,36));
        titulo.setForeground(new Color(255, 255, 255));

        this.setBackground(new Color(255,255,0));
        this.setSize(680,420);
        this.add(titulo, BorderLayout.CENTER);

    }
    
}
