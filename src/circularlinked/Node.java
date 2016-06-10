package circularlinked;

public class Node {

    int data;
    Node next;
    Node previous;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}

class CircularLList {

    private Node head;

    public Node find(int key) {
        Node active = head;

        if (head != null) {
            while (active.data != key) {
                if (active.next == head.previous) {
                    return null;
                } else {
                    active = active.next;
                }
            }
        } else {
            System.out.println("List is empty !!");
        }

        return active;
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.setData(value);

        if (head == null) {
            head = newNode;
            head.setNext(newNode);
            head.setPrevious(newNode);
            return;
        }

        Node temp = head.getPrevious();
        temp.setNext(newNode);
        newNode.setPrevious(temp);
        newNode.setNext(head);
        head.setPrevious(newNode);
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }

        Node temp = head;

        while (temp.getData() != value) {
            temp = temp.next;
        }

        temp.previous.setNext(temp.next);
        temp.next.setPrevious(temp.previous);

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }

        System.out.print("List : ");
        Node temp = head;

        while (temp != head.previous) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

}
