public class reverseLL {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    Node tail;
    int size;
    public void addF(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            size++;
            return;
        }
        n.next=head;
        head=n;
        size++;
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(){

        if(head==null || head.next==null) return;

        Node previous=null;
       Node current=head;
       while(current!=null){
        Node temp=current.next;
        current.next=previous;
        previous=current;
        current=temp;
       }
       head=previous;
    }
    public static void main(String[] args) {
        reverseLL li=new reverseLL();
        li.addF(11);
        li.addF(12);
        li.addF(13);
        li.addF(14);
        li.addF(15);
        li.addF(16);
        li.display();
        li.reverse();
        li.display();
    }
}
