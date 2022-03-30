import java.util.concurrent.TimeUnit;

// Program to measure elapsed time in Java
class Main
{
    public static void main(String[] args) throws InterruptedException {
 
        long startTime = System.currentTimeMillis();
        
        
        /* ... the code being measured starts ... */
 
        // sleep for 5 seconds
        TimeUnit.SECONDS.sleep(5);
 
        /* ... the code being measured ends ... */
 
        long endTime = System.currentTimeMillis();
 
        long timeElapsed = endTime - startTime;
 
        System.out.print("Program complete in " + timeElapsed  );
        System.out.print (" milliseconds.");
    }
}


