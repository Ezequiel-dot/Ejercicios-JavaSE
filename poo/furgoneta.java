package poo;

public class furgoneta extends coche {
    private int capacidad_carga;
    private int plazas_extra;

    public furgoneta(int capacidad_carga,int plazas_extra){
        
        super(); // LLAMA AL CONSTRUCTOR DE LA ClASE PADRE
        
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    public String dime_datos_furgoneta(){
        return "La capacidad de carga es extra "+capacidad_carga+" y las plazas extra son "+plazas_extra;
    }
}
