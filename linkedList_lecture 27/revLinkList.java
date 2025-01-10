//The task is to reverse linklist

import java.util.Collections;
import java.util.LinkedList;

public class revLinkList {

    public static void iterativeWay(LinkedList<String> list) {
        int idx1 = 0;
        int idx2 = list.size() - 1;
        int mid = list.size() / 2;
        String str = "";
        while (true) {
            // swap
            str = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, str);

            // update
            idx1++;
            idx2--;

            //condition
            if (idx1 > mid || idx2 < mid) {
                break;
            }

        }
    }

    public static void recursiveWay(LinkedList<String> list,int strtIdx, int lstIdx) {
        if(lstIdx<strtIdx){
            return;
        }
            // swap
            String str = list.get(strtIdx);
            list.set(strtIdx, list.get(lstIdx));
            list.set(lstIdx, str);

            //recursive call
            recursiveWay(list, strtIdx+1, lstIdx-1);

    }

    public static void clectionfrmwrkWay(LinkedList<String> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("mgr");
        list.add("why");
        list.add("?");

        System.out.println(list);
        iterativeWay(list);
        System.out.println(list);
        clectionfrmwrkWay(list);
        System.out.println(list);
        recursiveWay(list,0,list.size()-1);
        System.out.println(list);

    }
}
