package sockets;


import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(800,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);

        Thread miHilo=new Thread(this);
        miHilo.start();
		
		}
        public void run() {
           
            try {
                ServerSocket miserver=new ServerSocket(9999);

                String ip,nick,mensaje_text;
                enviaPaquete paquete_recibido;
                ArrayList <String> listaIp=new  ArrayList <String> ();

                while(true){
                
                Socket miSoc=miserver.accept();

                ObjectInputStream paqueteDeDatos=new ObjectInputStream(miSoc.getInputStream());
                
                paquete_recibido =(enviaPaquete)paqueteDeDatos.readObject();

               
                nick=paquete_recibido.getNombre();
                ip=paquete_recibido.getIp();
                mensaje_text=paquete_recibido.getMensaje();

                if(!mensaje_text.equals(" online")){

                areatexto.append("\n"+nick+":"+mensaje_text+" para: "+ip);
                
                Socket enviaText=new Socket(ip,9090);
                ObjectOutputStream pacReenvio=new ObjectOutputStream(enviaText.getOutputStream());
                pacReenvio.writeObject(paquete_recibido);

                pacReenvio.close();
                enviaText.close();
                miSoc.close();
                }else{
//---------------------------------------DETECTA ONLINE--------------------------------------

                InetAddress localizacion=miSoc.getInetAddress();//almaceno ip
                String ipRemota=localizacion.getHostAddress();//la paso a string
           //     System.out.println(ipRemota);

                listaIp.add(ipRemota);
                paquete_recibido.setIps(listaIp);//paso las ips a las clases del cliente

                for (String s : listaIp) {

                    Socket enviaText=new Socket(s,9090);
                    ObjectOutputStream pacReenvio=new ObjectOutputStream(enviaText.getOutputStream());
                    pacReenvio.writeObject(paquete_recibido);
    
                    pacReenvio.close();
                    enviaText.close();
                    miSoc.close();
                    }
//-------------------------------------------------------------------------------------------
                }
            }

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
        }
    }
	private	JTextArea areatexto;
}
