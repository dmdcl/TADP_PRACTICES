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
// ESTA ES LA VENTANA INICIAL 
public class VentanaInicial extends JPanel {
    JLabel lbl_titulo;
    VentanaInicial(){
        lbl_titulo = new JLabel("BIENVENIDO A....");
        lbl_titulo.setFont(new Font("Algerian", Font.BOLD,36));
        lbl_titulo.setForeground(new Color(255, 255, 255));

        this.add(lbl_titulo,BorderLayout.CENTER);
        this.setBackground(new Color(0, 0, 255));
    }
}
