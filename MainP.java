
public class MainP {
	public static void main(String []args){
		Menu menu = new Menu();
		Sorting <Integer> sorts = new Sorting<Integer>();
		FileManager fManager = new FileManager(); 
		String[] lista = fManager.readFile();
		Integer[] numeros = new Integer[3000];
        
        boolean activo = true;
        while (activo) {
            System.out.println();
            int opcion = menu.menuPrincipal();
            switch (opcion) {
                case 1: //Cantidad de elementos
                    int cantidad = menu.cantidadNumeros();
                    numeros = new Integer[cantidad];
                    for (int i = 0; i< cantidad; i++) {
                        numeros[i] = Integer.parseInt(lista[i]);
                    }
                    break;
                case 2://GnomeSort
                    sorts.gnomeSort(numeros);
                    break;
                case 3://MergeSort
                    sorts.mergesort(Integer.class, numeros, 0, numeros.length - 1);
                    break;
                case 4://QuickSort
                    sorts.quicksort(numeros, 0, numeros.length - 1);
                    break;
                case 5://RadixSort
                    sorts.radixSort(numeros);
                    break;
                case 6://HeapSort
                    sorts.heapSort(numeros);
                    break;
                case 7://Salir
                    activo = false;
					break;
                default:
                    break;
            }
        }
		
		 /*
		 //  GNOME SORT---------------
		 Sorting<Integer> gnome = new Sorting<Integer>();
		 gnome.GnomeSort(numeros);
		 
		 for (int i = 0; i< 3000;i++) {
			 System.out.println(numeros[i]);
		//  GNOME SORT---------------
		 }*/
		 
		//  for (int i = 0; i< 3000;i++) {
		// 	 System.out.println(numeros[i]);
		// 	 }
		 
		 // MERGE SORT------------
		 /*
		 Sorting<Integer> merge = new Sorting<Integer>();
		 merge.mergesort(Integer.class, numeros, 0, 2999);
		 for (int i = 0; i< 3000;i++) {
			 System.out.println(numeros[i]);
			 }*/
		// MERGE SORT------------
		 
		 
		 /*
		 // QUICK SORT-------------------
//		 Sorting<Integer> quick = new Sorting<Integer>();
//		 quick.quicksort(numeros, 0, numeros.length - 1);
//		 for (int i = 0; i< 3000;i++) {
//			 System.out.println(numeros[i]);
//			 }*/
		 
		 
		 /*
		  * RADIX SORT-----------------------
		  */
		//  RadixSort sorts = new RadixSort();
		//  sorts.radixSort(numeros);
		//  for (int i = 0; i< 3000;i++) {
		// 	 System.out.println(numeros[i]);
		// 	 }
	}
}