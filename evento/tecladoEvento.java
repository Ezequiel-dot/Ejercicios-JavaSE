package evento;

import javax.swing.JFrame;

import java.awt.event.*;

public class tecladoEvento {
    public static void main(String[] args) {
        tecladoEvento1 teclado=new tecladoEvento1();
        teclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class tecladoEvento1 extends JFrame{
    public tecladoEvento1(){
        setVisible(true);
        setBounds(50, 50, 500, 300);
        addKeyListener(new pulsarTecla());
    }
}

class pulsarTecla implements KeyListener{

    
    public void keyTyped(KeyEvent e) {//cuando se presiona la tecla
        // System.out.println(e.getKeyCode());
        
     }

    
    public void keyPressed(KeyEvent e) {//cuando la suelta

    }

    
    public void keyReleased(KeyEvent e) {//cuando hace ambas
        
        System.out.println(e.getKeyChar());
 
        System.out.println(e.getKeyCode());
    }
    
}
