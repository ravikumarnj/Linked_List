public class LinkedList {
    Node head;

    // insert at head
    public void addHead(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insert at Tail
    public void addLast(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

    // insert at index (K-th index)
    public void insertAtK(int index , int value){
        int count = 0;
        if(head == null && index>1){
            System.out.println("please enter valid index and List is empty");
            return;
        }
        Node newNode = new Node(value);
        if(index == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp != null){
            count++;
            if(count == index-1){
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Enter valid index (index must be b/w ) 1 and "+(count+1));
    }
    // insert before value
    public void addBeforeVal(int val , int data){
        if(head == null){
            System.out.println("list is empty cant able to find value !");
            return;
        }
        if(head.data == val){
            this.addHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println(val+" not existed in List");
    }

    public void display(){
        if(head == null){
            System.out.println("No elements available to Display ");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Deletion at head;
    public int deleteAtFirst(){
        if(head == null || head.next==null){
            System.out.println("first node is empty !");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    // Deletion at Tail
    public int deleteAtLast(){
        int val = -2;
        if(head == null){
            System.out.println("list is empty ");
           
        }else{
            Node temp = head;
            if(temp.next == null){
                val = head.data;
                head = null;   
            }else{
                while(temp.next.next != null){
                    temp=temp.next;
                }
                val = temp.next.data;
                temp.next = null;
            }
        }
        return val;
    }

    // deletion at index
    public Integer deleteIndex(int index){
        if(head == null){
            System.out.println("cant able to delete List is Empty !");
            return null;
        }
        if(index == 1){
             Integer i = head.data;
             head = head.next;
             return i;
        }
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count++;
            if(count == index-1){
                int i = temp.next.data;
                Node p = temp.next.next;
                temp.next.next =null;
                temp.next = p;
                return i;
            }
            temp = temp.next;
        }
        return null;
    }

    // deletion of value
    public Integer deleteValue(int value){
        if(head == null){
            System.out.println("head is null ");
            return null;
        }
        if(head.data == value){
            int i = head.data;
             head = head.next;
             return i;
        }
        Node temp = head;
        
        while(temp.next != null){

            if(temp.next.data == value){
                int v = temp.next.data;
                Node n = temp.next;
                temp.next = temp.next.next;
                n.next = null;
                return v;
            }
            temp = temp.next;
        }
        System.out.println("please enter value which available in the LL");

        return null;
    }

}
