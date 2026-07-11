import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        
        for (int num : initial_numbers) {
            numbers.add(num);
        }

        System.out.println("Initial numbers = " + numbers);

        
        System.out.print("Enter number to add at the end: ");
        int endNumber = scan.nextInt();
        numbers.add(endNumber);

        
        System.out.print("Enter number to insert: ");
        int insertNumber = scan.nextInt();

        System.out.print("Enter insert index: ");
        int insertIndex = scan.nextInt();

        numbers.add(insertIndex, insertNumber);

        
        System.out.print("Enter delete index: ");
        int deleteIndex = scan.nextInt();

        numbers.remove(deleteIndex);

        
        System.out.print("Enter update index: ");
        int updateIndex = scan.nextInt();

        System.out.print("Enter new value: ");
        int updateValue = scan.nextInt();

        numbers.set(updateIndex, updateValue);

        
        System.out.println("Final numbers = " + numbers);

    }

}