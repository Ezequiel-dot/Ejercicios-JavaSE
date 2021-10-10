package excepciones;

import javax.swing.JOptionPane;



public class excepciones2 {
    public static void main(String[] args) {
        String email=JOptionPane.showInputDialog("Introduce email");
    //    try{
        compruevaMail(email);
      //  }catch(ArrayIndexOutOfBoundsException e){
      //      System.out.println("Direccion mail incorrectaaa");
      //  }
    }
    static void compruevaMail(String mail) throws Longitud_mail_erronea{
        int arrobo=0;
        boolean punto=false;

        if(mail.length()<=3){
           // ArrayIndexOutOfBoundsException miError=new ArrayIndexOutOfBoundsException();
            throw new Longitud_mail_erronea("Mail demasiado corto");
        }else{

        for(int i=0;i<mail.length();i++){

            if(mail.charAt(i)=='@')arrobo+=1;
            if(mail.charAt(i)=='.')punto=true;
        }

        if(arrobo==1 && punto==true){
            System.out.println("Mail correcto");
        }else{
            System.out.println("Mail incorrecto");
        }
    }
}
}

class Longitud_mail_erronea extends RuntimeException{
    public Longitud_mail_erronea(){}


    public Longitud_mail_erronea(String msj){
        super(msj);
    }
}


