package hw1;

public class TelevisionTest
{
   public static void main(String [] args)
   {
      Television tv = new Television(10);
   // try out the volume controls
   System.out.println(tv.getVolume()); // expected 0.5
  tv.setChannel(7);
  tv.setChannel(2);
  tv.resetChannelMax(5);
  tv.goToPreviousChannel();
  System.out.println(tv.getChannel() + ": Expected 4"); // expected 2
   }  
 }