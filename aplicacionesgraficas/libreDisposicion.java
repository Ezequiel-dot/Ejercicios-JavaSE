package aplicacionesgraficas;


import javax.swing.*;


import java.awt.*;



public class libreDisposicion {
    public static void main(String[] args) {
        ventana2 ven=new ventana2();
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setVisible(true);
    }
}

class ventana2 extends JFrame{
    public ventana2(){
        setBounds(200,200,500,300);
        setTitle("Disposicion Grafica");
        add(new panel1());
    }
}

class panel1 extends JPanel{
    public panel1(){
        setLayout(new enColumnas());

        JLabel nom=new JLabel("Nombre: ");
        JLabel ap=new JLabel("Apellido: ");
        JTextField textNom=new JTextField(10);
        JTextField textAp=new JTextField(10);
/*
        nom.setBounds(100,20,100,20);
        textNom.setBounds(200,20,100,20);
        ap.setBounds(100,60,100,20);
        textAp.setBounds(200,60,100,20);
*/      
        

        add(nom);
        add(textNom);
        add(ap);
        add(textAp);

    }
}

class enColumnas implements LayoutManager{

    public void addLayoutComponent(String name, Component comp) {
       
        
    }
    public void removeLayoutComponent(Component comp) {
       
        
    }

    public Dimension preferredLayoutSize(Container parent) {
       
        return null;
    }

    public Dimension minimumLayoutSize(Container parent) {
     
        return null;
    }

    public void layoutContainer(Container parent) {
        int contador=0;
        int n=parent.getComponentCount();
        int d=parent.getWidth();
        x=d/2;

        for(int i=0;i<n;i++){
            contador++;
            Component c=parent.getComponent(i);
            c.setBounds(x-105, y, 100, 20);
            
            x+=110;
            
            if((contador%2)==0){
                y+=40;
                x=d/2;
            }
        }
        
    }
    private int x;
    private int y=20;
}