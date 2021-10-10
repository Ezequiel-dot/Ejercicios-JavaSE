package ejercicio;

import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.*;
import java.awt.*;



import javax.swing.*;
import javax.swing.JPanel;
import java.awt.geom.*;

public class Lamina extends JFrame{
    public Lamina(){
        setBounds(300,200,600,400);
        
        setTitle("Ejercicio practico");

        JPanel mar1=new JPanel();
        mar1.setLayout(new GridLayout(2,3));
        

        String [] arr1={"Mensaje","Confirmar","Opcion","Entrada"};
        marco_tipo=new marco("Tipo",arr1);
        mar1.add(marco_tipo);

        String [] arr2={"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"};
        marco_tipoMensaje=new marco("Tipo Mensaje",arr2);
        mar1.add(marco_tipoMensaje);

        String [] arr3={"Cadena","Icono","Componente","Otros","Object[]"};
        laminaMensaje=new marco("Mensaje",arr3);
        mar1.add(laminaMensaje);

        String [] arr4={"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"};
        confirmar=new marco("Confirmar",arr4);
        mar1.add(confirmar);

        String [] arr5={"String[]","Icon[]","Object[]"};
        opcion=new marco("Opcion",arr5);
        mar1.add(opcion);

        String [] arr6={"Campo de Texto","Combo"};
        entrada=new marco("Entrada",arr6);
        mar1.add(entrada);

        setLayout(new BorderLayout());
        add(mar1,BorderLayout.CENTER);

        JPanel laminaBoton=new JPanel();
        JButton btnAceptar=new JButton("Aceptar");
        btnAceptar.addActionListener(new mostrarCuadroEmergetnte());
        laminaBoton.add(btnAceptar);
        add(laminaBoton, BorderLayout.SOUTH);
    }

    //--------------------------------------------------------------------------------------
    
    public Object dameObjeto(){
        String s=laminaMensaje.dameSeleccion();

        if(s=="Cadena")return texto;
        if(s=="Icono")return icono;
        if(s=="Componente")return componenteMsg;
        if(s=="Otros")return hora;
        if(s=="Object[]")return new Object[]{
            texto,icono,hora,componenteMsg
        };
        return null;
    }
    //------------------------------------Devuelve icono y confirmar------------------------
    public int dameIcono(marco lam){
        String s=lam.dameSeleccion();
        if(s=="ERROR_MESSAGE"||s=="YES_NO_OPTION")return 0;
        if(s=="INFORMATION_MESSAGE"||s=="YES_NO_CANCEL_OPTION")return 1;
        if(s=="WARNING_MESSAGE"||s=="OK_CANCEL_OPTION")return 2;
        if(s=="QUESTION_MESSAGE")return 3;
        if(s=="PLAIN_MESSAGE"||s=="DEFAULT_OPTION")return -1;
        return 0;
    }
    //-----------------------------------Dar opciones a la lamina opcion--------------------
    
    public Object[] dameOp(marco lam){
        String s=lam.dameSeleccion();
        if(s=="String[]")return new String[]{"Amarillo","Azul","Rojo"};
        if(s=="Icon[]"){
            return new Object[]{
                new ImageIcon("imagenes/copiar.gif"),
                new ImageIcon("imagenes/cortar.gif"),
                new ImageIcon("imagenes/pegar.gif")
            };
        }
        if(s=="Object[]"){
            return new Object[]{
                texto,
                icono, 
                hora,
                componenteMsg
            };
        }
        return null;
    }
    //--------------------------------------------------------------------------------------
    private class mostrarCuadroEmergetnte implements ActionListener{

        public void actionPerformed(ActionEvent e) {
          //  System.out.println(marco_tipo.dameSeleccion());

            if(marco_tipo.dameSeleccion()=="Mensaje"){
                JOptionPane.showMessageDialog(Lamina.this, dameObjeto(), "Titulo", dameIcono(marco_tipoMensaje));
            }
            if(marco_tipo.dameSeleccion()=="Confirmar"){
                JOptionPane.showConfirmDialog(Lamina.this, dameObjeto(), "Titulo", dameIcono(confirmar), dameIcono(marco_tipoMensaje));
            }
            if(marco_tipo.dameSeleccion()=="Opcion"){
                JOptionPane.showOptionDialog(Lamina.this,dameObjeto(), "Titulo", 1, dameIcono(marco_tipoMensaje), null, dameOp(opcion), null);
            }
            if(marco_tipo.dameSeleccion()=="Entrada"){

                if(entrada.dameSeleccion().equals("Campo de Texto")){

                JOptionPane.showInputDialog(Lamina.this,dameObjeto(), "Titulo", dameIcono(marco_tipoMensaje));
            
            }else{

                JOptionPane.showInputDialog(Lamina.this,dameObjeto(), "Titulo", dameIcono(marco_tipoMensaje), null, new String[]{"Argentina","Uruguay","Brasil"}, "Selecciona Pais");
                
                }
            }
        }

    }
   
    private String texto="Mensaje";
    private Icon icono=new ImageIcon("imagenes/copiar.gif");
    private Date hora=new Date();
    private Component componenteMsg=new LaminaC();
    private marco marco_tipo,marco_tipoMensaje,laminaMensaje,confirmar,opcion,entrada;
}

class LaminaC extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rec=new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.RED);
        g2.fill(rec);
    }
}