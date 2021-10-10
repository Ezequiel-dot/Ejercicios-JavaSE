package layouts;

import javax.swing.*;


public class W_menu {
    public static void main(String[] args) {
        pantallaMenu lam=new pantallaMenu();
        lam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lam.setVisible(true);
    }
}


class pantallaMenu extends JFrame{
    public pantallaMenu(){
        setBounds(200,200,500,300);
        
        setTitle("Menu");      
        add(new laminaMenu());  
    }
}

class laminaMenu extends JPanel{
    public laminaMenu(){
        
        JMenuBar mimenu=new JMenuBar();
        JMenu menu1=new JMenu("Archivo");
        JMenu menu2=new JMenu("Edición");
        JMenu menu3=new JMenu("Herramientas");
        JMenu opciones=new JMenu("Opciones");

        JMenuItem guardar=new JMenuItem("Guardar");
        JMenuItem guardarComo=new JMenuItem("Guardar Como");
        JMenuItem copiar=new JMenuItem("Copiar",new ImageIcon("imagenes/copiar.gif"));
        copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        JMenuItem cortar=new JMenuItem("Cortar",new ImageIcon("imagenes/cortar.gif"));
        JMenuItem pegar=new JMenuItem("Pegar",new ImageIcon("imagenes/pegar.gif"));
        JMenuItem generales=new JMenuItem("Generales");
        JMenuItem opcion1=new JMenuItem("Opcion1");
        JMenuItem opcion2=new JMenuItem("Opcion2");

        menu1.add(guardar);
        menu1.add(guardarComo);
        menu2.add(copiar);
        menu2.add(cortar);
        menu2.add(pegar);
        menu2.addSeparator();
        menu3.add(generales);
        opciones.add(opcion1);
        opciones.add(opcion2);

        mimenu.add(menu1);
        mimenu.add(menu2);
        mimenu.add(menu3);
        menu2.add(opciones);

        add(mimenu);

    }

  /*  public void crearBoton(String nombre){
        JMenuBar mimenu=new JMenuBar();
        JMenu menu1=new JMenu(nombre);
        mimenu.add(menu1);
        add(mimenu);
    }*/
}