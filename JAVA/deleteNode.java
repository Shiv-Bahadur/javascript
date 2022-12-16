class main{
public static void main(String[] args) {
 LinkedList ll=new LinkedList();
 ll.addFirst(1);
 ll.addFirst(2);
 ll.addFirst(2);
 ll.addFirst(4);
 ll.addFirst(5);
ll.display();
ll.removeElement(3);
ll.display();
    
}
}
class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node tail;
    int size;
    public void addFirst(int data){
        
        Node n=new Node(data);
        n.next=this.head;
        this.head=n;
        if(size==0){
            tail=head;
        }
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
    public void removeElement(int n){
        Node temp=head;
        while(n-2>0){
            temp=temp.next;
            n--;
        }
        Node k=temp.next.next;
        temp.next=null;
        temp.next=k;
    }

}
