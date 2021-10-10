package ejercicio;

import javax.swing.*;


public class marco extends JPanel{

    public marco(String titulo,String [] opciones){
        
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        btnG=new ButtonGroup();

        for(int i=0;i<opciones.length;i++){
            JRadioButton btn=new JRadioButton(opciones[i]);
            btn.setActionCommand(opciones[i]);
            add(btn);
            btnG.add(btn);

            btn.setSelected((i==0)==true);//para que el primero boton arranque activado
        }
    }

    public String dameSeleccion(){
       /* ButtonModel botonModel=btnG.getSelection();
        String s=botonModel.getActionCommand();
        return s;*/
        return (btnG.getSelection().getActionCommand());
    }

    private ButtonGroup btnG;
}
