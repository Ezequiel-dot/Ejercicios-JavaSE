package sockets;

import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.*;

public class Cliente {
	public static void main(String[] args) {
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(100,200,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);

        addWindowListener(new envioOnline());
		}	
}

//-----------------ENVIO SEÑAL ONLINE--------------------------------------

class envioOnline extends WindowAdapter{

    public void	windowOpened(WindowEvent e){
    //    System.out.println("Ventana abierta");
        try {

            Socket misocket=new Socket("192.168.0.11",9999);
            enviaPaquete enviarPac=new enviaPaquete();
            enviarPac.setMensaje(" online");

            ObjectOutputStream salidaDatos=new ObjectOutputStream(misocket.getOutputStream());
            salidaDatos.writeObject(enviarPac);
            misocket.close();

        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    
}

class LaminaMarcoCliente extends JPanel implements Runnable{

	public LaminaMarcoCliente(){

        String nombre_usuario=JOptionPane.showInputDialog("Introduce nombre de la persona");

        JLabel nnick=new JLabel("Nick: ");
        add(nnick);

        nick=new JLabel(nombre_usuario);
        add(nick);

		JLabel texto=new JLabel("Online: ");
		
		add(texto);

        ip=new JComboBox();
       
        add(ip);

        textoAr=new JTextArea(12,20);

        add(textoAr);
	
		campo1=new JTextField(20);
	
		add(campo1);

	
		miboton=new JButton("Enviar");
		enviarTexto mievetno=new enviarTexto();
        miboton.addActionListener(mievetno);

		add(miboton);	

        Thread miHilo=new Thread(this);
        miHilo.start();
		
    }

    private class enviarTexto implements ActionListener{

        public void actionPerformed(ActionEvent e) {

         //   textoAr.append("\n"+ campo1.getText());
            
            try {

				Socket soc=new Socket("192.168.0.11",9999); //192.168.0.11
              
                enviaPaquete ep=new enviaPaquete();

                ep.setIp(ip.getSelectedItem().toString());
                ep.setMensaje(campo1.getText());
                ep.setNombre(nick.getText());

                ObjectOutputStream flujoSalida=new ObjectOutputStream(soc.getOutputStream());
                flujoSalida.writeObject(ep);
                soc.close();

                campo1.setText("");

			} catch (IOException e1) {
				e1.printStackTrace();
            }   
		}
    }
    private JComboBox ip;
    private JLabel nick;
	private JTextField campo1;
	private JButton miboton;
    private JTextArea textoAr;
    
    public void run(){
        try {
            ServerSocket servidorCli=new ServerSocket(9090);
            Socket client;
            enviaPaquete paqueteRec;

            while(true){
                client=servidorCli.accept();

                ObjectInputStream entrada=new ObjectInputStream(client.getInputStream());
                paqueteRec=(enviaPaquete)entrada.readObject();

                if(!paqueteRec.getMensaje().equals(" online")){
                    
                    textoAr.append("\n"+paqueteRec.getNombre()+": "+paqueteRec.getMensaje());              
                }else{
                  //  textoAr.append("\n"+paqueteRec.getIps());
                  
                  ArrayList <String> IpsMenu=new  ArrayList <String>();
                  IpsMenu=paqueteRec.getIps();//escribe ip

                  ip.removeAllItems();//borra todas las ip
                  for (String z : IpsMenu) {
                      ip.addItem(z);//agrega todas las ip
                  }
                }
               
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
}

class enviaPaquete implements Serializable{

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getIp(){
        return ip;
    }

    public void setIp(String ip){
        this.ip=ip;
    }

    public void setIps(ArrayList <String> Ips){
        ips=Ips;
    }

    public ArrayList<String> getIps(){
        return ips;
    }

    private ArrayList <String> ips;
    private String ip,mensaje,nombre;
}

