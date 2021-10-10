package threads;



public class cuentasDeBanco {
    public static void main(String[] args) {
        banco b=new banco();

    //    b.transferencia(2, 3, 1000);
        
        for(int i=0;i<100;i++){
            ejecucionTransferencias r=new ejecucionTransferencias(b, i, 2000);
            Thread t=new Thread(r);
            t.start();
        }
       
    }
}


class banco{

    public banco(){
        cuentas=new double[100];

        for(int i=0;i<cuentas.length;i++){
            cuentas[i]=2000;
        }
       // saldoSuficiente=cierreBanco.newCondition();
    }

    public synchronized void transferencia(int cuentaEnvia,int cuentaRecibe,double cantidad) throws InterruptedException{
        
     //   cierreBanco.lock();
     //   try{
        /*if(cuentas[cuentaEnvia]<cantidad){//saldo insuficiente
            System.out.println("--------SALDO INSUFICIENTE:"+cuentaEnvia+"............SALDO:" +cuentas[cuentaEnvia]+"........CANTIDAD:"+cantidad);
            return;
        }else{
            System.out.println("--------TRANSFERENCIA REALIZADA--------"+cuentaRecibe+"........cantidad:"+cantidad);
        }*/

        while(cuentas[cuentaEnvia]<cantidad){
        //    saldoSuficiente.await();
        wait();
        }

        System.out.println(Thread.currentThread());

        cuentas[cuentaEnvia]-=cantidad;   //resta dinero    

        System.out.printf("%10.2f de %d para %d",cantidad,cuentaEnvia,cuentaRecibe);
        
        cuentas[cuentaRecibe]+=cantidad;  //suma dinero
        
        System.out.printf(" Saldo total: %10.2f%n",dameSaldoTodasCuentas());

        notifyAll();
     /*   saldoSuficiente.signalAll();
    }finally{
        cierreBanco.unlock();
    }*/
    }
    public double dameSaldoUnaCuenta(int numCuenta){
        return cuentas[numCuenta];
    }

    public double dameSaldoTodasCuentas(){
        double sumacuentas=0;

        for(double a:cuentas){
            sumacuentas+=a;
        }

        return sumacuentas;
    }

    private double cuentas[];
  //  private Lock cierreBanco=new ReentrantLock();
  //  private Condition saldoSuficiente;
}


class ejecucionTransferencias implements Runnable{
    public ejecucionTransferencias(banco b,int c, int m){
        Banco=b;
        deCuenta=c;
        maximo=m;
    }

    public void run() {
        try {
        while(true){
        int paraCuenta=(int)(Math.random()*100);
        double cantidad=Math.random()*maximo;
        Banco.transferencia(deCuenta, paraCuenta, cantidad);
        Thread.sleep((int)(10*Math.random()));
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private banco Banco;
    private int deCuenta;
    private int maximo;
}
