import java.util.Scanner;
public class sintaxisbasica1 {
    public static void main(String[] args){
        // Basico in-out
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola"); //output
        System.out.println("=== PROGRAMA 1: Sintaxis basica y ciclos ===");
        System.out.print("Escribe un numero entero:");
        int numero;
        numero = teclado.nextInt();
        System.out.print("Escribe tu nombre:");
        String nombre = teclado.next();
        // Ciclos
        if(numero < 0){ // Si entonces condicional
            System.out.println("El numero debe ser mayor o igual a cero");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i = i + 1){ // Para si condicional
                factorial *= i; // factorial = factorial * i
                System.out.println("Valor actual del factorial: "+factorial);
            }
            System.out.println(nombre + " el factorial de " + numero + " es " + factorial);

            boolean esPrimo = esNumeroPrimo(numero);
            if(esPrimo){
                System.out.println("el numero "+numero+" Es primo.");
            }else{
                System.out.println("el numero "+numero+" No es primo.");
            }
        }
        teclado.close();
    }

    // Funcion o metodo
    public static boolean esNumeroPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++){
            System.out.println("Imprime el valor actual: "+ n % i);
            if (n % i == 0) return false;
        }
        return true;

    }
}

















/*Hola guapo, salva a mi bebe...
Me caes gordo*/