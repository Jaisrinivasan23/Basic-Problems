import java.util.*;

class Node{
     int data;
     Node next;
     Node(int data){
         this.data = data;
     }
}

class LinkedList{
    Node head,tail;
    public void Insert(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
            }
            else{
                tail.next = n;
                tail = n;
        }
    }
    
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void InsertAt(int data,int pos){
        Node n = new Node(data);
        for(int i = 0;i<pos;i++){
            n.next = head.next;
            head.next = n;5
        }
    }
    public void InsertBeg(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    public void DisplayAt(int pos){
        Node temp = head;
        for(int i=0;i<pos;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        LinkedList l = new LinkedList();
        while(true){
            System.out.println("1.Create the LinkedList");
            System.out.println("2.Insert the element");
            System.out.println("3.Display All nodes");
            System.out.println("4.To Insert at Specific Position");
            System.out.println("5.Insert Node At start");
            System.out.println("6.Display node untill the specific Position");
            int choice = n.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Enter the Data to create the Node:");
                int data = n.nextInt();
                l.Insert(data);
                break;
            }
            case 2:{
                System.out.println("Enter the Data:");
                int data = n.nextInt();
                l.Insert(data);
                break;
            }
            case 3:{
                l.Display();
                break;
            }
            case 4:{
                System.out.println("Enter the Data:");
                int data = n.nextInt();
                System.out.println("Enter the Position:");
                int pos = n.nextInt();
                l.InsertAt(data,pos);
                System.out.println("After Appending:");
                l.Display();
                break;
            }
            case 5:{
                System.out.println("Enter the Data:");
                int data = n.nextInt();
                l.InsertBeg(data);
                System.out.println("After Appending:");
                l.Display();
                break;
            }
            case 6:{
                System.out.println("Enter the Position:");
                int data = n.nextInt();
                l.DisplayAt(data);
                break;
            }
        }
        }
        
    }
}
