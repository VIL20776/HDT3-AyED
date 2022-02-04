import java.lang.reflect.Array;

public class Sorting<E extends Comparable<E>>  {
	public void GnomeSort (E[] list) {
		int i=1;
		  int j=2;
		 
		  while(i < list.length) {
		    if (list[i-1].compareTo(list [i]) <= 0) 
			{
		      i = j; j++;
		    } else {
		      E tmp = list[i-1];
		      list[i-1] = list[i];
		      list[i--] = tmp;
		      i = (i==0) ? j++ : i;
		    }
	}
		  
		  
	}
	public void merge(Class<E> lis, E[] list, int izq, int m, int der){
		E B[] = (E[]) Array.newInstance(lis, list.length);
		   int i, j, k;
		   //array auxiliar
		   for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
		        B[i]=list[i];

		   i=izq; j=m+1; k=izq;
		     
		   while (i<=m && j<=der) //copia el siguiente elemento más grande                                      
		          if (B[i].compareTo(B[j])<=0)
		              list[k++]=B[i++];
		          else
		              list[k++]=B[j++];
		        
		   while (i<=m)         //copia los elementos que quedan de la
		         list[k++]=B[i++]; //primera mitad (si los hay)
		}
	public void mergesort(Class<E> lis,E[] list,int izq, int der){
	    if (izq < der){
	            int m=(izq+der)/2;
	            mergesort(lis,list,izq, m);
	            mergesort(lis,list,m+1, der);                                                                                
	            merge(lis, list,izq, m, der);                                                                                 
	    }
	}
	
	public  void quicksort(E[] list, int izq, int der) {

		  E pivote=list[izq]; // tomamos primer elemento como pivote
		  int i=izq;         // i realiza la búsqueda de izquierda a derecha
		  int j=der;         // j realiza la búsqueda de derecha a izquierda
		  E aux;
		 
		  while(i < j){                          // mientras no se crucen las búsquedas                                   
		     while(list[i].compareTo(pivote)<=0 && i < j) i++; // busca elemento mayor que pivote
		     while(list[j].compareTo(pivote)>0) j--;           // busca elemento menor que pivote
		     if (i < j) {                        // si no se han cruzado                      
		         aux= list[i];                      // los intercambia
		         list[i]=list[j];
		         list[j]=aux;
		     }
		   }
		   
		   list[izq]=list[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
		   list[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
		   
		   if(izq < j-1)
		      quicksort(list,izq,j-1);          // ordenamos subarray izquierdo
		   if(j+1 < der)
		      quicksort(list,j+1,der);          // ordenamos subarray derecho
		   
		}
}
