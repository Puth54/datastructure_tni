public class TodoList {
    public static void main(String[] args) {
        DoublyLinkedList todoList = new DoublyLinkedList();
        
        todoList.insert("Finish Homework");
        todoList.insert("Laundry");
        todoList.insert("Group Meeting");
        System.out.println("To-Do List = " + todoList.traversal());
        
        // no. 2.1)
        todoList.insert(0, "Submit Report");
        System.out.println("To-Do List = " + todoList.traversal());
        
        // no. 2.2) 
        todoList.insert(2, "Buy Food");
        System.out.println("To-Do List = " + todoList.traversal());
        
        // no. 2.3) 
        todoList.insert("Go to Gym");
        System.out.println("To-Do List = " + todoList.traversal());
        
        // --- no. 4 ---
        // Now List: [Submit Report, Finish Homework, Buy Food, Laundry, Group Meeting, Go to Gym]
        // no. 4.1) 
        todoList.remove(); 
        
        // no. 4.2) 
        todoList.remove(3); 
        
        // no. 4.3) 
        todoList.remove(0); 
        
        // no. 4.4)
        System.out.println("To-Do List = " + todoList.traversal());
        
        // no. 5.2)
        System.out.println("Backward Traversal = " + todoList.backwardTraversal());
    }
}
