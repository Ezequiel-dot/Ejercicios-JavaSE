package threads;

public class SincronizandoHilos {
    public static void main(String[] args) {
    
    hilo hilo1=new hilo();
    hiloVarios2 hilo2=new hiloVarios2(hilo1);
    hiloVarios2 hilo3=new hiloVarios2(hilo2);
    hiloVarios2 hilo4=new hiloVarios2(hilo3);
    hiloVarios2 hilo5=new hiloVarios2(hilo4);
    hiloVarios2 hilo6=new hiloVarios2(hilo5);
 
 
    hilo2.start();
    hilo1.start(); 
    hilo4.start();  
    hilo3.start();
    hilo6.start();
    hilo5.start();

    System.out.println("Se termino el programa");
    }    
}


class hilo extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hilo numero: "+getName());
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


class hiloVarios2 extends Thread{

    public hiloVarios2(Thread hilo){
        this.hilo=hilo;
    }

    public void run(){
        try {
            hilo.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        for(int i=0;i<5;i++){
            System.out.println("Hilo numero: "+getName());
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private Thread hilo;
}
