package hw1;

public class Television
{
   private double volume;
   private int channel;
   private int prev;
   private int a;
   private int givenChannelMax;
   public static final double VOLUME_INCREMENT = 0.07;
   public Television(int givenChannelMax)
   {
      volume = 0.5;
      //volume = (int) Math.round(volume);
      this.givenChannelMax = givenChannelMax;
   }
   public void volumeUp()
   {
      volume += VOLUME_INCREMENT;
      volume = Math.min(1, volume);
    
   }
   public void volumeDown()
   {
      volume -=VOLUME_INCREMENT;
      volume = Math.max(0, volume);
      
   }
   public void channelUp()
   {
      prev = channel;
      if(getChannel () == givenChannelMax-1)
      {
         channel = 0;
         
      }
     
      else
         channel +=1;
      
     }
   
   public void channelDown()
   {
      prev = getChannel();
      if(getChannel() == 0)
      {
         channel = givenChannelMax-1;
      }
      else
      channel -= 1;
      
   }
   public int getChannel()
   {
      return channel;
   }
   public double getVolume()
   {
      return volume ;
   }
   public void setChannel(int givenNumber)
   {
      prev = getChannel();
      if(givenNumber > givenChannelMax-1)
      {
         channel = givenChannelMax-1;
      }
      else  if(givenNumber < 0 )
      {
         channel = 0;
      }
      else
         channel = givenNumber;
   }
   public void goToPreviousChannel()
   {    
     channel = prev;
      
   }
   public void resetChannelMax(int max)
   {
     a = max;
      channel = max-1;
      prev = channel;
      
   }
   public String display()
   {
      double x = getVolume() *100;
      int y = (int) Math.round(x);
      return ("Channel "+ getChannel()+" " + "Volume " + y +"%");
      
   }
}
