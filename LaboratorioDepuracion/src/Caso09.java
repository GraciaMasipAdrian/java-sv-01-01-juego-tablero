public class Caso09 {
    public static void main(String[] args) {
        int[][] grupos = new int[4][];
        grupos[0] = new int[]{3, 5};
        grupos[1] = new int[]{2, 8, 1};
        grupos[2] = new int[0];
        grupos[3] = new int[]{4, 6};
        int total = 0, elementos = 0;
        for (int fila = 0; fila < grupos.length; fila++) {
            int subtotal = 0;
            for (int columna = 0;
                 columna < grupos[fila].length; columna++) {
                subtotal += grupos[fila][columna];
                elementos++;
            }
            total += subtotal;
        }
        System.out.println("Total: " + total);
        System.out.println("Elementos: " + elementos);
    }
}












