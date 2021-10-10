package grafico;
import java.awt.*;
import javax.swing.JFrame;

public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarco extends JFrame{
    public miMarco(){
        /*
        //setSize(2000, 2000);
        setBounds(500,300,250,250);
        setResizable(false);

        //es lo mismo de ambas maneras
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setExtendedState(6);

        
*/
        
        setTitle("MI VENTANA");

        Toolkit centrarMarco=Toolkit.getDefaultToolkit();

        Dimension tamañoPantalla=centrarMarco.getScreenSize();

        int altoPantalla=tamañoPantalla.height;
        int anchoPantalla=tamañoPantalla.width;

        setSize(anchoPantalla/2,altoPantalla/2);
        setLocation(anchoPantalla/4,altoPantalla/4);

        Image miIcono=centrarMarco.getImage("src/grafico/icono.gif");
        setIconImage(miIcono);

   
    }
}
