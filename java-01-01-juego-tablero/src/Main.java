import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int filaYoda = 0;
        int columnaYoda = 0;
        char YODA='Y';
        // 1º) Yago
        char[][] matriz = new char[10][10];


        // 2º) Sergio
        int vidas = 9;
        // 3) Dani
        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = '*';
            }
        }
        matriz[filaYoda][columnaYoda] = YODA;
        // 4º) Carlos y Héctor
        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz.length ; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        //Alejandro


        char CASILLA_FINAL= 'F';
        matriz[9][9]= CASILLA_FINAL;


        //Marcos y Luis


        Random aleatorios = new Random();


        int filaRandom = aleatorios.nextInt(10);
        int columnaRandom = aleatorios.nextInt(10);


        matriz[filaRandom][columnaRandom] = 'M';


        //Alex


        int filaAleatoria2 ;
        int columnaAleatoria2 ;
       /*
       do {
           filaAleatoria2 = aleatorios.nextInt(10);
           columnaAleatoria2 = aleatorios.nextInt(10);
       } while (matriz[filaAleatoria2][columnaAleatoria2] !='*');
       matriz[filaAleatoria2][columnaAleatoria2] = 'P';
       */
        //Boris e Ikerr Se inserten 5 P


        for (int i = 0; i < 5; i++){
            do {
                filaAleatoria2 = aleatorios.nextInt(10);
                columnaAleatoria2 = aleatorios.nextInt(10);
            } while (matriz[filaAleatoria2][columnaAleatoria2] !='*');
            matriz[filaAleatoria2][columnaAleatoria2] = 'P';
        }
        System.out.println();
        System.out.println();
        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz.length ; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        // Pablo


        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");


        Scanner sc = new Scanner(System.in);





        //Yoel


        do {

            System.out.print("Dime una letra: ");
            char desplazamiento = sc.next().charAt(0);


            System.out.println("La letra elegida es " + desplazamiento);

            if (desplazamiento == 'D') {
                if (columnaYoda < 9) {
                    matriz[filaYoda][columnaYoda] = '*';
                    columnaYoda = columnaYoda + 1;
                    matriz[filaYoda][columnaYoda] = YODA;
                }
                if (matriz[filaYoda][columnaYoda] == 'M') {
                    vidas = vidas - 1;
                }
                System.out.println("Te has encontrado con un muro, una vida menos, ahora te quedan " + vidas + " vidas.");
                if (matriz[filaYoda][columnaYoda] == 'P') {
                    vidas = vidas + 1;
                }
                System.out.println("Te has encontrado con una poción, una vida más, ahora te quedan " + vidas + " vidas.");
            } else {
                System.out.println("No puedes moverte fuera del mapa");


                if (desplazamiento == 'A') {
                    if (columnaYoda > 0) {
                        matriz[filaYoda][columnaYoda] = '*';
                        columnaYoda = columnaYoda + 1;
                        matriz[filaYoda][columnaYoda] = YODA;
                    }
                    if (matriz[filaYoda][columnaYoda] == 'M') {
                        vidas = vidas - 1;
                    }
                    System.out.println("Te has encontrado con un muro, una vida menos, ahora te quedan " + vidas + " vidas.");
                    if (matriz[filaYoda][columnaYoda] == 'P') {
                        vidas = vidas + 1;
                    }
                    System.out.println("Te has encontrado con una poción, una vida más, ahora te quedan " + vidas + " vidas.");
                } else {
                    System.out.println("No puedes moverte fuera del mapa");


                    if (desplazamiento == 'W') {
                        if (filaYoda > 0) {
                            matriz[filaYoda][columnaYoda] = '*';
                            filaYoda = filaYoda - 1;
                            matriz[filaYoda][columnaYoda] = YODA;
                        }
                        if (matriz[filaYoda][columnaYoda] == 'M') {
                            vidas = vidas - 1;
                        }
                        System.out.println("Te has encontrado con un muro, una vida menos, ahora te quedan " + vidas + " vidas.");
                        if (matriz[filaYoda][columnaYoda] == 'P') {
                            vidas = vidas + 1;
                        }
                        System.out.println("Te has encontrado con una poción, una vida más, ahora te quedan " + vidas + " vidas.");
                    } else {
                        System.out.println("No puedes moverte fuera del mapa");


                        if (desplazamiento == 'S') {
                            if (filaYoda < 9) {
                                matriz[filaYoda][columnaYoda] = '*';
                                filaYoda = filaYoda + 1;
                                matriz[filaYoda][columnaYoda] = YODA;
                                if (matriz[filaYoda][columnaYoda] == 'M') {
                                    vidas = vidas - 1;
                                }
                                System.out.println("Te has encontrado con un muro, una vida menos, ahora te quedan " + vidas + " vidas.");
                                if (matriz[filaYoda][columnaYoda] == 'P') {
                                    vidas = vidas + 1;
                                }
                                System.out.println("Te has encontrado con una poción, una vida más, ahora te quedan " + vidas + " vidas.");
                            }
                        } else {
                            System.out.println("No puedes moverte fuera del mapa");


                        }
                        for (int fila = 0; fila < matriz.length; fila++) {
                            for (int columna = 0; columna < matriz.length; columna++) {
                                System.out.print(matriz[fila][columna] + " ");
                            }
                            System.out.println("");
                        }
                    }
                    while (vidas >= 0) ;


                }
            }
        }