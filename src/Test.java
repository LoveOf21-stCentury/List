public class Test {
    public static void main(String[] args) {

    }
}

class List {
    private Node head;

    private class Node {
        private int value;
        private Node next;

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

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.next == null) {
                temp.next = new Node(value);
                break;
            }
        }
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node node, Node previousNode) {
        if (node.next == null) {
            head = node;
        } else {
            revert(node.next, node);
        }
        node.next = previousNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (Node temp = head; temp != null; temp = temp.next) {
            sb.append(temp.value);
            sb.append(" ");
        }
        return sb.toString() + "}";
    }

}

