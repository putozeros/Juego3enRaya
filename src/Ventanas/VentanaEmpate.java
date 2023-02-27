package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaEmpate extends javax.swing.JDialog {
    private JButton playAgain,exit;
    private JPanel panel;
    private JLabel gif,ganador;
    public VentanaEmpate (java.awt.Frame parent, boolean modal){
        super(parent,modal);
        setSize(480,270);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Game Over");
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        mostrarPanel();
        mostrarBotones();
        mostrarEtiquetas();
    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }
    private void mostrarBotones(){
        playAgain = new JButton("Jugar de nuevo");
        playAgain.setBounds(300,110,130,35);
        panel.add(playAgain);

        exit = new JButton("Salir");
        exit.setBounds(300,150,130,35);
        panel.add(exit);

        ActionListener jugar = e -> dispose();
        ActionListener salir = e -> System.exit(0);
        exit.addActionListener(salir);
        playAgain.addActionListener(jugar);
    }
    private void mostrarEtiquetas(){
        ganador = new JLabel("Empate!");
        ganador.setBounds(300,20,400,40);
        ganador.setFont(new Font("Arial",Font.BOLD,35));
        panel.add(ganador);

        ImageIcon rocky = new ImageIcon(getClass().getResource("/Imagenes/empate.gif"));
        gif = new JLabel();
        gif.setIcon(new ImageIcon(rocky.getImage().getScaledInstance(230,250,0)));
        gif.setBounds(0,0,230,250);
        panel.add(gif);
    }
}