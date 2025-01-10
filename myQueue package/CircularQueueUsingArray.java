public class CircularQueueUsingArray {
    static class Queue{
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int size){ //parameterised constructor
            this.arr = new int[size];
            this.size = size;
            this.front=-1;
            this.rear= -1;
        }

        boolean isEmpty(){
            return rear==-1;
        }

        boolean isFull(){
            return ((rear+1)%size)==front;
        }
        void add(int data){
            if(isFull()){
                System.out.println("Queue Overflow");
                return;
            }

            if(isEmpty()){
                front=0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
            return;
            
        }
        int remove(){
            //single element case or empty element case
            if(rear==front || isEmpty()){
                return (front = rear = -1);
            }

            int temp= arr[front];
            front = (front+1)%size;
            return temp;
        }

        int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }

        //display
        void disp(){
            if(isEmpty()){
                System.out.println("no element present to display");
                return;
            }
            int ctr = front;
            while(ctr!=rear){
                System.out.println(arr[ctr]);
                ctr= (ctr + 1)%size;
            }
            System.out.println(arr[ctr]);
            return;
        }


    }
    public static void main(String args[]){
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.disp();
        System.out.println("\n"+q.peek());

    }
}
