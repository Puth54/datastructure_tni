
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
    public static Queue<Integer> queue = new ArrayDeque<Integer>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        originalQueue();
        
        while (true) {
            System.out.print("Press 1 to rotate queue: ");
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if (choice == 1) {
                    rotateQueue();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        
        System.out.println("Exit");
        input.close();
    }
    
    public static void rotateQueue() {
        if (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println("Calling queue: " + current);
            queue.add(current);
            System.out.println("Queue => " + queue);
        }
    }
    
    public static void originalQueue() {
        queue.clear();
        for (int i = 101; i <= 107; i++) {
            queue.add(i);
        }
        System.out.println("Queue => " + queue);
    }
}
