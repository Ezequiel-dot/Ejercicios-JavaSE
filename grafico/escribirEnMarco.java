package grafico;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class escribirEnMarco {
    public static void main(String[] args) {
        MarcoConTexto mimarco=new MarcoConTexto();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Hola Todo Bien");
        Lamina milamina=new Lamina();
        add(milamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Estoy editando", 100, 100);
    }
}
