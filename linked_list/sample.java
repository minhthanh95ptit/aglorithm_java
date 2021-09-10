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

    public static Node addToIndex(Node headNode, int value, int index){
        if(index == 0){
            return addToHead(headNode, value);
        }else{
            //B1. Tim vi tri can them 
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while(curNode.next != null){
                count++;
                if(count == index){
                    //Thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode){
        if(headNode == null){
            return null;
        }
        //B1. xac dinh last va previous
        Node lastNode = headNode;
        Node prevNode = null;
        
        while(lastNode.next != null){ // lastNode.next = null
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null){
            return null;
        }else{
            prevNode.next = lastNode.next;
        }

        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null || index < 0)
            return null;
        
        if(index == 0)
            return removeAtHead(headNode);

        Node curNode = headNode;
        Node preNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(curNode.next != null){
            if(count == index){
                // Remove current Node
                bIsFound = true;
                break;
            }
            preNode = curNode;
            curNode = curNode.next;
            count++;
        }
        
        // Remove current 
        if(bIsFound){
             if(preNode == null){ //current node is last node
                return null;
             }else{
                if(curNode != null){
                    // else Do nothing
                    preNode.next = curNode.next;
                }
             }
        }
        return headNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        printLinkedList(n2);
        printLinkedList(n3);

        Node newList = addToHead(n1, 0);
        Node newList2 = addToTail(newList, 1);
        printLinkedList(newList2);

        // addToIndex(n1, 0, 0);
        // printLinkedList(n1);
        // n1 = addToIndex(n1, 2, 2);
        // printLinkedList(n1);

        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);

        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);
    }
}
