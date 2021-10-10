package layouts;

import javax.swing.ButtonGroup;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class VbotonGrupo {
    public static void main(String[] args) {
        botonGrupo cuadro=new botonGrupo();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}

class botonGrupo extends JFrame{
    botonGrupo(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new radio());        
    }
}

class radio extends JPanel{
    public radio(){
     //  setLayout(new BorderLayout());
        
       ButtonGroup botgr1=new ButtonGroup();
       
       ButtonGroup botgr2=new ButtonGroup();
       JRadioButton bot1=new JRadioButton("Azul",false);
       JRadioButton bot2=new JRadioButton("Rojo",true);
       JRadioButton bot3=new JRadioButton("Amarillo",false);
       JRadioButton bot4=new JRadioButton("Masculino",true);
       JRadioButton bot5=new JRadioButton("Femenino",false);
//     meter boton al grupo
       botgr1.add(bot1);
       botgr1.add(bot2);
       botgr1.add(bot3);
       botgr2.add(bot4);
       botgr2.add(bot5);
       //insertarlo en la lamina
       add(bot1);
       add(bot2);
       add(bot3);
       add(bot4);
       add(bot5);

   }
}