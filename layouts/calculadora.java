package layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculadora {
    public static void main(String[] args) {
        marcoCalculadora calc =new marcoCalculadora();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}

//VENTANA


class marcoCalculadora extends JFrame {
    public marcoCalculadora(){
        setTitle("CALCULADORA");
        setBounds(500,200,450,300);
        
        add(new Norte());
    
        pack();
    }
}


class Norte extends JPanel {
        public Norte(){

            principio=true;
            
            setLayout(new BorderLayout());
            //DISPLAY
            pantalla=new JButton("Soy una calculadora");
            pantalla.setEnabled(false);
            add(pantalla,BorderLayout.NORTH);
            //TECLADO
            centro=new JPanel();
            centro.setLayout(new GridLayout(5,4));
            
            ActionListener esc=new insertarNumero();
            ActionListener ope=new OperacionesMatematicas();
           
            crearBoton("C",ope);
            crearBoton("%",ope);
            crearBoton("P",ope);
            crearBoton("R",ope);

            crearBoton("7",esc);
            crearBoton("8",esc);
            crearBoton("9",esc);
            crearBoton("/",ope);
    
            crearBoton("4",esc);
            crearBoton("5",esc);
            crearBoton("6",esc);
            crearBoton("*",ope);
    
            crearBoton("1",esc);
            crearBoton("2",esc);
            crearBoton("3",esc);
            crearBoton("-",ope);
            
            crearBoton(".",esc);
            crearBoton("0",esc);
            crearBoton("=",ope);
            crearBoton("+",ope);

            add(centro,BorderLayout.CENTER);
            ultimaOperacion="=";
        }
        public void crearBoton(String rotulo, ActionListener escucha){
            JButton boton=new JButton(rotulo);
            boton.addActionListener(escucha);
            centro.add(boton);
        }
       
    

    private class insertarNumero implements ActionListener{
    
        public void actionPerformed(ActionEvent e) {
            String entrada=e.getActionCommand();
    
            if(principio){
                pantalla.setText(""); 
                principio=false;
            }
    
            pantalla.setText(pantalla.getText()+entrada);
        }    
    }
    private class OperacionesMatematicas implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String operacion=e.getActionCommand();
            
            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion=operacion;

            principio=true;
        }
        public void calcular(double x){
            if(ultimaOperacion.equals("+")){
                resultado+=x;
            }else if(ultimaOperacion.equals("-")){
                resultado-=x;
            }
            else if(ultimaOperacion.equals("*")){
                resultado*=x;
            }
            else if(ultimaOperacion.equals("/")){
                resultado/=x;
            }
            else if(ultimaOperacion.equals("=")){
                resultado=x;
            }
            else if(ultimaOperacion.equals("C")){
                resultado=0;
            }
            else if(ultimaOperacion.equals("P")){//NO ANDA
            Math.pow(x,2);
            }
            else if(ultimaOperacion.equals("R")){//NO ANDA
            Math.sqrt(resultado);
            }
            else if(ultimaOperacion.equals("%")){
            resultado%=x;
            }
            pantalla.setText(""+resultado);
        }
    }
    private JButton pantalla;
    private boolean principio;
    private JPanel centro;
    private double resultado=0;
    private String ultimaOperacion;
}







