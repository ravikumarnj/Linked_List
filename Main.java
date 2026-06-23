public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        // l.addLast(11);
        // l.addLast(13);
        // l.addLast(15);
        // l.addHead(7);
        // l.addLast(18);
        // l.addHead(1);
        // l.display();
        // System.out.println(l.deleteAtFirst());
        // System.out.println(l.deleteAtLast());
        // l.display();

        // l.addHead(1);
        // l.addLast(2);
        // l.addLast(4);
        // l.display();
        // l.addBeforeVal(4, 69);
        // l.display();

        l.addLast(7);
        l.addLast(17);
        l.addLast(17);
        l.addLast(27);
        l.addLast(69);
        
        l.display();
        System.out.println(l.deleteValue(17));
        l.display();
        

        
    }
}
