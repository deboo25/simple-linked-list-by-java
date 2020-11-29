
package linkedlistt;


public class LinkList {
         private Link first;
     public LinkList(){
     first=null;}
     public boolean isEmpty(){
     return (first==null);}
     public void insertFirst(int id,double dd){
     Link ne=new Link(id,dd);
     ne.next=first;
     first=ne;
     }
     public Link deletFirst(){
     Link temp=first;
     first=first.next;
     return temp;}
    public void display(){
    Link current=first;
    while(current!=null)
    {current.displayLink();
    current=current.next;
        
    }
    System.out.println(" ");}
}
