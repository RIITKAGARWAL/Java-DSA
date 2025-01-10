import java.util.LinkedList;
public class LinekedListViaCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("jai");
        list.addLast("shree");
        list.addFirst("jai");
        

        System.out.println(list);
    }
}
