package evento;
import javax.swing.JFrame;

import java.awt.event.*;

public class ratonEvento {
    public static void main(String[] args) {
        ratonEvento1 raton=new ratonEvento1();
        raton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



class ratonEvento1 extends JFrame{
    public ratonEvento1(){
        setVisible(true);
        setBounds(50, 50, 500, 300);
       addMouseListener(new pulsarClick());
       addMouseMotionListener(new pulsarClick());
    }
}

class pulsarClick extends MouseAdapter implements MouseMotionListener{// clase MouseAdapter,interfaz MouseListener

    
    public void mouseClicked(MouseEvent e) {
    //  System.out.println("Coordenada x:"+e.getX()+"   Coordenada y:"+e.getY());
      System.out.println(e.getClickCount());
    }

    public void mousePressed(MouseEvent e) {
     //   System.out.println("presionando"+e.getModifiersEx());

        if(e.getModifiersEx()==1024){
            System.out.println("Pulsaste boton Izquierdo");
        }
        if(e.getModifiersEx()==4096){
            System.out.println("Pulsaste boton Derecho");
        }
        if(e.getModifiersEx()==2048){
            System.out.println("Pulsaste boton de ruedita");
        }

    }
/*
    public void mouseReleased(MouseEvent e) {
        System.out.println("dejaste de presionar");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("entraste a la ventana con el mouse");

    }

    public void mouseExited(MouseEvent e) { 
        System.out.println("saliste a la ventana con el mouse");

    }*/


    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

   
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
     }
}

