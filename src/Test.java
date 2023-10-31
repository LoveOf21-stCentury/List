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
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.value == value) return temp;
        }
        return null;
    }

    public Integer removeFirst() {
        if (head == null) return null;
        int temp = head.value;
        head = head.next;
        return temp;
    }

    public Integer removeLast() {
        if (head == null) return null;
        int temporary;
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.next.next == null) {
                temporary = temp.next.value;
                temp.next = null;
                return temporary;
            }
        }
        return null;
    }

    public void addLast(int value){
        if(head == null) {
            addFirst(value);
            return;
        }
        for (Node temp = head; temp!= null; temp = temp.next){
            if(temp.next == null){
                temp.next = new Node();
                break;
            }
        }
    }

}

