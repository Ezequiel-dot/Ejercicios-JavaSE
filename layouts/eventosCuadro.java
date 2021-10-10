package layouts;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.event.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class eventosCuadro {
    public static void main(String[] args) {
        cuadrosCuadro cuadro=new cuadrosCuadro();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}


class cuadrosCuadro extends JFrame{
    cuadrosCuadro(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");
        add(new cuadro());

        
    }
}

class cuadro extends JPanel{
    public cuadro(){
        setLayout(new BorderLayout());

        add(new JButton("Enviar"),BorderLayout.SOUTH);

        add(new cuadro2(),BorderLayout.NORTH);

        add(new laminas(),BorderLayout.CENTER);
    }
}

class cuadro2 extends JPanel{
    public cuadro2(){
      //  setLayout(new FlowLayout());

        setLayout(new GridLayout(2,2));
        

        JLabel etiqueta1=new JLabel("Usuario");
        JLabel etiqueta2=new JLabel("Contraseña");
        JTextField usuario=new JTextField(15);
        contraseña=new JPasswordField(15);

        add(etiqueta1);
        add(usuario);
        add(etiqueta2);
        add(contraseña);

        contraseña.getDocument().addDocumentListener(new compruevaPassword());
    }
    private class compruevaPassword implements DocumentListener{

       // char [] contra=contraseña.getPassword();

        public void insertUpdate(DocumentEvent e) {
            char [] contra=contraseña.getPassword();
            if(contra.length<8||contra.length>12){
            contraseña.setBackground(Color.red);
           }else{
            contraseña.setBackground(Color.WHITE);
           }
        }
        public void removeUpdate(DocumentEvent e) {
            char [] contra=contraseña.getPassword();
            if(contra.length<8||contra.length>12){
             contraseña.setBackground(Color.red);
            }else{
             contraseña.setBackground(Color.WHITE);
            }
        }
        public void changedUpdate(DocumentEvent e) {
           
        }
    }
    JPasswordField contraseña;
}


class laminas extends JPanel{
    public laminas(){
        miArea=new JTextArea(8,20);
        JScrollPane despl=new JScrollPane(miArea);//agrega barra de desplazamiento
       // miArea.setLineWrap(true);//no permite seguir escribiendo horizontalmente

        JButton bot=new JButton("Mostrar en consola");
        bot.addActionListener(new mostrarMensaje());
        
        add(despl);

        add(bot);
    }
    private class mostrarMensaje implements ActionListener{

        public void actionPerformed(ActionEvent e) {
          System.out.println(miArea.getText());  
        }
    }
    private JTextArea miArea;
}