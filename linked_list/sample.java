package linked_list;

public class sample {
    
    //
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
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

    public static Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);

        if(headNode == null){
            return newNode;
        }else{
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value){
        Node newNode = new Node(value);

        if(headNode == null){
            return newNode;
        }else{
            //B1. Xac dinh Last Node
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            //B2. Gan next cho lastNode = new Node
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // printLinkedList(n1);
        // printLinkedList(n2);
        // printLinkedList(n3);

        Node newList = addToHead(n1, 0);
        Node newList2 = addToTail(newList, 1);
        printLinkedList(newList2);
    }
}
