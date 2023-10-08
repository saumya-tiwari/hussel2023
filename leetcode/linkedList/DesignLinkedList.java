package leetcode.linkedList;


// get(int index)
//addToHead(int value)
//addToTail(int value)
//addAtindex(int index)
//deleteAtIndex(int index)
//size()
//isEmpty()

class Node {
        Node next;
        int value;

        public Node(){
        }

         public Node(int value){
            this.value = value;
        }

      public void setNext(Node next){
        this.next = next;
      }

      public void setValue(int value){
        this.value = value;
      }

      public Node getNext(){
        return this.next;
      }

      public int getData(){
        return this.getData();
      }

    }

class LinkedList{

    

    Node head;
    int size;

    public LinkedList(){
        head = new Node(); // dummy head
    }


    public int get(int index){
        if(index < 0 || index > size - 1) return -1;
       
        Node curr = head.next;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        return curr.value;
    }

    public void addToHead(Node node){
       node.next = head.next;
       head.next = node;
       this.size++;
    }

    public void addAtindex(int index, Node node){
     if(index < 0 || index > size - 1) return;
       
        Node curr = head.next;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        Node tmp = curr.next;
        curr.next = node;
        node.next = tmp;
       this.size++;
    }

    public void deleteAtIndex(int index){
      if(index < 0 || index > size - 1) return;
       
        Node curr = head.next;
        for(int i = 0; i < index - 1; i++){
            curr = curr.next;
        }

        Node tmp = curr.next.next;
        curr.next = tmp;
       this.size--;
    }

    public void addToTail(Node node){

        Node curr = head;
        while(curr.next != null){
            curr =curr.next;
        }
        curr.next = node;
        size++;

    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
       return size <= 0;
    }
      
}





public class DesignLinkedList{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1  = new Node(1);
        Node node2  = new Node(2);
        Node node3  = new Node(3);
         Node node4  = new Node(7);
        linkedList.addToHead(node1);
        linkedList.addToHead(node2);
         linkedList.addToTail(node3);
         linkedList.addAtindex(1, node4);
         linkedList.deleteAtIndex(2);
         System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
         System.out.println(linkedList.get(2));
          System.out.println(linkedList.get(3));
          System.out.println(linkedList.isEmpty());
        //System.out.println(linkedList.getSize());
    }
}