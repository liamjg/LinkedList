class Node {
    public char data;
    public Node nextNode;

    public Node(char d){
        data = d;
    }

    public void printNode(){
        System.out.print(data);
    }
}
public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    public void addLast(char data){
        Node newNode = new Node(data);
        Node temp = head;
        if(temp == null){
            head = newNode;
        }else{
            while (temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }


    }

    public void addFirst(char data){
        Node newNode = new Node(data);
        Node temp = null;

        temp = head;

        head = newNode;

        newNode.nextNode = temp;

    }

    public void insert(char data, int x){
        Node newNode = new Node(data);
        Node temp = head;
        Node prev = null;

        if(x == 0){
            addFirst(data);
        }else{
            for(int i = 0; i < x; i++){
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = newNode;
            newNode.nextNode = temp;
        }
    }

    public  Node remove(int x){
        Node temp = head;
        Node prev = null;

        if(x == 0){
            return removeFirst();
        }else{
            for(int i = 0; i < x; i++){
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = temp.nextNode;
            return temp;

        }
    }

    public Node removeFirst(){
        Node temp = head;
        if(head == null){
            return null;
        }
        head = head.nextNode;
        return temp;
    }

    public Node removeLast(){
        Node temp = head;
        Node prev = null;

        if(head == null){
            return null;
        }else{
            while (temp.nextNode != null){
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = null;

            return temp;
        }

    }

    public int length(){
        int length = 0;
        Node temp = head;

        if(temp == null){
            return length;
        }
        else{
            length = 1;
            while(temp.nextNode != null){
                temp = temp.nextNode;
                length++;
            }
            return length;

        }
    }



    public void printList(){
        Node temp = head;
        while(temp != null){
            temp.printNode();
            temp = temp.nextNode;
        }
        System.out.println();

    }


}
