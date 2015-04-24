public class Node
{
   // field
   
   private int data;
   private Node next;
   
   // constructor 
   public Node( int d)
   {
      data=d;
   }//end consturctor
   
   //methods 
   public int getData()
   {
   return data;
   }//end getData
   
   
   public void setNext(Node n)
   {
      next=n;
   }
   public Node getNext()
   {
    return next;
   }
}//end Class
