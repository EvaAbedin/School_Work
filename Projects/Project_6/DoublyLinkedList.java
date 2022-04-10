
import java.io.File;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DoublyLinkedList {
// node class
class Node {
    // phonebookData object
    PhonebookData data;
    Node previous;
    Node next;
    
    // constrcutor with phonebookData object
    public Node(PhonebookData data) {
    this.data = data;

    }
    
}
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(PhonebookData data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //print list of nodes
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " "); 
            System.out.println("");
            current = current.next;  
        }  
    }
    
    public SortedSet search(String searchItem){
    
        SortedSet sortedSet = new TreeSet();
        Node current = head;  
       
        while (current != null) {
        //Checks each node by incrementing the pointer.
        if (current.data.name.contains(searchItem) || current.data.mobilePhone.contains(searchItem)) {
        sortedSet.add((PhonebookData) current.data);
        }
        current = current.next;
        }
        return sortedSet;
        
    }
    
    public SortedSet searchTailFirst(String searchItem) {

        SortedSet sortedSet = new TreeSet();
        Node current = tail;
        
        if (tail == null) {
        System.out.println("List is empty");
        return null;
    
        }
        // System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
    
            //Checks each node by incrementing the pointer.
            if (current.data.name.toLowerCase().contains(searchItem.toLowerCase()) || current.data.mobilePhone.contains(searchItem)) {
   
                sortedSet.add((PhonebookData) current.data);
                }
                current = current.previous;
                }
        
        return sortedSet;
    }




public static void main(String[] args) {
   
    DoublyLinkedList dList = new DoublyLinkedList();
    Scanner scanner = new Scanner(System.in);
    
    try{
        //read phone numbers from the file
    File file = new File("phone_numbers.txt");
    Scanner readFile = new Scanner(file);
    
    while(readFile.hasNext()){
    
        String arr[] = readFile.nextLine().split(",");
       //Add nodes to the list
        dList.addNode(new PhonebookData(arr[0], arr[1]));
        
        
    }
    //Displays the nodes present in the list
    }catch(Exception ex){
    
        System.out.println(ex.getMessage());
    }
    dList.display();

    System.out.println("");

         System.out.println("1: Head First Test...");
         System.out.println("2: Tail First Test...");
         System.out.print("Select: ");
         
        String testType = scanner.nextLine();
   
        if(testType.equals("1")){
        
        System.out.println("\nStarting search from head test...");
        System.out.print("Enter search item (or q to quit):");

        String searchItem = scanner.nextLine();
   
            while (!searchItem.equals("q")) {

                SortedSet sortedSet = dList.search(searchItem);

                if (sortedSet.size() != 0) {

                    for (Object node : sortedSet) {
                    System.out.println(((PhonebookData) node).toString());
                
                    }
                
                }
                else {
                
                    System.out.println("No search results found...");
                }
                
                    System.out.print("\nEnter search item (or q to quit):");
                    searchItem = scanner.nextLine();
                }
        
    
            
        }if(testType.equals("2")){
        
        System.out.println("\nStarting search from tail test...");
        System.out.print("Enter search item (or q to quit):");

        String searchItem = scanner.nextLine();
   
            while (!searchItem.equals("q")) {

                SortedSet sortedSet = dList.searchTailFirst(searchItem);

                if (sortedSet.size() != 0) {

                    for (Object node : sortedSet) {
                    System.out.println(((PhonebookData) node).toString());
                
                    }
                
                }
                else {
                
                    System.out.println("No search results found...");
                }
                
                
                    System.out.print("\nEnter search item (or q to quit):");
                    searchItem = scanner.nextLine();
                }
        
            
        }
        
        
    
}
}

