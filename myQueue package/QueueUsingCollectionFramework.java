import java.util.*;
public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        System.out.println(q.peek());
        
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(5);
        System.out.println(q2.peek());

    }
}
