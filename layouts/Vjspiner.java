package layouts;

import javax.swing.*;
import java.awt.*;



public class Vjspiner {
    public static void main(String[] args) {
        spinerBoton lam=new spinerBoton();
        lam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lam.setVisible(true);
    }
}

class spinerBoton extends JFrame{
    public spinerBoton(){
        setBounds(200,200,500,300);
        
        setTitle("Cuadro de texto");      
        add(new laminalamina());  
    }
}

class laminalamina extends JPanel{
    public laminalamina(){

       // String lista12[]={"enere","febrero","marzo"};
     //  String lista12[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

       JSpinner listademeses=new JSpinner(new SpinnerNumberModel(5,0,50,5){
        
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    });

        Dimension d=new Dimension(200,20);

        listademeses.setPreferredSize(d);

        add(listademeses);
    }
/*
    private class mispinner extends SpinnerNumberModel{
        public mispinner(){
            super(5,0,50,5);
        }
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
}