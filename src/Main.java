public class Main {
    public static void main(String[] args){
        LinkedList test = new LinkedList();

        System.out.println("List is empty: " + test.isEmpty());

        test.addLast('a');
        test.addLast('b');
        test.addLast('c');
        test.addLast('d');
        test.addLast('e');
        

        test.printList();


    }
}
