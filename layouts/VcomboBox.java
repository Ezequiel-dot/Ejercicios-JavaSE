package layouts;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VcomboBox {
    public static void main(String[] args) {
        botonGrupo3 cuadro=new botonGrupo3();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}


class botonGrupo3 extends JFrame{
    botonGrupo3(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new lamina());        
    }
}

class lamina extends JPanel{
    public lamina(){
        setLayout(new BorderLayout());

        texto=new JLabel("Arrancamos paso a paso");
        texto.setFont(new Font("Serif",Font.PLAIN,19));
        add(texto,BorderLayout.CENTER);

        JPanel lamina2=new JPanel();
        micombo=new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("Monospaced");
        micombo.addItem("Courier");
        micombo.addItem("Arial");

        lamina2.add(micombo);
        add(lamina2,BorderLayout.NORTH);
        
        micombo.addActionListener(new tipoLetra());
    }

    private class tipoLetra implements ActionListener{

        public void actionPerformed(ActionEvent e) {
       
        texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,19));

        }

    }

    private JLabel texto;
    private JComboBox micombo;
}