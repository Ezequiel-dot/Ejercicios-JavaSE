package aplicacionesgraficas;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import java.awt.*;



public class ap_grafica1 {
    public static void main(String[] args) {
        multipleEvento even=new multipleEvento();
        even.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class multipleEvento extends JFrame{
    public multipleEvento(){
        setVisible(true);
        setBounds(50, 50, 500, 300);
        setTitle("EVENTOS MULTIPLES");
       
        add(new panelAction());
    }
}

class panelAction extends JPanel{

    public panelAction(){

        setLayout(new BorderLayout());
        
        cambiaColor botonAmarillo=new cambiaColor("amarillo",new ImageIcon("rc/grafico/discodenewton.gif"),Color.yellow);
        cambiaColor botonAzul=new cambiaColor("azul",new ImageIcon("rc/grafico/discodenewton.gif"),Color.blue);
        cambiaColor botonRojo=new cambiaColor("rojo",new ImageIcon("rc/grafico/discodenewton.gif"),Color.RED);

        Action salir=new AbstractAction("Salir"){

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        };

        JMenu menu=new JMenu("Color");
        menu.add(botonAmarillo);
        menu.add(botonAzul);
        menu.add(botonRojo);


        JMenuBar menuBar=new JMenuBar();
        menuBar.add(menu);
        add(menuBar,BorderLayout.NORTH);

        JToolBar barraHerr= new JToolBar();
        barraHerr.add(botonAmarillo);
        barraHerr.add(botonAzul);
        barraHerr.add(botonRojo);
        barraHerr.addSeparator();
        barraHerr.add(salir);
        add(barraHerr,BorderLayout.NORTH);



        InputMap map=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mapaAccion=getActionMap();

        map.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
        mapaAccion.put("fondo_amarillo", botonAmarillo);

        map.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
        mapaAccion.put("fondo_azul", botonAzul);

        map.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
        mapaAccion.put("fondo_rojo", botonRojo);
        
    }

    private class cambiaColor extends AbstractAction{

        public cambiaColor(String nombre,Icon icono,Color color_lamina){
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color: "+nombre);
            putValue("color_de_fondo", color_lamina);
        }
    
        public void actionPerformed(ActionEvent e) {
            Color c=(Color)getValue("color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: "+getValue(Action.NAME)+", Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
        }
    }
}


