
public class TestApp {
	public static void main(String[] args) {
		int[] num = {11, 9, 23, 87, 38, 22, 92, 10};
		
		Sorting sort1 = new Sorting(num);
		System.out.print("Bubble sort test : ");
		sort1.bubbleSort();
		sort1.printSortedData();
		
		System.out.println(" ");
		
		int[] num2 = {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting sort2 = new Sorting(num2);
		System.out.print("Selection sort test : ");
		sort2.selectionSort();
		sort2.printSortedData();
		
		System.out.println(" ");
		
		int[] num3 = {68, 10, 87, 75, 14, 36, 98, 76};
		Sorting sort3 = new Sorting(num3);
		System.out.print("Insertion sort test : ");
		sort3.insertionSort();
		sort3.printSortedData();
		
		System.out.println(" ");
		
		int[] num4 = {87, 11, 26, 35, 49, 85, 21, 46};
		Sorting sort4 = new Sorting(num4);
		System.out.print("quick sort test : ");
		sort4.quicksort();
		sort4.printSortedData();
		
	}

}
