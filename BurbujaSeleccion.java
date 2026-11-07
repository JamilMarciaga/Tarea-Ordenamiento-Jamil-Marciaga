public class BurbujaSeleccion {

    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void seleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] datos1 = {64, 25, 12, 22, 11};
        burbuja(datos1);
        System.out.print("Java - Burbuja: ");
        for (int num : datos1) System.out.print(num + " ");
        System.out.println();

        int[] datos2 = {64, 25, 12, 22, 11};
        seleccion(datos2);
        System.out.print("Java - Selección: ");
        for (int num : datos2) System.out.print(num + " ");
        System.out.println();
    }
}