package src.main.dsa.datastructure.linear.linked_list;

/**
 * explanation
 *
 * @author 김재형
 * @date 2024-12-26
 */
public class SinglyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node search (int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public void addFirst (int value) {
        Node first = head; // head는 null이라서, first로 null이다.

        Node newNode = new Node(first, value); // newNode의 next는 null이고 value는 value다.
        size++; // 새 요소 추가했으니 size 추가.

        head = newNode; // head에다 next 가 null이고 value가 value인 값을 넣어준다.
        if (first == null) { // head가 null 이므로 first도 null 이다.
            tail = newNode;
        }
    }

    public void addLast (int value) {
        Node last = tail;
        Node newNode = new Node(last, value);
        size++;
        tail = newNode;

        if (last == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }

    }

    public boolean add (int value) {
        addLast(value);
        return true;
    }

    public void add (int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (size -1 == index) {
            addLast(value);
            return;
        }

        Node prevNode = search(index - 1);
        Node nextNode = prevNode.next;

        Node newNode = new Node(nextNode, value);

        size++;
        prevNode.next = newNode;
    }


    /*
        내부 클래스로 선언한 이유 : Node는 singlyLinkedList에서만 사용되기 때문에
        private 선언이유 : 외부 노출되면 보안상 위험함.
        static 선언이유 : 메모리 누수 방지. 내부클래스는 무조건 static로 선언해야함.
     */
    private static class Node {
        private Node next;
        private int data;

        Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
    }

    public  int getData (Node node) {
        if (node == null) { return -1; }

        return node.data;
    }
}

