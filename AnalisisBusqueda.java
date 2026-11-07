public class AnalisisBusqueda {

    // Método 1
    public static int misterioA(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // Método 2 (requiere arreglo ordenado)
    public static int misterioB(int[] arr, int x) {
        int izq = 0, der = arr.length - 1;
        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            if (arr[medio] == x) return medio;
            if (arr[medio] < x) izq = medio + 1;
            else der = medio - 1;
        }
        return -1;
    }
}