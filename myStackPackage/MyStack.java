package myStackPackage;

class MyStack {

    class Node {
        String data;
        Node next;

        Node() {

        }

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node TOP;

    MyStack() {
        this.TOP = null;
    }

    boolean isEmpty() {
        return TOP == null;
    }

    void push(String data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            TOP = newNode;
            return;
        }

        newNode.next = TOP;
        TOP = newNode;
    }

    String pop() {
        if (isEmpty()) {
            return null;
        }

        String temp = TOP.data;
        TOP = TOP.next;
        return temp;
    }

    String peep() {
        if (isEmpty()) {
            return null;
        }
        return TOP.data;

    }

    void pushEnd(String data){
        if(TOP==null){
            push(data); return;
        }
        
        String temp = pop();
        pushEnd(data);
        push(temp);

    }

    void revStack(){
        if(TOP==null){
        return;
        }
        
        String temp = pop();
        revStack();
        pushEnd(temp);
    }

}