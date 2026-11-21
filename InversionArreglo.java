public class InversionArreglo {
    public static void main(String[] args) {
        int[] datos = {12,45,78,23,56,89,90};

        System.out.println("Arreglo original:");
        // System.out.println(datos[6]);
        mostrar(datos);
    }
    public static void mostrar(int[] datos){
        for(int n : datos){
            System.out.println(n + "\s");
        }
        System.out.println();
    }
}
