package aplicacionesgraficas;

import javax.swing.*;
import java.awt.*;


public class disposicionGrafica {
    public static void main(String[] args) {
        ventana ven=new ventana();
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setVisible(true);
    }
}

class ventana extends JFrame{
    public ventana(){
        setBounds(200,200,500,300);
        setTitle("Disposicion Grafica");

        JLabel rotulo1=new JLabel("Nombre");
        JTextField texto1=new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());

        Box caja1=Box.createHorizontalBox();
        caja1.add(rotulo1);
        caja1.add(Box.createHorizontalStrut(20));        
        caja1.add(texto1);

        JLabel rotulo2=new JLabel("contraseña");
        JTextField texto2=new JTextField(10);
        texto2.setMaximumSize(texto2.getPreferredSize());
        
        Box caja2=Box.createHorizontalBox();
        caja2.add(rotulo2);
        caja2.add(Box.createHorizontalStrut(20));        
        caja2.add(texto2);

        Box caja3=Box.createHorizontalBox();
        JButton ok=new JButton("Ok");
        JButton salir=new JButton("Salir");
        caja3.add(ok);
        caja3.add(Box.createGlue()); 
        caja3.add(salir);

        Box cajaV=Box.createVerticalBox();

        cajaV.add(caja1);
        cajaV.add(caja2);
        cajaV.add(caja3);
        add(cajaV,BorderLayout.CENTER);

    }
}
