import src.main.dsa.Test01;
import src.main.dsa.datastructure.linear.linked_list.SinglyLinkedList;

/**
 * explanation
 *
 * @author 김재형
 * @date 2024-12-24
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addFirst(1);
        System.out.println("result");
        System.out.println(singlyLinkedList.search(0));
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);
        singlyLinkedList.addLast(5);

        System.out.println("see addLast");
        System.out.println(singlyLinkedList.search(1));

        singlyLinkedList.add(1, 2);
        System.out.println("2nd : " + singlyLinkedList.search(2));
    }
}