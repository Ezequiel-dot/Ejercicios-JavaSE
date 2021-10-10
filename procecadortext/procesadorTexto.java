package procecadortext;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class procesadorTexto {
    public static void main(String[] args) {
        frame fram=new frame();
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
    }
}

class frame extends JFrame{
    public frame(){
        setBounds(400,100,600,500);
        setTitle("Procesador de textos");
        add(new lamina());
    }
}

class lamina extends JPanel{
    public lamina(){
        setLayout(new BorderLayout());
        JPanel lamina1=new JPanel();
        JMenuBar menu=new JMenuBar();
//------------------------------------------------------------------
        menu1=new JMenu("Fuente");
        menu2=new JMenu("Estilo");
        menu3=new JMenu("Tamaño");

        estiloLetra("Arial","Fuente","Arial",9,10);
        estiloLetra("Verdana","Fuente","Verdana",9,10);
        estiloLetra("Courier New","Fuente","Courier New",9,10);

        estiloLetra("Negrita","Estilo","",Font.BOLD,1);
        estiloLetra("Cursiva","Estilo","",Font.ITALIC,1);
     /*   JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita");
        JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva");
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        menu2.add(negrita);
        menu2.add(cursiva);*/

      /*  estiloLetra("12","Tamaño","",9,12);
        estiloLetra("14","Tamaño","",9,14);
        estiloLetra("16","Tamaño","",9,16);
        estiloLetra("18","Tamaño","",9,18);
        estiloLetra("20","Tamaño","",9,20);*/

        ButtonGroup tamañoLetra=new ButtonGroup();
        JRadioButtonMenuItem d12=new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem d14=new JRadioButtonMenuItem("14");
        JRadioButtonMenuItem d16=new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem d18=new JRadioButtonMenuItem("18");
        JRadioButtonMenuItem d20=new JRadioButtonMenuItem("20");
        d20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        tamañoLetra.add(d12);
        tamañoLetra.add(d14);
        tamañoLetra.add(d16);
        tamañoLetra.add(d18);
        tamañoLetra.add(d20);
        d12.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",12));
        d14.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",14));
        d16.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",16));
        d18.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",18));
        d20.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",20));        
        menu3.add(d12);
        menu3.add(d14);
        menu3.add(d16);
        menu3.add(d18);
        menu3.add(d20);
//------------------------------------------------------------------
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        lamina1.add(menu);
        add(lamina1,BorderLayout.NORTH);
//------------------------------------------------------------------
        text=new JTextPane();
        add(text,BorderLayout.CENTER);  

        JPopupMenu emergente=new JPopupMenu();
        JMenuItem op1=new JMenuItem("Negrita");
        JMenuItem op2=new JMenuItem("Cursiva");
        op1.addActionListener(new StyledEditorKit.BoldAction());
        op2.addActionListener(new StyledEditorKit.ItalicAction());
        emergente.add(op1);
        emergente.add(op2);
        text.setComponentPopupMenu(emergente); 
//------------------------------------------------------------------
        barra=new JToolBar();
     /*   JButton btnNegrita=new JButton("N");
        btnNegrita.setFont(new Font("Arial",Font.BOLD,12));
        btnNegrita.addActionListener(new StyledEditorKit.BoldAction());
        barra.add(btnNegrita);

        JButton btnCursiva=new JButton("K");
        btnCursiva.setFont(new Font("Arial",Font.ITALIC,12));
        btnCursiva.addActionListener(new StyledEditorKit.ItalicAction());
        barra.add(btnCursiva);

        JButton subrayar=new JButton("S");
        subrayar.addActionListener(new StyledEditorKit.UnderlineAction());
        subrayar.setFont(new Font("Arial",Font.TRUETYPE_FONT,12));
        barra.add(subrayar);

        JButton rojo=new JButton("  ");
        JButton azul=new JButton("  ");
        JButton amarillo=new JButton("  ");
        rojo.setBackground(Color.RED);
        azul.setBackground(Color.BLUE);
        amarillo.setBackground(Color.YELLOW);
        rojo.addActionListener(new StyledEditorKit.ForegroundAction("Pone rojo",Color.RED));
        azul.addActionListener(new StyledEditorKit.ForegroundAction("Pone azul",Color.BLUE));
        amarillo.addActionListener(new StyledEditorKit.ForegroundAction("Pone amarillo",Color.YELLOW));
        barra.add(rojo);
        barra.add(azul);
        barra.add(amarillo);

        JButton izquierda=new JButton("I ");
        JButton centro=new JButton("C");
        JButton derecha=new JButton("D");
        JButton justificado=new JButton("J");
        izquierda.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
        centro.addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
        derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
        justificado.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
        barra.add(izquierda);
        barra.add(centro);
        barra.add(derecha);
        barra.add(justificado);*/
        
        configuraBarra("N").addActionListener(new StyledEditorKit.BoldAction());
        configuraBarra("K").addActionListener(new StyledEditorKit.ItalicAction());
        configuraBarra("S").addActionListener(new StyledEditorKit.UnderlineAction());
        barra.addSeparator();
        configuraBarra("R").addActionListener(new StyledEditorKit.ForegroundAction("Pone rojo",Color.RED));
        configuraBarra("B").addActionListener(new StyledEditorKit.ForegroundAction("Pone azul",Color.BLUE));
        configuraBarra("Y").addActionListener(new StyledEditorKit.ForegroundAction("Pone amarillo",Color.YELLOW));
        barra.addSeparator();
        configuraBarra("I").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
        configuraBarra("C").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
        configuraBarra("D").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
        configuraBarra("J").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));

        barra.setOrientation(1);
        add(barra,BorderLayout.WEST);
    }
    public void estiloLetra(String rotulo,String menu,String letra,int estilo,int tamaño){
        JMenuItem elem=new JMenuItem(rotulo);

        if(menu=="Fuente"){
            menu1.add(elem);
            if(letra=="Arial"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("nm","Arial"));
            }else if(letra=="Verdana"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("nm","Verdana"));
            }else if(letra=="Courier New"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("nm","Courier New"));

            }
        }
        if(menu=="Estilo"){
            menu2.add(elem);
            if(estilo==Font.BOLD){
            elem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
            elem.addActionListener(new StyledEditorKit.BoldAction());
            }else if(estilo==Font.ITALIC){            
            elem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
            elem.addActionListener(new StyledEditorKit.ItalicAction());
        }
        }
      /*  if(menu=="Tamaño"){
            menu3.add(elem);
            elem.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño",tamaño));
        }*/
    }  
    public JButton configuraBarra(String nombre){
        JButton bot=new JButton(nombre);
        barra.add(bot);
        return bot;
    }
    JToolBar barra;
    JTextPane text;
    JMenu menu1,menu2,menu3;
    Font letras;
    JButton btnNegrita,btnCursiva,subrayar,rojo,azul,amarillo,izquierda,centro,derecha,justificado;
}
