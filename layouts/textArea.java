package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class textArea {
    public static void main(String[] args) {
        cuadrosCuadro2 cuadro=new cuadrosCuadro2();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}

class cuadrosCuadro2 extends JFrame{
    cuadrosCuadro2(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");

        setLayout(new BorderLayout());
        add(new panel());

        
    }
}

class panel extends JPanel{
    public panel(){
        lamina2=new JPanel();
        laminabotones =new JPanel();
        setLayout(new BorderLayout());

        botonIniciar=new JButton("INICIAR");
        botonSalto=new JButton("Salto de linea");
        botonIniciar.addActionListener(new claseInicio());
        botonSalto.addActionListener(new claseSalto());
        
        textAr=new JTextArea(35,40);
        despl=new JScrollPane(textAr);
        //agrego text area
        lamina2.add(despl);
        add(lamina2,BorderLayout.CENTER);
        //agrego botones
        laminabotones.add(botonIniciar);
        laminabotones.add(botonSalto);
        add(laminabotones,BorderLayout.SOUTH);

    }
    private class claseInicio implements ActionListener{

        public void actionPerformed(ActionEvent e) {
          textAr.append("Hola, me llamo Ezequiel Osella");
        }

    }
    private class claseSalto implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           boolean saltar=!textAr.getLineWrap();
           textAr.setLineWrap(saltar);
         /*  if(saltar){
               botonSalto.setText("No Saltar");
           }else{
            botonSalto.setText("Si Saltar");
           }*/

           botonSalto.setText(saltar ?"No Saltar":"Si Saltar");
        }

    }
    private JTextArea textAr;
    private JButton botonIniciar,botonSalto;
    private JScrollPane despl;
    private JPanel lamina2,laminabotones;
}

