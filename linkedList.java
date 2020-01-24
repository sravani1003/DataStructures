import java.io.*;
class linkedList{
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
    public static linkedList delete(linkedList l,int d){
        if(l.head==null){
            return l;
        }
        else{
            Node temp=l.head;
            Node del=temp.next;
            if(temp.data==d){
                l.head=temp.next;
            }
            else{
            while(del.data!=d){
                temp=temp.next;
                del=del.next;
            }
            temp.next=del.next;
        }
            
        }
        return l;
    }
    public static void main(String[] args){
        linkedList obj=new linkedList();
        linkedList l=new linkedList();
        l=obj.insert(l,2);
        l=obj.insert(l,5);
        l=obj.insert(l,7);
        l=obj.insert(l,3);
        l=obj.delete(l,5);
        l=obj.delete(l,2);
        Node c=l.head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }

        
        
    }
}