package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;
    
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head,tail;
    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
        }else{
            n.prev = tail;
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
    public void insertAtBeg(int data){
        Node n=new Node(data);
        head.prev = n;
        n.next=head;
        head=n;
    }
    public void insertAtspecific(int pos,int val){
        Node n = new Node(val);
         Node temp=head;
        for(int i = 0;i<pos-1;i++){
            n.prev = temp;
            n.next = temp.next;
            temp.next = n;
        }
    }
}

class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        //l.insertAtBeg(5);
        //l.insertAtBeg(30);
        l.insertAtspecific(2,100);
        l.Display();
    }
}
