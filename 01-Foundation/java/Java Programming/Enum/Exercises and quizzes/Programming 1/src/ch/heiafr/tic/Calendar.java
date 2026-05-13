package ch.heiafr.tic;

public class Calendar {
   private static final int CALENDAR_SIZE = Month.values().length;
   private static Page[] pages = new Page[CALENDAR_SIZE];

   public Calendar() {
/* Construct and initialize the calendar */
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Page p: pages) {
         sb.append(p);
         sb.append("\n");
      }
      return sb.toString();
   }
}
