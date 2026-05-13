package ch.heiafr.tic;

/* Write class declaration */ {
/* Write attribute */

/* Write constructor */

   @Override
   public String toString() {
      String s = super.toString();
      s = s.replace("Building", "House");
      s = s + String.format("Rent price is %d", rentPrice);
      return s;
   }
}
