
package linkedlistt;


public class LinkedListt {

   
    public static void main(String[] args) {
            LinkList li=new LinkList();
        li.insertFirst(5, 55.5);
        li.insertFirst(6, 66.6);
        li.insertFirst(7, 77.7);
        li.insertFirst(8, 88.8);
        li.insertFirst(9, 99.9);
        li.display();
        while(!li.isEmpty()){
        Link alink=li.deletFirst();
        System.out.print("deleted ");
        alink.displayLink();
        System.out.println(" ");}
    }
    
}
