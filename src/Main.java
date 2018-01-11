public class Main {
    public static void main(String[] args){
        LinkedList test = new LinkedList();

        System.out.println("List is empty: " + test.isEmpty());

        test.addLast(1);
        test.addLast(2);
        test.addLast(3);
        test.addLast('a');
        test.addLast("bcd");
        test.addFirst(0);


        test.printList();


    }
}
