package myLinkedList;

import java.util.Collections;
import java.util.HashSet;

class myLinkedList {
    Node head = null; // head for keeping track of start node

    class Node {
        String data; // keeps data
        Node next; // address of next node
        static int Size; // size of List
        // int idx; // for index based tracking

        Node(String data) { // parameterised constructor for initialising the data part
            this.data = data;
            this.next = null; // by default address is null
        }
    }

    // add at begining
    void addFirst(String data) {
        Node newNode = new Node(data); // node creation
        Node.Size++; // increase the size
        if (head != null) {
            newNode.next = head; // linking head in next of newNode (now head is preserved)
        }
        head = newNode; // made new node the the head
    }

    // add at last
    void addLast(String data) {
        Node newNode = new Node(data); // new node creation
        Node.Size++; // increase the size
        if (head == null) { // check if list is empty
            head = newNode; // since its empty we assigned head a new value
            return; // to prevent further function execution
        }
        Node currNode = head;// we dont move head for traversing , we hold address of head in someone then
                             // move
        while (currNode.next != null) { // the condition will stop before null node
            currNode = currNode.next; // traversing forward in a list
        }
        /*
         * lets optimise the above loop
         * while (currNode.next.next != null) {
         * currNode = currNode.next.next;
         * }
         * if (currNode.next != null) {
         * currNode = currNode.next;
         * }
         */
        // after the loop, currNode is carrying address of node just before null node
        currNode.next = newNode;
    }

    // add at nth position from start
    void nthPosAdd(int idx, String data) {
        Node.Size++; // increase the size
        if (Node.Size < idx && Node.Size <= idx) { // to check if provided position is valid
            System.out.println("nth position wrong input");
            Node.Size--;
            return;
        }
        // case 1 add at begining
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // case 2 add at in where between
        Node newNode = new Node(data); // new node creation
        Node prevNode = null;
        Node currNode = head;

        while (idx-- > 0) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // i got address of Node & NodePrevious at asked index position
        prevNode.next = newNode; // newNode is now linked with prevNode
        newNode.next = currNode; // currNode is now linked with newNode

    }

    // add at nth position from last
    void nthPosFrmLastAdd(int idx, String data) {
        idx = Node.Size - idx - 1; // (idx from start) = (size of list) - (idx from end) -1
        nthPosAdd(idx, data);

    }

    // remove from begining
    void deleteFirst() {
        if (head == null) {
            System.out.println("list is Empty");
            return;
        }
        head = head.next;
        System.out.println("First node deleted");

    }

    // remove from last
    void deleteLast() {
        if (head == null) {
            System.out.println("list is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Node Deleted");
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        System.out.println("Node Deleted");
    }

    // remove at nth position from start
    void deleteNthNode(int idx) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (idx < 0 || idx > Node.Size - 1) {
            System.out.println("index range out of bounds");
            return;
        }
        if (idx == 0) {
            deleteFirst();
            return;
        }

        Node currNode = head;
        Node prevNode = head;
        while (idx-- > 0) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        System.out.println("Data deleted" + currNode.data);
        prevNode.next = null;

    }

    // remove at nth position from last
    void deleteNthNodeFromLast(int idx) {
        idx = Node.Size - 1 - idx;
        if (idx == 0) {
            deleteFirst();
            return;
        }
        deleteNthNode(idx);
    }

    // remove all
    void deleteList() {
        if (head == null) {
            System.out.println("list is already empty, Nothing to delete");
        }
        head = null;
        System.out.println("List Deleted");
    }

    // clear all the data
    void clearData() {
        if (head == null) {
            System.out.println("list is already empty, Nothing to delete");
        }
        Node currNode = head;
        while (currNode != null) {
            currNode.data = "";
            currNode = currNode.next;
        }
        System.out.println("All Data part from the list is Blanked");
    }

