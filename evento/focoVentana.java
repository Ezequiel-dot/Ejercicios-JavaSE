package evento;

import javax.swing.JFrame;

import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;



public class focoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
        focoVentana mm=new focoVentana();
        mm.iniciar();
    }

    public void iniciar(){
        marco1 = new focoVentana();
        marco2 = new focoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(100,100,600,350);
        marco2.setBounds(700,100,600,350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);

    }

    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource()==marco1){
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }
    }

    public void windowLostFocus(WindowEvent e) {
        if(e.getSource()==marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
    }

    focoVentana marco1;
    focoVentana marco2;
}
