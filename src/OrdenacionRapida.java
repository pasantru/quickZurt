////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO:
// GRUPO:
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapida extends Ordenacion {

	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
	    ordRapidaRec(v, 0, v.length-1);
	}

	// Debe ordenar ascendentemente los primeros @n elementos del vector @v con
	// una implementaci�n recursiva del m�todo de ordenaci�n r�pida.
	public static <T extends Comparable<? super T>> void ordRapidaRec(T v[], int izq, int der) {
	    if(izq < der){
        int piv = partir(v, v[der], izq, der);
        ordRapidaRec(v, izq, piv-1);
        ordRapidaRec(v, piv+1, der);
      }
	}

   public static <T extends Comparable<? super T>> int partir(T v[], T pivote, int izq, int der) {
     int i = izq-1;
     for(int j = izq; j< der; j++){
       if(v[j].compareTo(pivote) <= 0){
         i++;
         T aux = v[i];
         v[i] = v[j];
         v[j] = aux;
       }
     }
     T aux = v[i+1];
     v[i+1] = v[der];
     v[der] = aux;
     return i+1;
   }

	// Peque�os ejemplos para pruebas iniciales.
	public static void main (String args[]) {

		// Un vector de enteros
		Integer vEnt[] = {3,8,6,5,2,9,1,1,4};
		ordenar(vEnt);
		System.out.println(vectorAString(vEnt));

		// Un vector de caracteres
		Character vCar[] = {'d','c','v','b'};
		ordenar(vCar);
		System.out.println(vectorAString(vCar));

	}

}
