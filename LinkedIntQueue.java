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
      public void enqueue(int d)
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
      public int dequeue()
      {
         int rv = 0;
         if(!isEmpty())
         {
            rv = front.getData();
            if (count > 1)
            {
            front = front.getNext();
            }//close count > 1
            else // count === 1;
            {
               front= null;
               rear = null;
            }//end else count > 1 
             
         }//close !isEmpty
         
         
         count--;
         return rv;
      }
      //isEmpty
      public boolean isEmpty()
      {
         return front == null;
      }//end isEmpty
      //isFull
      public boolean isFull()
      {
         return false;
      }
      //size
      public int size()
      {
       return count;
      }


public static void main(String[]	args)	
{ //create a queue 
   LinkedIntQueue	iq	= new	LinkedIntQueue();
   for (int x = 0; x < 10; x++)
   {
      int datum = (x*8)%13;
      iq.enqueue(datum);
   }
   
   while(!iq.isEmpty())
   {
      
      System.out.println( iq.dequeue());
      
   }
}

}// end class