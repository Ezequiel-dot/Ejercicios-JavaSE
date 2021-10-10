package evento;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.*;

public class eventos {
    public static void main(String[] args) {
        eventoClick evento1=new eventoClick();
        evento1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class eventoClick extends JFrame{

    public eventoClick(){
        setTitle("botones");
        setVisible(true);
        setBounds(200,200,500,500);

        boton boton1=new boton();
        add(boton1);
    }
}

class boton extends JPanel implements ActionListener{
    JButton botonAzul=new JButton("Azul");
    JButton botonRojo=new JButton("Rojo");
    JButton botonVerde=new JButton("Verde");
    JButton botonAmarillo=new JButton("Amarillo");

    public boton(){

        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonAmarillo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object pulsarBoton=e.getSource();//el get source nos dice que boton fue pulsado

        if(pulsarBoton==botonAzul){
            setBackground(Color.blue);
        }
        if(pulsarBoton==botonRojo){
            setBackground(Color.red);
        }
        if(pulsarBoton==botonVerde){
            setBackground(Color.green);
        }
        if(pulsarBoton==botonAmarillo){
            setBackground(Color.YELLOW);
        }
    }
}

