import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainP {
	public static void main(String []args){
		ArrayList<String> lista = new ArrayList<>();
		
		
		 try(FileReader fileReader = new FileReader("Numeros.txt")){
		        int caracterLeido = fileReader.read();
		        while(caracterLeido!= -1) {
		            char caracter = (char) caracterLeido;
		            String caracter1 = String.valueOf(caracter);
		            lista.add(caracter1);
		            caracterLeido = fileReader.read();
		        }
		    }catch(IOException ex){
		        System.err.println("Erorr al leer el archivo");
		        ex.printStackTrace();

		    }
		 
		 ArrayList<String>removed = new ArrayList<>();  
		 removed.add(",");
		 
		 lista.removeAll(removed);
		 //System.out.print(lista);
		 
		 Integer[] numeros = new Integer[3000];
		 
		 for (int i = 0; i< 3000;i++) {
			 numeros[i] = Integer.parseInt(lista.get(i));
		 }
		
		 /*
		 //  GNOME SORT---------------
		 Sorting<Integer> gnome = new Sorting<Integer>();
		 gnome.GnomeSort(numeros);
		 
		 for (int i = 0; i< 3000;i++) {
			 System.out.println(numeros[i]);
		//  GNOME SORT---------------
		 }*/
		 
		 for (int i = 0; i< 3000;i++) {
			 System.out.println(numeros[i]);
			 }
		 
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
		 RadixSort sorts = new RadixSort();
		 sorts.radixSort(numeros);
		 for (int i = 0; i< 3000;i++) {
			 System.out.println(numeros[i]);
			 }
		 
		 
		 
		 
		 
		 
	}
}