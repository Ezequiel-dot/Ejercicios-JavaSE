package aplicacionesgraficas;

import javax.swing.*;


public class espring {
    public static void main(String[] args) {
        ventana1 ven=new ventana1();
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setVisible(true);
    }
}

class ventana1 extends JFrame{
    public ventana1(){
        setBounds(200,200,500,300);
        setTitle("Disposicion Grafica");
        add(new panel());
    }
}

class panel extends JPanel{
    public panel(){

        SpringLayout spring=new SpringLayout();
        setLayout(spring);

        JButton btn1=new JButton("Boton1");
        JButton btn2=new JButton("Boton2");
        JButton btn3=new JButton("Boton3");
        add(btn1);
        add(btn2);
        add(btn3);

        Spring miMuelle= Spring.constant(0, 10,100);
        Spring miMuelleRigido=Spring.constant(10);
        spring.putConstraint(SpringLayout.WEST, btn1, miMuelle, SpringLayout.WEST, this);
        spring.putConstraint(SpringLayout.WEST, btn2, miMuelleRigido, SpringLayout.EAST, btn1);
        spring.putConstraint(SpringLayout.WEST, btn3, miMuelleRigido, SpringLayout.EAST, btn2);
        spring.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, btn3);
    }
}

