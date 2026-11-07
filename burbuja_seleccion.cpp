#include <iostream>
using namespace std;

void burbuja(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

void seleccion(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int min_idx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx])
                min_idx = j;
        }
        swap(arr[min_idx], arr[i]);
    }
}

void imprimir(int arr[], int n) {
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;
}

int main() {
    int n = 5;
    
    int datos_burbuja[] = {64, 25, 12, 22, 11};
    burbuja(datos_burbuja, n);
    cout << "C++ - Burbuja: ";
    imprimir(datos_burbuja, n);

    int datos_seleccion[] = {64, 25, 12, 22, 11};
    seleccion(datos_seleccion, n);
    cout << "C++ - Selección: ";
    imprimir(datos_seleccion, n);

    return 0;
}