package layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;

public class Amarco_layout {
    public static void main(String[] args) {
        marcoLayout marco=new marcoLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//VENTANA PRINCIPAL

class marcoLayout extends JFrame{
    public marcoLayout(){
        setVisible(true);
        setTitle("Marco Layout");
        setBounds(20, 20, 500, 300);
        botones bot=new botones();
     //   FlowLayout disposicion=new FlowLayout(FlowLayout.CENTER,50,100);
       // bot.setLayout(disposicion);
        add(bot,BorderLayout.NORTH);
        add(new panel_layout(),BorderLayout.SOUTH);
     }
}

class botones extends JPanel{
    public botones(){
      //  setLayout(new BorderLayout(10,10));
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        add(new JButton("amarillo"));
        add(new JButton("azul"));
    }
}

class panel_layout extends JPanel{
    public panel_layout(){

        setLayout(new BorderLayout());
        add(new JButton("rojo"),BorderLayout.EAST);
        add(new JButton("verde"),BorderLayout.WEST);
        add(new JButton("naranja"),BorderLayout.CENTER);
    }
}
