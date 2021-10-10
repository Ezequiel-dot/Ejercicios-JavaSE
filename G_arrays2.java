public class G_arrays2 {
    public static void main(String[] args) throws Exception {

        int [][] matriz=new int[4][5];
        matriz[0][0]=45;
        matriz[0][1]=54;
        matriz[0][2]=234;
        matriz[0][3]=356;
        matriz[0][4]=43;

        matriz[1][0]=64;
        matriz[1][1]=6322;
        matriz[1][2]=76;
        matriz[1][3]=8;
        matriz[1][4]=6;

        matriz[2][0]=00;
        matriz[2][1]=-11;
        matriz[2][2]=2652;
        matriz[2][3]=334;
        matriz[2][4]=4544;

        matriz[3][0]=55;
        matriz[3][1]=6456;
        matriz[3][2]=774;
        matriz[3][3]=883;
        matriz[3][4]=9;

        for(int i =0; i<4 ;i++){
            
            System.out.println();
            for(int j =0; j<5 ;j++){
            System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println();




        
        int[][] matriz2={
            {32,53,65,32,7},
            {2,54,73,2,5},
            {6,65,2,8,43},
            {7,86,2,11,43}
        };

        for (int[] el : matriz2) {

            System.out.println();

            for (int z: el) {
                System.out.print(z+" ");
            }

        }




        double [][] arr=new double [6][5];

        double acumulado;
        double interes = 0.10;

        for(int i =0;i<6;i++){

        

            arr[i][0]=10000;
            acumulado=10000;

            for(int j=1;j<5;j++){
                acumulado=acumulado+(acumulado*interes);
                arr[i][j]=acumulado;
               
            }

            interes=interes+0.01;

        }

        for(int z=0;z<6;z++){

            System.out.println();
            for(int j=0;j<5;j++){

                System.out.printf("%1.2f",arr[z][j]);
                System.out.print(" ");
            }

        }


    }
}
