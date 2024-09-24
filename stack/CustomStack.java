package college.stack;

// using linked list
public class CustomStack {

    private Node top;

    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    CustomStack(){
        this.top = null;
    }

    // methods

    protected boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(isEmpty()) System.out.println("Cannot peek from an empty stack");

        return top.val;
    }

    public boolean push(int item){
        Node node = new Node(item);
        if(isEmpty()){
            top = node;
            return true;
        }
        node.next = top;
        top = node;
        return true;
    }

    public int pop(){
        if(isEmpty()) System.out.println("Stack is empty");

        int removed = top.val;
        top = top.next;
        return removed;
    }

    public void display(){
        Node temp = top;
        while(temp != null ){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
