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

    public Node search(int value) {
        if (head == null) return null;
        for (Node temp = head; temp != null; temp = temp.next){
            if(temp.value == value) return temp;
        }
        return null;
    }

}

