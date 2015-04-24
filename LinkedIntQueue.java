public class LinkedIntQueue
{
   // fields
   private Node front, rear;
   private int count;

   // constructors 
   public LinkedIntQueue()
   {
      front = null;
      rear  = null;
      count = 0;  
   }//end Constructor
   
   //Methods
   
      //enque inserts an element at the rear of the queue
      public void enque(int d)
      {
         Node newNode = new Node(d);
         
         if (!isEmpty())
         {
            rear.setNext(newNode);
            rear = newNode;
         }
         else //empty
         {
            front = newNode;
            front.setNext(newNode);
            rear = newNode;
         }//end else
         
         count++;
         
      }//end enque
      
      //deque  removes the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns it removes the element at front of queue and returns itremoves the element at front of queue and returns it removes the element at front of queue and returns it removes
   
      //isEmpty
      public boolean isEmpty()
      {
         return front == null;
      }//end isEmpty
      //isFull
   
      //size



}// end class