package ch.heiafr.tic;

/* Write class declaration */ {
/* Write attributes */ooms;

/* Write constructor */

   @Override
   public String toString() {
      StringBuilder s = new StringBuilder(
            String.format("Building with price of %d%n", price)
      );
      for (Room r: rooms) {
         s.append(String.format("%s%n", r));
      }
      return s.toString();
   }
}
