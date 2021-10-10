package layouts;

import javax.swing.*;
import java.awt.*;


public class Zjpopupmenu {
    public static void main(String[] args) {
        popupMenu aa=new popupMenu();
        aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aa.setVisible(true);
        System.out.println("ff");
    }
}

class popupMenu extends JFrame{
    public popupMenu(){
        setBounds(400,100,500,300);
        setTitle("Menu popap");
        add(new popMenu());
    }
}

class popMenu extends JPanel{
    public popMenu(){
        setLayout(new BorderLayout());
        JPanel lamina1=new JPanel();
        JMenuBar menu=new JMenuBar();
        JMenu fuente=new JMenu("Fuente");
        JMenu estilo=new JMenu("Estilo");
        JMenu tamaño=new JMenu("Tamaño");
        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamaño);
        lamina1.add(menu);
        add(lamina1,BorderLayout.NORTH);

        JTextPane texto=new JTextPane();
        add(texto,BorderLayout.CENTER);
//------------------------------------------------------------------
        JPopupMenu emergente=new JPopupMenu();
        JMenuItem op1=new JMenuItem("Opcion1");
        JMenuItem op2=new JMenuItem("Opcion2");
        JMenuItem op3=new JMenuItem("Opcion3");
        emergente.add(op1);
        emergente.add(op2);
        emergente.add(op3);
        texto.setComponentPopupMenu(emergente);
    }
}
