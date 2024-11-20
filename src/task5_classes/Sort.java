package task5_classes;

public class Sort {

	public static <E> void swap(E[] array,int i,int j){
		E current = array[i];
		array[i] = array[j];
		array[j] = current;
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		int n = array.length;
		boolean isSwapped;
		for (int i = 0;i < n - 1;i++) {
			isSwapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					swap(array, j, j + 1);
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
	}
}