package ch.heiafr.tic;

public class Clock {

   private int hour;

   private int minutes;

   public Clock(int hour, int minutes) {
      if (hour < 0 || hour > 23 || minutes < 0 || minutes > 60) {
         throw new ClockException("Incorrect time");
      }
      this.hour = hour;
      this.minutes = minutes;
   }

   public void addMinute() {
      minutes += 1;
      if (minutes >= 60) {
         minutes = 0;
         hour += 1;
      }
      if (hour >= 24) {
         hour = 0;
      }
   }

   @Override
   public String toString() {
      return String.format("%02d:%02d", hour, minutes);
   }
}
