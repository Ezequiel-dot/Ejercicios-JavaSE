package evento;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class ZmultiplesOyentes {
    public static void main(String[] args) {
        multipleOyente even=new multipleOyente();
        even.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//CREAMOS UN VENTANA PRINCIPAL

class multipleOyente extends JFrame{
    public multipleOyente(){
        setVisible(true);
        setBounds(500, 20, 500, 300);
        setTitle("VENTANA PRINCIPAL");
       
        add(new panelAction2());
    }
}

//CREAMOS LOS BOTONES DE LA VENTANA

class panelAction2 extends JPanel{

    public panelAction2(){
        JButton boton_nuevo=new JButton("Nueva ventana");
        add(boton_nuevo);
        boton_cerrar=new JButton("Cerrar ventanas");
        add(boton_cerrar);
      
        boton_nuevo.addActionListener(new oyenteNuevo());
    }
    private class oyenteNuevo implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        abrirCerrarVentana ven=new abrirCerrarVentana( boton_cerrar);
        ven.setVisible(true);
        }
    }
   

    JButton boton_cerrar;
}

//LES DAMOS FUNCIONES A LOS BOTONES

class abrirCerrarVentana extends JFrame{
    public abrirCerrarVentana(JButton boton_cerrar2){
        contador++;
        setTitle("Ventana "+contador);
        setBounds(50*contador,50*contador,300,150);
        setVisible(true);
        boton_cerrar2.addActionListener(new cerrarVentana());
    }

    private class cerrarVentana implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            dispose();//ESTO CIRRA LAS VENTANAS
         }
        
    }

    private static int contador=0;
}
