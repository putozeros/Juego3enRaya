package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaGanador extends javax.swing.JDialog {
    private JButton playAgain,exit;
    private JPanel panel;
    private JLabel gif,ganador;
    private String player;
    public VentanaGanador(java.awt.Frame parent, boolean modal,String player){
        super(parent,modal); /** QUE NO SE TE OLVIDE PONER MÁS EL super(parent,modal)!!!! **/
        this.player = player;
        setSize(480,270);

        setLocationRelativeTo(null);
        setResizable(false);
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
        ganador = new JLabel(player+" ha ganado!");
        ganador.setBounds(10,70,400,30);
        ganador.setForeground(Color.YELLOW);
        ganador.setFont(new Font("Arial",Font.BOLD,25));
        panel.add(ganador);

        ImageIcon rocky = new ImageIcon(getClass().getResource("/Imagenes/ganador.gif"));
        gif = new JLabel();
        gif.setIcon(new ImageIcon(rocky.getImage().getScaledInstance(480,270,0)));
        gif.setBounds(0,0,480,270);
        panel.add(gif);
    }
}