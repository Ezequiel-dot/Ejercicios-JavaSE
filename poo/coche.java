package poo;

public class coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
   // private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

 
    public coche(){//constructor padre


        ruedas=4;
        largo=7000;
        ancho=200;
      //  motor=1600;
        peso_plataforma=500;
        
    }

    public String dime_datos_comunes(){ //GETTER

        return "La plataforma del choche tiene "+ruedas+" ruedas, su largo es de "+largo+" cm, su ancho es de "+ancho+ " cm, y su peso es de "+peso_plataforma+" kilos.";

    }

    public void color_auto(String color_principal){   //SETTER
     //   color="bordo";
     color=color_principal;
    }

    public String dime_color(){//GETTER
        return "El coche es de color " + color+".";
    }

    public void asientos_cuero(String asientos_cuero){//SETTER
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }

    public String dime_asientos(){//GETTER
        if(asientos_cuero==true){
            return "El auto tiene asientos de cuero";
        }else{
            return "el auto no tiene asientos de cuero";
        }
    }

    public void configura_climatizador(String climatizador){//SETTER

        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String dime_climatizador(){//GETTER
        if(climatizador==true){
            return "El auto tiene climatizador";
        }else{
            return "El auto no tiene climatizador";
        }
    }

    public String dime_peso(){//SETTER-getter

        int peso_carroceria=500;

        peso_total=peso_carroceria+peso_plataforma;

        if(asientos_cuero==true){
            peso_total=peso_total+50;
        }

        if(climatizador==true){
            peso_total=peso_total+20;
        }

        return "El peso del auto es de "+peso_total+ " kilos";

    }

    public int precio_final(){//GETTER
        int precio_final=10000;

        if(climatizador==true){
            precio_final=precio_final+1500;
        }
        if(asientos_cuero==true){
            precio_final=precio_final+2000;
        }
        return precio_final;
    }

}
