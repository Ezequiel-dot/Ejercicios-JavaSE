package layouts;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;


public class Vjslider {
    public static void main(String[] args) {
        jframe lam=new jframe();
        lam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lam.setVisible(true);
    }
}

class jframe extends JFrame{
    public jframe(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new hoja());  
    }
}

class hoja extends JPanel{
    public hoja(){
        setLayout(new BorderLayout());

        texto=new JLabel("Arrancamos paso a paso");

        slider=new JSlider(SwingConstants.HORIZONTAL,8,50,8);



        slider.setMajorTickSpacing(6);//ponemos los valores
        slider.setMinorTickSpacing(2);
        slider.setPaintTicks(true);

        slider.setFont(new Font("Serif",Font.ITALIC,12));
        slider.setPaintLabels(true);//pintamos los valores

        slider.setSnapToTicks(true);//redondea en la marca mas cerca

        JPanel lamina1=new JPanel();

        lamina1.add(slider);

        slider.addChangeListener(new tamañoLetra());

        add(lamina1,BorderLayout.NORTH);

        add(texto,BorderLayout.CENTER);
    }

    private class tamañoLetra implements ChangeListener{

        public void stateChanged(ChangeEvent e) {
            texto.setFont(new Font("Serif",Font.ITALIC,slider.getValue()));
        }
        
    }

    private JLabel texto;
    private JSlider slider;
}
