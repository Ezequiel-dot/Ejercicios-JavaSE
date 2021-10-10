package layouts;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VbotonGrup2 {
    public static void main(String[] args) {
        botonGrupo2 cuadro=new botonGrupo2();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}



class botonGrupo2 extends JFrame{
    botonGrupo2(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new radio2());        
    }
}

class radio2 extends JPanel{
    public radio2(){

        setLayout(new BorderLayout());
        texto=new JLabel("Arrancamos paso a paso");
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        add(texto,BorderLayout.CENTER);


        lamina1=new JPanel();
        grupo1=new ButtonGroup();
        colocarBotones("Pequeño",true,12);
        colocarBotones("Mediano",false,14);
        colocarBotones("Grande",false,18);
        colocarBotones("Muy Grande",false,24);
        add(lamina1,BorderLayout.SOUTH);
   }
   public void colocarBotones(String nombre,boolean selec,final int tamaño){

    JRadioButton bot=new JRadioButton(nombre,selec);
    grupo1.add(bot);
    lamina1.add(bot);

     ActionListener tamañoLetra=new ActionListener(){

        public void actionPerformed(ActionEvent e) {
           texto.setFont(new Font("Serif",Font.PLAIN,tamaño)); 
        }
    };
    bot.addActionListener(tamañoLetra);
   }
   
   private JLabel texto;
  // private JRadioButton bot1,bot2,bot3,bot4;
   private ButtonGroup grupo1;
   private JPanel lamina1;

}

/*
class radio2 extends JPanel{
    public radio2(){

        setLayout(new BorderLayout());
        texto=new JLabel("Arrancamos paso a paso");
        add(texto,BorderLayout.CENTER);

        ButtonGroup grup1=new ButtonGroup();
        bot1=new JRadioButton("Pequeño",true);
        bot2=new JRadioButton("Mediano",false);
        bot3=new JRadioButton("Grande",false);
        bot4=new JRadioButton("MuyGrande",false);

        JPanel lamina1=new JPanel();
        grup1.add(bot1);
        grup1.add(bot2);
        grup1.add(bot3);
        grup1.add(bot4);
        lamina1.add(bot1);
        lamina1.add(bot2);
        lamina1.add(bot3);
        lamina1.add(bot4);
        add(lamina1,BorderLayout.SOUTH);

        bot1.addActionListener(new tamañoLetra());
        bot2.addActionListener(new tamañoLetra());
        bot3.addActionListener(new tamañoLetra());
        bot4.addActionListener(new tamañoLetra());
   }
   private class tamañoLetra implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bot1){
           texto.setFont(new Font("Serif",Font.PLAIN,10));
        }
        else if(e.getSource()==bot2){
        texto.setFont(new Font("Serif",Font.PLAIN,14));
        }
        else if(e.getSource()==bot3){
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        }
        else if(e.getSource()==bot4){
        texto.setFont(new Font("Serif",Font.PLAIN,24));
        }
    }

   }
   private JLabel texto;
   private JRadioButton bot1,bot2,bot3,bot4;

}
*/