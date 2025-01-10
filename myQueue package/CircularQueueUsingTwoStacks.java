import java.util.Stack;
class CircularQueueUsingTwoStacks{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //enqueue
    void enqueue(int data){
        s1.push(data);
    }

    //dequeue
    int dequeue(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int temp =  s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }


    //peek
    int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int temp =  s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        } 
        return temp;
    }
    public static void main(String args[]){

    }
}