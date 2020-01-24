import java.io.*;
class palindromeList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
           data=d;
           next=null;
        }
    }
    public static linkedList insert(linkedList l,int d){
        Node newnode=new Node(d);
        newnode.next=null;
        if(l.head==null){
            l.head=newnode;
        }
        else{
            Node x=l.head;
            while(x.next!=null){
                x=x.next;
            }
            x.next=newnode;
        }
        return l;
        
    }
    public static boolean isPalindrome(linkedList l){
        static linkedList rev(linkedList nl){
            linkedList nl=new linkedList();
            Node prev=null;
            Node curr=new Node(l.head);
            Node next=null;
            while (current != null) { 
                next = current.next; 
                current.next = prev; 
                prev = current; 
                current = next; 
            } 
            node = prev; 
            return nl;
        }
        Node x=l.head;
        while(x.next!=null){
        if(x.data!=node.data){
            return false;
        }
        x=x.next;
        node=node.next;
    }
    return true;
    }
    public static void main(String[] args){
        linkedList obj=new linkedList();
        linkedList l=new linkedList();
        l=obj.insert(l,2);
        l=obj.insert(l,5);
        l=obj.insert(l,2);
        Node c=l.head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }
        obj.isPalindrome(l);
        
        
    } 
}