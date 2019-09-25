/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Ventana extends JFrame implements ActionListener{
    
    JButton boton1, boton2;
    
        public Ventana(){
            super("Formulario estudiante");
            setSize(350,500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container CT = getContentPane();
            CT.setLayout(new FlowLayout());
            //nombres
            JLabel etiN = new JLabel("Nombres: ");
            JTextField txtn = new JTextField(19);
            
            CT.add(etiN);
            CT.add(txtn);
            //Apellidos
            JLabel etiA = new JLabel ("Apellidos: ");
            JTextField txta = new JTextField(19);
            
            CT.add(etiA);
            CT.add(txta);
            //Fecha de nacimiento
            JComboBox Dia, Mes, Año;
            JLabel etiFN = new JLabel ("Fecha de nacimiento: ");
            
            Dia = new JComboBox();
            Mes = new JComboBox();
            Año = new JComboBox();
            
            Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
            JLabel esh1 = new JLabel ("/");
            Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2", "3","4","5","6","7","8","9","10","11","12"}));
            JLabel esh2 = new JLabel ("/");
            Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
            
            CT.add(etiFN);
            CT.add(Dia);
            CT.add(esh1);
            CT.add(Mes);
            CT.add(esh2);
            CT.add(Año);
            //DIRECCION
            JLabel etiD = new JLabel("DIreccion: ");
            JTextField txtD = new JTextField(19);
            
            CT.add(etiD);
            CT.add(txtD);
            //TELEFONO
            JLabel etiT = new JLabel("Telefono: ");
            JTextField txtT = new JTextField(19);
           
            CT.add(etiT);
            CT.add(txtT);
            //CORREO ELECTRONICO
            JLabel etiCE = new JLabel("Correo Electronico: ");
            JTextField txtCE =new JTextField(15);
            
            CT.add(etiCE);
            CT.add(txtCE);
            //GENERO
            JLabel etiG = new JLabel("Genero: ");
            JComboBox espandG = new JComboBox();
            espandG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ninguno","Masculino", "Femenino","Otros"}));
            
            CT.add(etiG);
            CT.add(espandG);
            //Botones
            boton1 = new JButton("GUARDAR");
            CT.add(boton1);
            boton1.addActionListener(this);
            
            boton2 = new JButton("Salir");
            CT.add(boton2);
            boton2.addActionListener(this);
                            
            
            
        }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==boton1){
            JOptionPane.showMessageDialog(null,"La informacion se a guardado con exito!");
        }
        if(evento.getSource()==boton2){
            System.exit(0);
        }
    }

    }