    // Search at nth position from start
    Node search(int idx) {
        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }
        if (idx < 0 || idx > Node.Size - 1) {
            System.out.println("index range out of bounds");
            return null;
        }
        Node currNode = head;
        while (idx-- >= 0) {
            currNode = currNode.next;
        }
        System.out.println("Data is " + currNode.data);
        return currNode;

    }

    // Search at nth position from last
    Node searchFromLast(int idx) {
        idx = Node.Size - idx;
        return search(idx);

    }

    // update at nth position from start
    void update(int idx, String data) {
        Node currNode = search(idx);
        if (currNode == null) {
            return;
        }
        currNode.data = data;
        System.out.println("data updated successfully");
    }

    // update at nth position from last
    void updateFromLast(int idx, String data) {
        Node currNode = searchFromLast(idx);
        if (currNode == null) {
            return;
        }
        currNode.data = data;
        System.out.println("data updated successfully");
    }

    // display size of list
    void size() {
        System.out.println("Total nodes present: " + Node.Size);
    }

    // display list
    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return; // to prevent function from further execution
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
        }
        System.out.println("Null");

    }

    // reverse a list via iterative way
    void revListIterativeWay() {
        if (head == null) {
            System.out.println("List is Empty");
            return; // to prevent function from further execution
        }
        if (head.next == null) {
            System.out.println("task done");
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        if (head.next.next == null) {
            head = head.next;
            head.next = prevNode;
            System.out.println("task done");
            return;
        }

        while (currNode.next != null) {

            Node nextNode = currNode.next;
            // connection reverse
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = currNode;// head shift

    }

    // reverse a list via recursive way
    Node revListRecursiveWay(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = revListRecursiveWay(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    // reverse a list via collection framework way
    void revListCollectionFrameworkWay() {
        Collections.reverse(head);
    }

    // check if palindrome or not
    boolean isPalindrome() {
        if (head == null) {
            System.out.println("list is empty");
            return false;
        }
        if (head.next == null) {
            return true;
        }
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {// floyd's algorithm
            hare = hare.next.next; // fast pointer
            turtle = turtle.next; // slow pointer
        }
        // in turtle we have our first midpoint
        Collections.reverse(turtle.next);
        hare = head; // variable reusing
        turtle = turtle.next;
        while (hare != null && turtle != null) {
            if (hare.data != turtle.data) {
                return false;
            }
        }
        return true;
    }

    // find cycles in a list via floyd's Algo
    boolean isListCyclic() {
        if (head == null) {
            System.out.println("list is empty");
            return false;
        }
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;

    }

    // find point of cycle formation via floyd's Algo
    Node pointOfCycleInList() {
        Node hare = head;
        Node turtle = head;
        boolean flag = false;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                turtle = head;
                flag = true;
                break;
            }
        }
        while (flag) {

            turtle = turtle.next;

            if (hare.next == turtle) {
                return hare;
            }
            hare = hare.next;
        }
        return head;
    }

    // remove cycle from a list via floyd's Algo
    void removeCycleFromList() {
        Node currNode = pointOfCycleInList();
        currNode.next = null;
    }

    // find cycles in a list via hashtable
    boolean isCyclicViaHashSet() {
        HashSet<String> sets = new HashSet<>();
        Node currNode = head;
        while (currNode != null) {
            if (sets.contains(currNode)) {
                return true;
            }
            sets.add(currNode);
            currNode = currNode.next;
        }
        return false;

    }
    // find point of cycle formation via hashtable
        Node pointOfCycleViaHashSet(){
            HashSet<String> sets = new HashSet<>();
        Node currNode = head;
        Node prevNode  = null;
        while (currNode != null) {
            if (sets.contains(currNode)) {
                return prevNode;
            }
            sets.add(currNode);
            prevNode = currNode;
            currNode = currNode.next;
        }
            return null;
        }
    // remove cycle from a list via hashtable
     void removeCycleFromListViaHashSet(){
        Node currNode = pointOfCycleViaHashSet();
        currNode.next = null;
     }


}