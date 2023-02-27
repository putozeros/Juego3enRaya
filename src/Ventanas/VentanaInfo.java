package Ventanas;

import javax.swing.*;

public class VentanaInfo extends JDialog {
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;
    private JPanel panel;
    public VentanaInfo(java.awt.Frame parent,boolean modal){
        super(parent,modal);
        setSize(480,170);
        setTitle("Acerca de");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        mostrarPanel();
        mostrarEtiquetas();
    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void mostrarEtiquetas(){
        etiqueta1 = new JLabel("Desarrollado por Putozeros© todos los derechos reservados");
        etiqueta1.setBounds(10,20,480,20);
        etiqueta2 = new JLabel("7 de Enero de 2023");
        etiqueta2.setBounds(10,40,480,20);
        etiqueta3 = new JLabel("Proyecto de aprendizaje de interfaces gráficas.");
        etiqueta3.setBounds(10,60,480,20);
        etiqueta4 = new JLabel("Todo fue programado a base de código puro. Nada de diseñadores de interfaz.");
        etiqueta4.setBounds(10,80,480,20);
        panel.add(etiqueta1);panel.add(etiqueta2);panel.add(etiqueta3);panel.add(etiqueta4);
    }
}