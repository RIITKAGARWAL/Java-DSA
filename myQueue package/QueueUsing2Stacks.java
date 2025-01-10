import java.util.Stack;
public class QueueUsing2Stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //enqueue
    void enqueue(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    //dequeue
    int dequeue(){
        return s1.pop();
    }
    //peek
    int peeks(){
        return s1.peek();
    }
}
