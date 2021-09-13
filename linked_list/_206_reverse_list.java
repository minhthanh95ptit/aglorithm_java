package linked_list;

public class _206_reverse_list {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static Node reverseList(Node headNode){
        // Node curNode = headNode;
        // Node next = headNode.next;

        // while(curNode.next != null){
        //     curNode.next = next.next;
        //     next.next = headNode;
        //     headNode = next;
        //     next = curNode.next;

        // }
        Node curNode = headNode;
    
        while(curNode != null && curNode.next != null){
            Node nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = headNode;
            headNode = nextNode;

        }
        return headNode;
    }

    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        n1 = reverseList(n1);
        printLinkedList(n1);
    }
}

