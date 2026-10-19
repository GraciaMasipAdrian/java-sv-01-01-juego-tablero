import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 1º) Yago
        char [][] matriz = new char [10][10];

        //2º) Sergio
        int vidas = 10;

        //3º) Dani y David

        for(int i =0;i<matriz.length; i++){
            for(int j =0;j<matriz.length; j++) {
                matriz[i][j] ='*';

            }
        }

        //4º) Carlos y Hector
        for(int i =0;i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //5º) Alejandro
        char YODA = 'Y';
        matriz[0][0] = YODA;

        matriz[9][9] = 'F';

        //6º) Marcos y Luis
        Random aleatorios = new Random();
        int fila_aleatoria = aleatorios.nextInt(10);
        int colum_aleatoria = aleatorios.nextInt(10);

        matriz[fila_aleatoria][colum_aleatoria] = 'M';

        //7º) Alex y Gabriel


        int fila_random = aleatorios.nextInt(10);
        int colum_random = aleatorios.nextInt(10);

        do{
            fila_random = aleatorios.nextInt(10 );
            colum_random = aleatorios.nextInt(10);
        }while (matriz[fila_random][colum_random] != '*');
        matriz[fila_aleatoria][colum_random] = 'P';

        //8º Boris
        for(int i = 0 ;i < 5;i++){
            do{
                fila_random = aleatorios.nextInt(10 );
                colum_random = aleatorios.nextInt(10);
            } while (matriz[fila_random][colum_random] !='*');
            matriz[fila_random][colum_random] = 'P';

        }

        //9º) Pablo
        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("Te puedes mover con las letras W A S D");

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una letra");
        char desplazamiento = sc.next().charAt(0);
        System.out.println("La letra elegida es" + desplazamiento);

        //yoel
        int filayoda = 0;
        int columnayoda = 0;
        matriz[filayoda][columnayoda] = YODA;
        if(desplazamiento == 'D'){
            columnayoda = columnayoda +1;
            matriz[filayoda] = YODA;

        }
        System.out.println();








    }
}
