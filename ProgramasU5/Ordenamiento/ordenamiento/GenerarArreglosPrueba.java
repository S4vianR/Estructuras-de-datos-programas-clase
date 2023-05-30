package ordenamiento;

// Librerias
// Random: Para generar números aleatorios
import java.util.Random;
// JOptionPane: Para mostrar mensajes en pantalla
import javax.swing.JOptionPane;

public class GenerarArreglosPrueba {
	public static int[] mejorDeLosCasos(int inicial, int cantidad, int incremento) {
		int arreglo[] = new int[cantidad];
		int dato = inicial;
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = dato;
			dato += incremento;
		}

		return arreglo;
	}

	public static int[] peorDeLosCasos(int inicial, int cantidad, int incremento) {
		int mayor = (cantidad * incremento) + inicial - incremento;
		int arreglo[] = new int[cantidad];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = mayor;
			mayor -= incremento;
		}
		return arreglo;
	}

	public static int[] uniforme(int primero, int ultimo, int cantidad) {
		Random r = new Random();
		int datos[] = new int[cantidad];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = r.nextInt(ultimo - primero + 1) + primero;
		}
		return datos;
	}

	public static int[] dist8020(int primero, int ultimo, int cantidad) {
		Random r = new Random();
		int datos[] = new int[cantidad];
		int medio = (ultimo - primero + 1) / 2;
		for (int i = 0; i < datos.length; i++) {
			double p = r.nextDouble();
			if (p <= 0.8) {
				datos[i] = r.nextInt(medio) + primero;
			} else {
				datos[i] = r.nextInt(ultimo - medio) + primero + medio;
			}
		}
		return datos;
	}

	public static int[] dist2080(int primero, int ultimo, int cantidad) {
		Random r = new Random();
		int datos[] = new int[cantidad];
		int medio = (ultimo - primero + 1) / 2;
		for (int i = 0; i < datos.length; i++) {
			double p = r.nextDouble();
			if (p <= 0.2) {
				datos[i] = r.nextInt(medio) + primero;
			} else {
				datos[i] = r.nextInt(ultimo - medio) + primero + medio;
			}
		}
		return datos;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("a[" + i + "]= " + arr[i]);
		}
	}

	public static void main(String[] args) {
		long startTimeBubbleSort;
		long startTimeQuickSort;
		long startTimeRadix;
		long startTimeShellSort;
		long startTimeMezclaDirecta;
		long endTimeBubbleSort;
		long endTimeQuickSort;
		long endTimeRadix;
		long endTimeShellSort;
		long endTimeMezclaDirecta;

		/*
		 * En una clase independiente con método main pruebe los diferentes métodos
		 * midiendo el tiempo de
		 * ejecución que toma cada uno de ellos. Es importante utilizar el mismo arreglo
		 * en cada uno de ellos así
		 * como la misma PC para que la comparación sea válida. El arreglo a utilizar
		 * deberá tener números
		 * aleatorios uniformemente distribuidos, para ello se le proporciona la clase
		 * GenerarArreglosPrueba.java. Generar arreglos con los siguientes valores de n
		 * (cantidad de datos)
		 * • 100
		 * • 1000
		 * • 5000
		 * • 10000
		 * • 50000
		 * • 100000
		 * • 500000
		 * • 1000000 (no usar para algoritmos O(n2): burbuja e inserción)
		 * • 10000000 (no usar para algoritmos O(n2): burbuja e inserción)
		 * • 50000000 (no usar para algoritmos O(n2): burbuja e inserción)
		 *
		 * Metodos en la clase MetodosOdenamiento.java:
		 * - bubbleSort
		 * - quickSort
		 * - radix
		 * - shellSort
		 * - mezclaDirecta
		 */

		// Se crea un objeto de la clase GenerarArreglosPrueba
		GenerarArreglosPrueba generarArreglosPrueba = new GenerarArreglosPrueba();
		// Se crea un objeto de la clase Ordenamiento
		MetodosOrdenamiento ordenamiento = new MetodosOrdenamiento();

		// Uniformemente distribuidos
		// Se crea un arreglo de 100 elementos
		int[] arreglo100Uniforme = generarArreglosPrueba.uniforme(1, 100, 7);

		// Se crea un arreglo de 1000 elementos
		int[] arreglo1000Uniforme = generarArreglosPrueba.uniforme(1, 1000, 7);

		// Se crea un arreglo de 5000 elementos
		int[] arreglo5000Uniforme = generarArreglosPrueba.uniforme(1, 5000, 7);

		// Se crea un arreglo de 10000 elementos
		int[] arreglo10000Uniforme = generarArreglosPrueba.uniforme(1, 10000, 7);

		// Se crea un arreglo de 50000 elementos
		int[] arreglo50000Uniforme = generarArreglosPrueba.uniforme(1, 50000, 7);

		// Se crea un arreglo de 100000 elementos
		int[] arreglo100000Uniforme = generarArreglosPrueba.uniforme(1, 100000, 7);

		// Se crea un arreglo de 500000 elementos
		int[] arreglo500000Uniforme = generarArreglosPrueba.uniforme(1, 500000, 7);

		// Se crea un arreglo de 1000000 elementos
		int[] arreglo1000000Uniforme = generarArreglosPrueba.uniforme(1, 1000000, 7);

		// Se crea un arreglo de 10000000 elementos
		int[] arreglo10000000Uniforme = generarArreglosPrueba.uniforme(1, 10000000, 7);

		// Se crea un arreglo de 50000000 elementos
		int[] arreglo50000000Uniforme = generarArreglosPrueba.uniforme(1, 50000000, 7);

		int opcion = 0;
		do {
			String menu = "1. Metodos 100 elementos\n2. Metodos 1,000 elementos\n3. Metodos 5,000 elementos\n4. Metodos 10,000 elementos\n5. Metodos 50,000 elementos\n6. Metodos 1000,000 elementos\n7. Metodos 500,000 elementos\n8. Metodos 1,000,000 elementos\n9. Metodos 10,000,000 elementos\n10. Metodos 50,000,000 elementos\n11. Salir";
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
				case 1:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo100Uniforme);

					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo100Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100 elementos usando bubbleSort: "
									+ endTimeBubbleSort + " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo100Uniforme, 0, arreglo100Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo100Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100 elementos usando radix: " + endTimeRadix
									+ " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo100Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo100Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 2:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo1000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000 elementos usando bubbleSort: "
									+ endTimeBubbleSort + " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo1000Uniforme, 0, arreglo1000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo1000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo1000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo1000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 3:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo5000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 5000 elementos usando bubbleSort: "
									+ endTimeBubbleSort + " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo5000Uniforme, 0, arreglo5000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 5000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo5000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 5000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo5000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 5000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo5000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 5000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 4:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo10000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000 elementos usando bubbleSort: "
									+ endTimeBubbleSort + " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo10000Uniforme, 0, arreglo10000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo10000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo10000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo10000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 5:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo50000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000 elementos usando bubbleSort: "
									+ endTimeBubbleSort + " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo50000Uniforme, 0, arreglo50000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo50000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo50000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo50000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 6:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo100000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100000 elementos usando bubbleSort: "
									+ endTimeBubbleSort
									+ " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo100000Uniforme, 0, arreglo100000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo100000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo100000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo100000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 100000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 7:
					startTimeBubbleSort = System.nanoTime();
					ordenamiento.bubbleSort(arreglo500000Uniforme);
					endTimeBubbleSort = System.nanoTime() - startTimeBubbleSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 500000 elementos usando bubbleSort: "
									+ endTimeBubbleSort
									+ " nanosegundos");
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo500000Uniforme, 0, arreglo500000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 500000 elementos usando quickSort: "
									+ endTimeQuickSort + " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo500000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 500000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo500000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 500000 elementos usando shellSort: "
									+ endTimeShellSort + " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo500000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 500000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 8:
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo1000000Uniforme, 0, arreglo1000000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000000 elementos usando quickSort: "
									+ endTimeQuickSort
									+ " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo1000000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo1000000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000000 elementos usando shellSort: "
									+ endTimeShellSort
									+ " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo1000000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 1000000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta
									+ " nanosegundos");
					break;
				case 9:
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo10000000Uniforme, 0, arreglo10000000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000000 elementos usando quickSort: "
									+ endTimeQuickSort
									+ " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo10000000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo10000000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000000 elementos usando shellSort: "
									+ endTimeShellSort
									+ " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo10000000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 10000000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta + " nanosegundos");
					break;
				case 10:
					startTimeQuickSort = System.nanoTime();
					ordenamiento.quickSort(arreglo50000000Uniforme, 0, arreglo50000000Uniforme.length - 1);
					endTimeQuickSort = System.nanoTime() - startTimeQuickSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000000 elementos usando quickSort: "
									+ endTimeQuickSort
									+ " nanosegundos");
					startTimeRadix = System.nanoTime();
					ordenamiento.radix(arreglo50000000Uniforme);
					endTimeRadix = System.nanoTime() - startTimeRadix;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000000 elementos usando radix: "
									+ endTimeRadix + " nanosegundos");
					startTimeShellSort = System.nanoTime();
					ordenamiento.shellSort(arreglo50000000Uniforme);
					endTimeShellSort = System.nanoTime() - startTimeShellSort;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000000 elementos usando shellSort: "
									+ endTimeShellSort
									+ " nanosegundos");
					startTimeMezclaDirecta = System.nanoTime();
					ordenamiento.mezclaDirecta(arreglo50000000Uniforme);
					endTimeMezclaDirecta = System.nanoTime() - startTimeMezclaDirecta;
					JOptionPane.showMessageDialog(null,
							"Tiempo de ejecucion para el arreglo de 50000000 elementos usando mezclaDirecta: "
									+ endTimeMezclaDirecta + " nanosegundos");
					break;
				case 11:
					JOptionPane.showMessageDialog(null, "Hasta luego", "Adios", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
					break;
			}
		} while (opcion != 11);
	}
}
