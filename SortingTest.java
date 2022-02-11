import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class SortingTest{
	Sorting sorts = new Sorting();
	Integer list1[] = new Integer[]{3,41,2,8,4};
	Integer list2[] = new Integer[] {2,3,4,8,41};
	
	void radixsortTest() {
		sorts.quicksort(list1, 3, 4);
		assertArrayEquals(list1, list2);
	
	
	}
	
	void gnomesortTest() {
		sorts.gnomeSort(list1);
		assertArrayEquals(list1, list2);
		
	}
	
	void heapsortTest() {
		sorts.heapSort(list1);
		assertArrayEquals(list1, list2);
	
	
	}
	
	void mergesortTest() {
		sorts.mergesort(null, list1, 3, 4);
		assertArrayEquals(list1, list2);
	}
	
	void quicksortTest(){
		sorts.quicksort(list1, 3, 3);
		assertArrayEquals(list1, list2);
		
	}
	
	
	


}
