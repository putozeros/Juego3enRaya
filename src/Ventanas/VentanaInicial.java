package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaInicial extends JFrame {
    private String player1,player2;
    private JButton guardar,empezar;
    private JLabel tresenraya,gif,usuario1,usuario2,fichax,fichao;
    private JTextField user1,user2;
    private JPanel panel;
    public VentanaInicial(){
        setSize(616,639);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tres en Raya");
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        mostrarPanel();
        mostrarEtiquetas();
        mostrarJtextField();
        mostrarBotones();
    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }
    private void mostrarEtiquetas() {
        tresenraya = new JLabel("Tres en Raya");
        tresenraya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC,50));
        tresenraya.setBounds(140,50,500,55);
        panel.add(tresenraya);

        gif = new JLabel();
        ImageIcon tresen = new ImageIcon(getClass().getResource("/Imagenes/3enraya.gif"));
        gif.setIcon(new ImageIcon(tresen.getImage().getScaledInstance(240,180,Image.SCALE_DEFAULT)));
        gif.setBounds(330,350,240,180);
        panel.add(gif);

        usuario1 = new JLabel("Jugador 1");
        usuario1.setFont(new Font("Arial",Font.PLAIN,20));
        usuario1.setBounds(10,200,100,30);
        panel.add(usuario1);

        usuario2 = new JLabel("Jugador 2");
        usuario2.setFont(new Font("Arial",Font.PLAIN,20));
        usuario2.setBounds(10,250,100,30);
        panel.add(usuario2);

        fichax = new JLabel("");
        fichax.setBounds(10,350,350,20);
        fichax.setFont(new Font("Arial",Font.BOLD,14));
        panel.add(fichax);

        fichao = new JLabel("");
        fichao.setBounds(10,380,350,20);
        fichao.setFont(new Font("Arial",Font.BOLD,14));
        panel.add(fichao);
    }
    private void mostrarJtextField(){
        user1 = new JTextField();
        user1.setBounds(120,200,300,30);
        user1.setFont(new Font("Arial",Font.PLAIN,14));
        panel.add(user1);

        user2 = new JTextField();
        user2.setBounds(120,250,300,30);
        user2.setFont(new Font("Arial",Font.PLAIN,14));
        panel.add(user2);
    }
    private void mostrarBotones(){


        guardar = new JButton("Guardar");
        guardar.setBounds(250,300,85,30);
        panel.add(guardar);
        ActionListener save = e -> {
            player1=user1.getText();
            player2=user2.getText();
            fichax.setText(user1.getText()+" jugará primero con la X");
            fichao.setText(user2.getText()+" jugará con la O");
            guardar.setVisible(false);
            empezar.setVisible(true);
        };
        guardar.addActionListener(save);

        empezar = new JButton("START");
        empezar.setBounds(250,300,85,30);
        empezar.setVisible(false);
        panel.add(empezar);
        ActionListener start = e -> {
            VentanaPrincipal v1 = new VentanaPrincipal(player1,player2);
            v1.setVisible(true);
            dispose();
        };
        empezar.addActionListener(start);
    }

    public static void main(String[] args) {
        VentanaInicial v1 = new VentanaInicial();
        v1.setVisible(true);
    }
}