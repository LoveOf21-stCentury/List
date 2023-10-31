public class Test {

}

class List {
    private Node head;

    private class Node {
        private int value;
        private Node next;
    }

    public boolean addFirst(int value) {
        Node node = new Node();
        if (head == null) {
            head = node;
            return true;
        }
        node.next = head;
        head = node;
        return true;
    }

}

