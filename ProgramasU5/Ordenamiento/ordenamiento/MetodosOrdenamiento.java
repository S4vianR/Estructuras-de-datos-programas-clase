package ordenamiento;

public class MetodosOrdenamiento {
  // MetodosOrdenamiento

  public static void bubbleSort(int arr[]) {
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

  public static void quickSort(int a[], int izq, int der) {
    int pivote = a[izq];
    int i = izq;
    int j = der;
    int aux;
    while (i < j) {
      while (a[i] <= pivote && i < j) {
        i++;
      }
      while (a[j] > pivote) {
        j--;
      }
      if (i < j) {
        aux = a[i];
        a[i] = a[j];
        a[j] = aux;
      }
    }
    a[izq] = a[j];
    a[j] = pivote;
    if (izq < j - 1) {
      quickSort(a, izq, j - 1);
    }
    if (j + 1 < der)
      quickSort(a, j + 1, der);
  }

  public static void radix(int arreglo[]) {
    int aux[][] = new int[10][arreglo.length];
    int aux2[] = new int[10];
    int max = 0;

    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] > max) {
        max = arreglo[i];
      }
    }

    int maxLenght = (max + "").length();

    for (int m = 0, n = 1; m < maxLenght; m++, n *= 10) {
      for (int i = 0; i < arreglo.length; i++) {
        int digit = (arreglo[i] / n) % 10;

        aux[digit][aux2[digit]] = arreglo[i];
        aux2[digit]++;
      }

      int index = 0;

      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < aux2[j]; k++) {
          arreglo[index] = aux[j][k];
          index++;
        }

        aux2[j] = 0;
      }
    }
  }

  public static void shellSort(int[] arreglo) {
    int salto, i, j, k, aux;
    salto = arreglo.length / 2;
    while (salto > 0) {
      for (i = salto; i < arreglo.length; i++) {
        j = i - salto;
        while (j >= 0) {
          k = j + salto;
          if (arreglo[j] <= arreglo[k]) {
            j = -1;
          } else {
            aux = arreglo[j];
            arreglo[j] = arreglo[k];
            arreglo[k] = aux;
            j = j - salto;
          }
        }
      }
      salto = salto / 2;
    }
  }

  // Metodo de ordenamiento por mezcla directa
  public static void mezclaDirecta(int[] a) {
    int n = a.length;
    // Variables
    int i, j, k;
    // Condicion para ordenar el arreglo
    if (n > 1) {
      int n1 = n / 2;
      int n2 = n - n1;
      int[] b = new int[n1];
      int[] c = new int[n2];
      for (i = 0; i < n1; i++) {
        b[i] = a[i];
      }
      for (i = 0; i < n2; i++) {
        c[i] = a[i + n1];
      }
      // Recursividad del metodo
      mezclaDirecta(b);
      mezclaDirecta(c);
      // Mezcla de los subarreglos b y c en a
      i = 0;
      j = 0;
      k = 0;
      // Mientras que el tamaño de b y c sea diferente de j y k respectivamente se
      // ejecutara el ciclo while
      while (b.length != j && c.length != k) {
        // Condicion para ordenar el arreglo
        if (b[j] < c[k]) {
          // Se ordena el arreglo a con los valores de b y c
          a[i] = b[j];
          i++;
          j++;
        } else {
          // Se ordena el arreglo a con los valores de b y c
          a[i] = c[k];
          i++;
          k++;
        }
      }
      // Mientras que el tamaño de b sea diferente de j se ejecutara el ciclo while
      while (b.length != j) {
        // Se ordena el arreglo a con los valores de b y c
        a[i] = b[j];
        i++;
        j++;
      }
      // Mientras que el tamaño de c sea diferente de k se ejecutara el ciclo while
      while (c.length != k) {
        // Se ordena el arreglo a con los valores de b y c
        a[i] = c[k];
        i++;
        k++;
      }
    }
  }
}
