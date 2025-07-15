class Stack{
    int size;
    int[] arr;
    int top;
    
    Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        arr[++top]=data;
    }
    int pop(){
        if(top == -1){
            return 0;
        }
        return arr[top--];
    }
    void Display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(12);
        stack.push(20);
        stack.pop();
        stack.Display();
        stack.pop();
        stack.Display();
    }
}