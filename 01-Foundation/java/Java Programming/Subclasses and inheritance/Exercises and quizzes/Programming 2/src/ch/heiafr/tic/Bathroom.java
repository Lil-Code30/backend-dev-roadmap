package ch.heiafr.tic;

/* Write class declaration */ {
/* Write attributes */
/* Write constructor */

   @Override
   public String toString() {
      if (hasBathtub) {
         return "Bath" + super.toString() + " and a bathtub";
      } else {
         return "Bath" + super.toString();
      }
   }
}
