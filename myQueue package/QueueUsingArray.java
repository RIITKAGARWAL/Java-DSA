
class QueueUsingArray {


    static class Queue {

        int arr[];
        int front; // used in remove
        int rear; // used in add
        int size; // size of arr
    
        Queue(int size) {
            System.out.println("Queue Using Array Constructor called");
            this.arr = new int[size]; // array is allocated a size
            this.size = size;
            front=rear=-1;
        }
        // empty
        boolean isEmpty() {
            return rear == -1;
        }

        // full
        boolean isFull() {
            return ((rear+1) == size && front ==0);
        }

        // enqueue O(n)
        void add(int num) {
            if (isFull()) {
                System.out.println("queue overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            if(front!=0 && (rear+1)==size){
                while(front>0){
                    arr[front]=arr[front--];
                    rear--;
                }
            }
            arr[++rear] = num;// assigned num into the respective pocket
           
        }

        // dequeue
        int remove() {        

            if(front==rear){    //only element present
                front= rear=-1;
            }

            if (isEmpty()) {
                return -1;
            }

            int temp = arr[front++];
            
            return temp;
        }

        // peek
        int peek(){
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
        //display all
        void disp(){
            for(int ctr = front; ctr<=rear; ctr++){
                System.out.println(arr[ctr]);
            }
        }
    }

    public static void main(String args[]) {
       Queue q =  new Queue(5);
       q.add(4);
       q.add(3);
       q.add(2);
       q.add(1);
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
