def burbuja(lista):
    n = len(lista)
    for i in range(n):
        for j in range(0, n - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
    return lista

def seleccion(lista):
    n = len(lista)
    for i in range(n):
        minimo_idx = i
        for j in range(i + 1, n):
            if lista[j] < lista[minimo_idx]:
                minimo_idx = j
        lista[i], lista[minimo_idx] = lista[minimo_idx], lista[i]
    return lista

# Prueba
datos = [64, 25, 12, 22, 11]
print("Python - Burbuja:", burbuja(datos.copy()))
print("Python - Selección:", seleccion(datos.copy()))