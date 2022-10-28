package LAB;
/*QUESTION-1 Create two threads to print even numbers and odd numbers from 1 to 100?*/
public class EvenOddThread {
	int count = 1;
	 
    static int N;
 
    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (count < N) {
 
                // If count is even then print
                while (count % 2 == 0) {
 
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
               
                System.out.print(count + " ");    // Print the number
 
                
                count++;   // Increment counter
 
                
                notify();   // Notify to second thread
            }
        }
    }
 
    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (count < N) {
 
                // If count is odd then print
                while (count % 2 == 1) {
 
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                // Print the number
                System.out.println(count + " ");
 
                // Increment counter
                count++;
 
                // Notify to 2nd thread
                notify();
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Given Number N
        N = 100;
 
        // Create an object of class
        EvenOddThread mt = new EvenOddThread();
 
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
 
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
        
        	public void run()
            {
                mt.printOddNumber();
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
    }
}
