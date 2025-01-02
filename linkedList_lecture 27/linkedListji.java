class linkedListji {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data){
        //lets create a node first
        Node newNode = new Node(data);
        //check if its empty list
        if(head == null){
            head = newNode;
            return; //to prevent further execution 
        }

        //if list is not empty
        newNode.next = head;
        head = newNode;

    }
    
    void addLast(String data){
        //lets create a node first
        Node newNode = new Node(data);
        
        //if list is empty
        if(head == null){
            head = newNode;
            return;
        }
        //if single node
        if(head.next==null){
            head.next = newNode;
            return;
        }

        //if multiple nodes
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void delFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    void delLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head = head.next;
            return;
        }
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }
    
    void display(){
        if(head==null){
            System.out.println("List is Empty");
            return; //to prevent from further execution
        }

        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next ;
        }
        System.out.println("null");

    }

    void size(){
        if(head==null){
            System.out.println("List is Empty");
            return; //to prevent from further execution
        }
        if(head.next == null){
            System.out.println("1");
        }
        int ctr = 1;
        Node currNode = head;
        do{
            currNode = currNode.next;
            ctr++;
        }while(currNode.next!=null);
        System.out.println("size is : "+ctr);
    }


    public static void main(String[] args) {
        linkedListji x = new linkedListji();
        x.addFirst("jai");
        x.addLast("shree");
        x.addLast("ram");
        x.display(); 
        x.size();
        x.delFirst();
        x.delLast();
        x.display();
        x.size();
       

    }
}