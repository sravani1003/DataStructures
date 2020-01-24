class linkedList{
    Node head;
    int d;
    static class node{
        int data;
        Node next;
        node(int d){
           data=d;
           next=null;
        }
    }
    public static int insert(linkedList l[],int d){
        node newnode=new node(d);
        newnode.next=null;
        if(l.head==null){
            l.head=newnode;
        }
        else{
            node x=l.head;
            while(x.next!=null){
                x=x.next;
            }
            x.next=newnode;
        }
        return list;
        
    }
    public static void main(String[] args){
        linkedList obj=new linkedList();
        linkedList l[]=new linkedList();
        l=obj.insert(l,2);
        l=obj.insert(l,5);
        node c=l.head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }

        
        
    }
}