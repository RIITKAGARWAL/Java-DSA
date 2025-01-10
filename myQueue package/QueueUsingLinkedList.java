public class QueueUsingLinkedList {
        class Node{
            Node next;
            int data;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private Node tail;

        QueueUsingLinkedList(){
            this.head = null;
            this.tail = null;
        }

        //check if its empty
        boolean isEmpty(){
            return head==null && tail == null;
        }

        //enqueue
        void add(int data){
            Node currNode = new Node(data);
            if(isEmpty()){
                head = currNode;
                tail= currNode;
                return;
            }
            tail.next = currNode;
            tail = tail.next;
            return;
        }

        //dequeue
        int remove(){
            if(isEmpty()){
                return -1;
            }
            //if single node present 
            if(head==tail){
                int temp = head.data;
                head = tail = null;
                return temp;
            }

            int temp = head.data;
            head=head.next;
            return temp;

        }


        //peek
        int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        //display
        void display(){
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data+"-->");
                currNode = currNode.next;
            }
            System.out.println("null");
        }
    }

