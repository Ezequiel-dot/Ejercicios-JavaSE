package layouts;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.event.*;
import javax.swing.text.Document;


public class EventosTexto {
    public static void main(String[] args) {
        cuadrosTexto2 cuadro=new cuadrosTexto2();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}

class cuadrosTexto2 extends JFrame{
    cuadrosTexto2(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");
        add(new texto2());
    }
}

class texto2 extends JPanel{
    texto2(){
        JTextField text=new JTextField(20);
        add(text);

        Document miTexto=text.getDocument();
        miTexto.addDocumentListener(new escucha());
    }
    private class escucha implements DocumentListener{

        
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");

            
        }
        public void changedUpdate(DocumentEvent e) {
            System.out.println("Has cambiado texto");

        }

    }
}
