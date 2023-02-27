package Ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaResultados extends JDialog {
    private String usuario1,usuario2;
    private int victorias1,victorias2,empates;
    private JPanel panel;
    private JLabel resultados,vicp1,vicp2,tablitas,numvic1,numvic2,numemp;
    private JButton b1;

    public VentanaResultados(java.awt.Frame parent,boolean modal,String p1,String p2,int vic1,int vic2,int emp){
        super(parent,modal);
        this.usuario1=p1;
        this.usuario2=p2;
        this.victorias1=vic1;
        this.victorias2=vic2;
        this.empates=emp;
        setSize(616,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        mostrarPanel();
        mostrarEtiquetas();
        mostrarBotones();
    }

    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void mostrarEtiquetas(){
        resultados = new JLabel("Resultados");
        resultados.setBounds(220,10,300,30);
        resultados.setFont(new Font("Arial",Font.BOLD,25));
        panel.add(resultados);

        vicp1 = new JLabel("Victorias de "+usuario1+" = ");
        vicp1.setBounds(20,50,300,50);
        vicp1.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(vicp1);

        numvic1= new JLabel(""+victorias1);
        numvic1.setBounds(280,50,30,50);
        numvic1.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(numvic1);

        vicp2 = new JLabel("Victorias de "+usuario2+" = ");
        vicp2.setBounds(20,100,300,50);
        vicp2.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(vicp2);

        numvic2= new JLabel(""+victorias2);
        numvic2.setBounds(280,100,30,50);
        numvic2.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(numvic2);

        tablitas = new JLabel("Empates = ");
        tablitas.setBounds(20,150,120,50);
        tablitas.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(tablitas);

        numemp= new JLabel(""+empates);
        numemp.setBounds(140,150,30,50);
        numemp.setFont(new Font("Arial",Font.PLAIN,20));
        panel.add(numemp);
    }
    private void mostrarBotones(){
        b1 = new JButton("volver");
        b1.setBounds(470,200,90,40);
        b1.setFont(new Font("Arial",Font.PLAIN,20));
        ActionListener volver = e -> dispose();
        b1.addActionListener(volver);
        panel.add(b1);
    }

}