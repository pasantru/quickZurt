////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO:
// GRUPO:
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapidaBarajada extends OrdenacionRapida {

	// Implementaci�n de QuickSort con reordenaci�n aleatoria inicial (para comparar tiempos experimentalmente)
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
			T[] aux = v;
			barajar(aux);
			OrdenacionRapida.ordenar(aux);
    }

	// reordena aleatoriamente los datos de un vector
    private static <T> void barajar(T v[]) {
			Random rnd = new Random();
			for (int i = v.length-1;i > 0;i--) {
				int indx = rmd.nextInt(i + 1);
				int aux = v[indx];
				v[indx] = v[i];
				v[i] = aux;
			}
    }


}
