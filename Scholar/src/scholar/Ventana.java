/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Ventana extends JFrame{
        public Ventana(){
            super("Formulario estudiante");
            setSize(399,500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container CT = getContentPane();
            CT.setLayout(new FlowLayout());
            JLabel nombre = new JLabel("Nombre: ");
            JTextField txtn = new JTextField(10);
            JLabel apellido = new JLabel ("Apellido: ");
            
            
            
            JButton boton1 = new JButton("Guardar");
            JButton boton2 = new JButton("Salir");
            CT.add(nombre);
            CT.add(txtn);
            CT.add(boton1);
            CT.add(boton2);
            
            
        }
    }

