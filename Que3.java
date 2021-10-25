/* NAME: SHYAM JEE SINGH
 REG_NO: 2019PGCACA41
    SUB: JAVA ASSIGNMENT

  Question 3):   Demonstrate the use of Timer class of java util package with a suitable example.

*/

//-----------------------------PROGRAM-----------------------------------------------------

import java.util.Timer;
import java.util.TimerTask;
import java.lang.*;
public class Que3
{
   public static void main(String[] args)
   {
     Timer timer = new Timer();
     TimerTask task = new TimerExample();
     timer.schedule(task, 3000, 2000);
   }
}

class TimerExample extends TimerTask
{
  public static int counter = 0;
  public void run()
   {
     counter++;
     if(counter ==6){
       this.cancel();
        System.out.println("Now Cancelling Thread!!!!!");
        System.exit(0);
      }
     System.out.println("Timer run Number " + counter);
   }
}

