import java.util.Scanner;

public class LinkedList {
   private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
   private Node head;
    private Node tail;
   private int size;
  

public void addFirst(int data){
      Node n=new Node(data);
      n.next=this.head;
      this.head=n;
      if(this.size==0){
        tail=head;
      }
      this.size++;
  }

  public void addLast(int data){
    Node n=new Node(data);
    if(this.size==0){
      addFirst(data);
    }else{
    this.tail.next=n;
    this.tail =this.tail.next; //or this.tail=n;
    this.size++;
    }
    return;
  }
  public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
  }

  public void removeFirst(){
        this.head=this.head.next;
       
  }

  public Node getNode(int idx){
    int count=0;
    Node temp=head;
    while(temp!=null && count<idx){
       temp=temp.next;
       count++;
    }
    return temp;
  }
  public void removeElement(int n){
    Node temp=getNode(n-1);
   
    Node k=temp.next.next;
    temp.next=null;
    temp.next=k;
}


 
  
}
class main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  //System.out.println("enter size of linkedlist: ");
 // int n=sc.nextInt();
    LinkedList ll=new LinkedList();
    // while(n>0){
    //   int a=sc.nextInt();
    //   ll.addFirst(a);
    //   n--;
    // }
    ll.addFirst(10);
    ll.addFirst(105);
    ll.addFirst(20);
    ll.addFirst(40);
    ll.addFirst(100);
    ll.display();
  
    
}


}