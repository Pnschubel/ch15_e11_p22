import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   //instance variables
   ArrayList needRunway; //Variable in which to store the queues of landing planes and taking off planes.
    
   /**
      Constructor.
   */
   public RunwaySimulator()
   {
      needRunway = new ArrayList();
      Queue<String> takeOff = new LinkedList<>();
      Queue<String> landing = new LinkedList<>();
      
      //Puts queues in the array, so that I know if planes need to land or not.
      //Since landing planes take priority, no planes take off until all planes land
        //in other words, if the queue @ index = 1 has members, nothing happens with queue @ index = 2
      needRunway.add(landing);
      needRunway.add(takeOff);
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
       //Adds the new plane to the queue of planes needing to take off
       needRunway[1].add(flightSymbol);
   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
       //Adds the new plane to the queu of planes needing to land
       needRunway[0].add(flightSymbol);
   }

   /**
      If plane needs to land, lands plane. Else, lets plane take off.
   */
   public void handleNextAction()
   {
       //Sees if a plane needs to land. If so, lands plane.
       if (needRunway[0].size != 0){
           System.out.println("\nFlight " + needRunway[0].remove() + " is landing now.");
        }else{
            //Sees if plane needs to take off. If so, lets plane take off.
            if (needRunway[1].size != 0){
                System.out.println("\nFlight " + needRunway[0].remove() + " is taking off now.");
            }else{
                //If this runs, nothing is due to happen. Tells user so.
                System.out.println("\nNo flights in need of runway.");
            }
        }
   }
}
