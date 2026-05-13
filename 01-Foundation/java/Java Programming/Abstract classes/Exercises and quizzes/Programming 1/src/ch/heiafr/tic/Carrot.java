package ch.heiafr.tic;

import java.util.Locale;

public class Carrot extends Vegetable {
   private static final String SHORT_NAME = "C";
   private static final double WATER_USAGE = 0.5;
   private static final double GROWTH_SIZE = 0.5;

   public Carrot(double literOfWater, double size) {
      super(literOfWater, size);
   }

   @Override
   public void plant(Vegetable[][] garden) {
      for (int i = 0; i < garden.length; i++) {
         for (int j = 0; j < garden[i].length; j++) {
            if (garden[i][j] == null) {
               garden[i][j] = this;
               return;
            }
         }
      }
      throw new UnsupportedOperationException("Garden is full");
   }

   @Override
   public void grow() {
      this.literOfWater -= WATER_USAGE;
      literOfWater = literOfWater < 0 ? 0: literOfWater;
      this.size += GROWTH_SIZE;
   }

   @Override
   public String toString() {
      return String.format(Locale.US, "[%s, %.2f l, %.2f cm]",
            SHORT_NAME, literOfWater, size);
   }
}
