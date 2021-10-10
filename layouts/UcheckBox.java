package layouts;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UcheckBox {
    public static void main(String[] args) {
        checkbox cuadro=new checkbox();
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
}

class checkbox extends JFrame{
    checkbox(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new check());        
    }
}

class check extends JPanel{
    public check(){
       setLayout(new BorderLayout());
       Font miLetra=new Font("Serif",Font.PLAIN,24);
       texto=new JLabel("Hola muy buenas a todos");
       texto.setFont(miLetra);

       JPanel lamina1=new JPanel();
       lamina1.add(texto);
       add(lamina1,BorderLayout.CENTER);

       check1=new JCheckBox("negrita");
       check2=new JCheckBox("cursiva");

       JPanel lamina2=new JPanel();
       check1.addActionListener(new negrita());
       lamina2.add(check1);
       check2.addActionListener(new negrita());
       lamina2.add(check2);
       add(lamina2,BorderLayout.SOUTH);
       
   }

   private class negrita implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        
        int num=0;
       if(check1.isSelected()==true){
        num+=Font.BOLD;
       }
       if(check2.isSelected()==true){
        num+=Font.ITALIC;
       }
       texto.setFont(new Font("Serif",num,24));
        
    }

   }


   private JLabel texto;
   private JCheckBox check1,check2;
}