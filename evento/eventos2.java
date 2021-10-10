package evento;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.*;

public class eventos2 {
    public static void main(String[] args) {
        eventoClick2 evento1=new eventoClick2();
        evento1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class eventoClick2 extends JFrame{

    public eventoClick2(){
        setTitle("botones");
        setVisible(true);
        setBounds(200,200,500,500);

        boton2 boton1=new boton2();
        add(boton1);
    }
}

class boton2 extends JPanel{
    
    JButton botonAzul=new JButton("Azul");
    JButton botonRojo=new JButton("Rojo");
    JButton botonVerde=new JButton("Verde");
    JButton botonAmarillo=new JButton("Amarillo");

    public boton2(){

        ColorFondo azul=new ColorFondo(Color.blue);
        ColorFondo rojo=new ColorFondo(Color.red);
        ColorFondo verde=new ColorFondo(Color.green);
        ColorFondo amarillo=new ColorFondo(Color.yellow);

        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);

        botonAzul.addActionListener(azul);
        botonRojo.addActionListener(rojo);
        botonVerde.addActionListener(verde);
        botonAmarillo.addActionListener(amarillo);
    }

    private class ColorFondo implements ActionListener{
        private Color color_de_fondo;
        public ColorFondo(Color c){
            color_de_fondo=c;
        }
        public void actionPerformed(ActionEvent f){
            setBackground(color_de_fondo);
        }
    }
}

