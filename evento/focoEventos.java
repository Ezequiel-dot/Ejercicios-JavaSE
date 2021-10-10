package evento;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.event.*;

public class focoEventos {
    public static void main(String[] args) {
        focoeveto foc=new focoeveto();
        foc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class focoeveto extends JFrame{
    public focoeveto(){
        setVisible(true);
        setBounds(50, 50, 500, 300);
        setTitle("eventos del foco");
        laminaFoco lf=new laminaFoco();
        add(lf);
    }
}

class laminaFoco extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setLayout(null); 

        cuadro1=new JTextField();
        cuadro2=new JTextField();
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,40,150,20);
        add(cuadro1);
        add(cuadro2);

        escuchaFocos foco1=new escuchaFocos();
        addFocusListener(foco1);
    }
    private class escuchaFocos implements FocusListener {
        public void focusGained(FocusEvent e) { 
   
       }
        public void focusLost(FocusEvent e) {
            String email=cuadro1.getText();
            boolean comprobacion=false;
            
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion){
                System.out.println("Email ingresado correctamente");
            }else{
                System.out.println("Email ingresado Incorrectamente");
            }
       }
   }
    JTextField cuadro1;
    JTextField cuadro2;
}


