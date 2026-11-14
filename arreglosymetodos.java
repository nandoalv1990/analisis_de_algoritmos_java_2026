import java.util.Scanner;

public class arreglosymetodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Programa 2: Manejo de arrays ===");
        System.out.print("Cuantos numeros deseas ingresar en el arreglo?>");
        int tam = teclado.nextInt();

        // int nombreVariable = new int[numero de espacios que queremos];
        int[] numeros = new int[tam];

        numeros[0] = 2;
        numeros[1] = 3;
        numeros[2] = 5;

        //int j = 2;
        //int n = 1;
        //int w = 0;

        //System.out.println("Valor en la posicion 0: "+numeros[w]);
        //System.out.println("Valor en la posicion 1: "+numeros[n]);
        //System.out.println("Valor en la posicion 2: "+numeros[j]);

        System.out.println("Ingresa los numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento["+i+"]:");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Imprime los valores del arreglo");
        for(int x = 0; x < numeros.length; x++){
            System.out.println("Elementos en la posicion ["+x+"] ->\t"+numeros[x]);
        }

        int maximo = obtenerMaximo(numeros);
        System.out.println("El valor maximo es "+maximo);
    }

    public static int obtenerMaximo(int[] arr){
            int max = arr[0];
            // Sintaxis de un For-Each
            for (int num : arr){
                if (num > max){
                    max = num;
                }
            }
            return max;
        }
}
