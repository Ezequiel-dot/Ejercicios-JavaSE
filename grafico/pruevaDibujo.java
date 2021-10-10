package grafico;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

import javax.swing.JPanel;
import java.awt.geom.*;



public class pruevaDibujo {
    public static void main(String[] args) {
        DibujoMarco marco=new DibujoMarco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
       
        /*
        String f=JOptionPane.showInputDialog("Eliga una fuente");
        boolean estaLaFuente=false;
        String fuentes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String e:fuentes){
            if(e.equals(f)){
                estaLaFuente=true;
            }
        }

        if(estaLaFuente){
            System.out.println("fuente instalada");
        }else{
            System.out.println("fuente no instalada");
        }
*/
    }
}

class DibujoMarco extends JFrame{
    public DibujoMarco(){
        setBounds(200,200,500,300);
       
       // setLocation(400,200);
        setTitle("Prueva dibujo");

       // LaminaDibujada lamn=new LaminaDibujada();
        //add(lamn);
        //lamn.setBackground(new Color(122,163,144));

        LaminaConImagen lcm=new LaminaConImagen();
        add(lcm);

      
    }
}

class LaminaDibujada extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    //    g.drawRect(50, 50, 200, 200);
      //  g.drawLine(200, 200, 4, 100);
        //g.drawArc(50, 100, 100, 200, 120, 120);

        //rectangulo
        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);

        //ellipse
        Ellipse2D ellipse=new Ellipse2D.Double();
        ellipse.setFrame(rectangulo);
        g2.setPaint(Color.BLUE.brighter().brighter());
        g2.fill(ellipse);


        //linea
        g2.setPaint(Color.GREEN.darker().darker().darker());
        g2.draw(new Line2D.Double(100,100,300,250));
       



        //circulo
        double ejx=rectangulo.getCenterX();
        double ejy=rectangulo.getCenterY();
        
        double radio=150;

        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(ejx, ejy, ejx+radio, ejy+radio);
        g2.setPaint(Color.GREEN);
        g2.draw(circulo);

        //letra

        Font mifuente=new Font("Arial",Font.BOLD,30);
        g2.setFont(mifuente);
        g2.setColor(Color.ORANGE);
        g2.drawString("Ezequiel Osella", 50, 50);

        g2.setFont(new Font("Courier",Font.ITALIC,25));
        g2.setColor(new Color(99,23,145));
        g2.drawString("hola,como andas",50,70);
    }     
}
class LaminaConImagen extends JPanel{
    public LaminaConImagen(){
        try{
        imagen=ImageIO.read(new File("C:/sers/ezeos/OneDrive/Escritorio/JAVA/aprendiendo/src/grafico/river-plate-logo-png-7.jpg"));
        }catch(IOException e){
        System.out.println("No se encuentra la imagen");
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen == null){
            g.drawString("No se encontro la imagen", 10, 10);
        }else{
            g.drawImage(imagen,0,0, null);
            int ancho=imagen.getWidth(this);
            int alto=imagen.getHeight(this);
            for(int i=0;i<1200;i++){
                for(int j=0;j<1000;j++){
    
                    if(i+j>0){
                        g.copyArea(0, 0, ancho, alto, i*ancho, j*alto);
                    }
                }
            }
        }       
    }
    private Image imagen;
}
