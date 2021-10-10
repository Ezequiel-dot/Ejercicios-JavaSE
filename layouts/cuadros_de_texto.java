package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

public class cuadros_de_texto {
    public static void main(String[] args) {
        cuadrosTexto cuadro=new cuadrosTexto();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}

class cuadrosTexto extends JFrame{
    cuadrosTexto(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");
        add(new texto());
    }
}

class texto extends JPanel{
    texto(){

        setLayout(new BorderLayout());
        JPanel lamina2=new JPanel();
        lamina2.setLayout(new FlowLayout());

        resultado=new JLabel("",JLabel.CENTER);
        
        JLabel placeholder=new JLabel("Email:");
        lamina2.add(placeholder);//email:
    
        campo1=new JTextField(20);
        lamina2.add(campo1);//texto

        add(resultado, BorderLayout.CENTER);
    
        JButton boton=new JButton("Enviar");
        DameTexto text=new DameTexto();
        boton.addActionListener(text);
        lamina2.add(boton);//BOTON        

        add(lamina2,BorderLayout.NORTH);//LAMINA

    }
    private class DameTexto implements ActionListener{

    
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
            
            int correcto=0;
            String email=campo1.getText().trim();

            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'||email.charAt(i)=='.'){
                    correcto++;
                }
            }
            if(correcto==2&&email.length()>8){
              
                resultado.setText("Email correcto");
                
            }else{
             
                resultado.setText("EMAIL INCORRECTO");
                
            }
        }
        
    }
    private JTextField campo1;
    private JLabel resultado;
}

