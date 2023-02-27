package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VentanaPrincipal extends JFrame {
    private int victorias1=0,victorias2=0,empates=0;
    private String turno = "usuario1",jugador1,jugador2;
    private boolean[][] casilla = new boolean[3][3];
    private int[][] ganador = new int[3][3];
    private JPanel panel;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JMenuBar barramenu;
    private JMenu opciones,ayuda;
    private JMenuItem startAgain,showResults,exit,acercaDe,instrucciones;
    private final JSeparator separador = new JSeparator();
    public VentanaPrincipal(String j1,String j2){
        this.jugador1=j1;
        this.jugador2=j2;
        setSize(616,639);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tres en Raya");
        setResizable(true);
        mostrarMenu();
        this.add(barramenu); //vamos a colocar la barra de menú en la ventana directamente, tras llamar a su función.
        this.setJMenuBar(barramenu); //con esto setearemos la ventana para que esté pegada a la ventana.
                                    //Y ESTA FUNCIÓN TAN IMPORTANTE, hará que el menú siempre esté encima de los elementos
        iniciarComponentes();      //haciendo que no estorbe para botones y panel, haciendo que los layout funcionen mucho mejor
        llenarCasillas();
        llenarGanador();

    }
    private void llenarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j]=true;
            }
        }
    }
    private void llenarGanador(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ganador[i][j]=0;
            }
        }
    }
    private void iniciarComponentes(){
        mostrarPanel();
        mostrarBotones();
    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3)); //ahora podremos usar un grid layout de 3x3 sin problemas.
        panel.setPreferredSize(new Dimension(500,500));
        this.add(panel);
    }
    private void mostrarBotones(){
        b1 = new JButton();b2 = new JButton();b3 = new JButton();b4 = new JButton();b5 = new JButton();
        b6 = new JButton();b7 = new JButton();b8 = new JButton();b9 = new JButton();

        ActionListener pulsar1 = e -> {
            if(casilla[0][0]){
                if(turno.equals("usuario1")){
                    dibujarX(b1);
                    ganador[0][0]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b1);
                    ganador[0][0]=2;
                    turno = "usuario1";
                }
                casilla[0][0]=false;
                comprobarGanador();
            }
        };
        b1.addActionListener(pulsar1);
        ActionListener pulsar2 = e -> {
            if(casilla[0][1]){
                if(turno.equals("usuario1")){
                    dibujarX(b2);
                    ganador[0][1]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b2);
                    ganador[0][1]=2;
                    turno = "usuario1";
                }
                casilla[0][1]=false;
                comprobarGanador();
            }
        };
        b2.addActionListener(pulsar2);
        ActionListener pulsar3 = e -> {
            if(casilla[0][2]){
                if(turno.equals("usuario1")){
                    dibujarX(b3);
                    ganador[0][2]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b3);
                    ganador[0][2]=2;
                    turno = "usuario1";
                }
                casilla[0][2]=false;
                comprobarGanador();
            }
        };
        b3.addActionListener(pulsar3);
        ActionListener pulsar4 = e -> {
            if(casilla[1][0]){
                if(turno.equals("usuario1")){
                    dibujarX(b4);
                    ganador[1][0]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b4);
                    ganador[1][0]=2;
                    turno = "usuario1";
                }
                casilla[1][0]=false;
                comprobarGanador();
            }
        };
        b4.addActionListener(pulsar4);
        ActionListener pulsar5 = e -> {
            if(casilla[1][1]){
                if(turno.equals("usuario1")){
                    dibujarX(b5);
                    ganador[1][1]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b5);
                    ganador[1][1]=2;
                    turno = "usuario1";
                }
                casilla[1][1]=false;
                comprobarGanador();
            }
        };
        b5.addActionListener(pulsar5);
        ActionListener pulsar6 = e -> {
            if(casilla[1][2]){
                if(turno.equals("usuario1")){
                    dibujarX(b6);
                    ganador[1][2]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b6);
                    ganador[1][2]=2;
                    turno = "usuario1";
                }
                casilla[1][2]=false;
                comprobarGanador();
            }
        };
        b6.addActionListener(pulsar6);
        ActionListener pulsar7 = e -> {
            if(casilla[2][0]){
                if(turno.equals("usuario1")){
                    dibujarX(b7);
                    ganador[2][0]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b7);
                    ganador[2][0]=2;
                    turno = "usuario1";
                }
                casilla[2][0]=false;
                comprobarGanador();
            }
        };
        b7.addActionListener(pulsar7);
        ActionListener pulsar8 = e -> {
            if(casilla[2][1]){
                if(turno.equals("usuario1")){
                    dibujarX(b8);
                    ganador[2][1]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b8);
                    ganador[2][1]=2;
                    turno = "usuario1";
                }
                casilla[2][1]=false;
                comprobarGanador();
            }
        };
        b8.addActionListener(pulsar8);
        ActionListener pulsar9 = e -> {
            if(casilla[2][2]){
                if(turno.equals("usuario1")){
                    dibujarX(b9);
                    ganador[2][2]=1;
                    turno = "usuario2";
                }
                else{
                    dibujarO(b9);
                    ganador[2][2]=2;
                    turno = "usuario1";
                }
                casilla[2][2]=false;
                comprobarGanador();
            }
        };
        b9.addActionListener(pulsar9);

        panel.add(b1);panel.add(b2);panel.add(b3);panel.add(b4);panel.add(b5);panel.add(b6);panel.add(b7);
        panel.add(b8);panel.add(b9);

    }
    private void mostrarMenu(){
        barramenu = new JMenuBar();
        barramenu.setBounds(0,0,600,20);

        opciones = new JMenu("Opciones");
        opciones.setBounds(0,0,65,20);
        ayuda = new JMenu("Ayuda");
        ayuda.setBounds(70,0,60,20);

        startAgain = new JMenuItem("Empezar de nuevo");
        showResults = new JMenuItem("Mostrar resultados");
        exit = new JMenuItem("Salir");
        acercaDe = new JMenuItem("Acerca de");
        instrucciones = new JMenuItem("Instrucciones");
        ActionListener replay = e -> reiniciarb();
        ActionListener salir = e -> System.exit(0);
        ActionListener resultados = e -> mostrarResultados();
        ActionListener info = e -> bringMeInfo();
        ActionListener help = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
                } catch (IOException ex) {
                    //throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    //throw new RuntimeException(ex);
                }
            }
        };
        instrucciones.addActionListener(help);
        exit.addActionListener(salir);
        startAgain.addActionListener(replay);
        showResults.addActionListener(resultados);
        acercaDe.addActionListener(info);
        ayuda.add(instrucciones);
        ayuda.add(acercaDe);
        opciones.add(startAgain);opciones.add(showResults);opciones.add(separador);opciones.add(exit);

        barramenu.add(opciones);
        barramenu.add(ayuda);
    }
    private void comprobarGanador(){
        boolean ganador1, ganador2;
        int casillasEmpate = 0;

        ganador1 = comprobar(1);
        ganador2 = comprobar(2);
        if(ganador1){
            VentanaGanador v1 = new VentanaGanador(this,true,jugador1);
            v1.setVisible(true);
            victorias1++;
            reiniciar();
        }
        else if(ganador2){
            VentanaGanador v1 = new VentanaGanador(this,true,jugador2);
            v1.setVisible(true);
            victorias2++;
            reiniciar();
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(ganador[i][j]!=0){
                        casillasEmpate++;
                    }
                }
            }
            if(casillasEmpate==9){
                VentanaEmpate v1 = new VentanaEmpate(this,true);
                v1.setVisible(true);
                empates++;
                reiniciar();
            }
            else{
                casillasEmpate=0;
            }
        }
    }
    private void reiniciarb(){
        llenarCasillas();
        llenarGanador();
        if(turno.equals("usuario1")){
            turno="usuario1";
        }
        else{
            turno="usuario2";
        }
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
    }
    private void reiniciar(){
        llenarCasillas();
        llenarGanador();
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
    }
    private boolean comprobar(int num){
        boolean winner = false;

        if(ganador[0][0]==num && ganador[0][1]==num && ganador[0][2]==num){
            winner=true;
        }
        if(ganador[1][0]==num && ganador[1][1]==num && ganador[1][2]==num){
            winner=true;
        }
        if(ganador[2][0]==num && ganador[2][1]==num && ganador[2][2]==num){
            winner=true;
        }
        if(ganador[0][0]==num && ganador[1][0]==num && ganador[2][0]==num){
            winner=true;
        }
        if(ganador[0][1]==num && ganador[1][1]==num && ganador[2][1]==num){
            winner=true;
        }
        if(ganador[0][2]==num && ganador[1][2]==num && ganador[2][2]==num){
            winner=true;
        }
        if(ganador[0][0]==num && ganador[1][1]==num && ganador[2][2]==num){
            winner=true;
        }
        if(ganador[2][0]==num && ganador[1][1]==num && ganador[0][2]==num){
            winner=true;
        }

        return winner;
    }
    private void bringMeInfo(){
        VentanaInfo v1 = new VentanaInfo(this,true);
        v1.setVisible(true);
    }
    private void mostrarResultados(){
        VentanaResultados v1 = new VentanaResultados(this,true,jugador1,jugador2,victorias1,victorias2,empates);
        v1.setVisible(true);
    }
    private void dibujarX(JButton boton){
        ImageIcon x = new ImageIcon(getClass().getResource("/Imagenes/x.png"));
        boton.setIcon(new ImageIcon(x.getImage().getScaledInstance(170,170,4)));
    }
    private void dibujarO(JButton boton){
        ImageIcon o = new ImageIcon(getClass().getResource("/Imagenes/o.png"));
        boton.setIcon(new ImageIcon(o.getImage().getScaledInstance(220,220,4)));
    }
}