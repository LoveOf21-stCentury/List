public class Test {
    public static void main(String[] args) {

    }
}

class List {
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return true;
        }
        //create double connected nodes
        head.previous = node;
        node.next = head;
        head = node;
        return true;
    }

    public Node search(int value) {
        if (head == null) return null;
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.value == value) return temp;
        }
        return null;
    }

    public Integer removeFirst() {
        if (head == null) return null;
        int temp = head.value;
        head = head.next;
        if (head != null) head.previous = null;
        return temp;
    }

    public Integer removeLast() {
        if (tail == null) return null;
        int temporary = tail.value;
        tail.previous.next = null;
        tail = tail.previous;
        return temporary;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        if (tail == null) {
            tail = new Node(value);
            return;
        }
        tail.next = new Node(value);
        tail.next.previous = tail;
        tail = tail.next;
    }

    @Override
    public String toString() {
        String str = "{ ";
        for (Node temp = tail; temp != null; temp = temp.previous) {
            str += String.valueOf(temp.value) + " ";
        }
        return str + "}";
    }

}

