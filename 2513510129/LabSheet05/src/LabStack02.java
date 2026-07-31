
import java.util.Stack; // or import java.util.*;

public class LabStack02 {
	public static void main(String[] args) {
		// create a new stack
		Stack<Integer> stacks = new Stack<>();
		
		for (int i=0; i<5; i++) {
			System.out.println("Push in track : " + (i+1));
			stacks.push(i+1);
		}
		System.out.println("Train car after into dead-end track : " + stacks.toString() + "\n");
		
		while(!stacks.isEmpty()) {
			System.out.println("Pop from track : " + stacks.peek());
			stacks.pop();
		}
		System.out.println("Train car after out of dead-end track : " + stacks.toString() + "\n");
	}

}