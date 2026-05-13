package ch.heiafr.tic;

import java.util.Arrays;

public class Garden {

   private /* Write type */[][] garden;

   public Garden(int rowNumber, int colNumber) {
      garden = new Vegetable[rowNumber][colNumber];
      for (Vegetable[] vegetables : garden) {
         Arrays.fill(vegetables, null);
      }
   }

   public void add(Vegetable v) {
      v.plant(garden);
   }

   public void water(double literOfWater) {
      for (Vegetable[] vegetables : garden) {
         for (Vegetable vegetable : vegetables) {
            if (vegetable != null) {
               vegetable.water(literOfWater);
            }
         }
      }
   }

   public void grow() {
      for (Vegetable[] vegetables : garden) {
         for (Vegetable vegetable : vegetables) {
            if (vegetable != null) {
               vegetable.grow();
            }
         }
      }
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Vegetable[] vegetables : garden) {
         for (Vegetable vegetable : vegetables) {
            if (vegetable == null) {
               sb.append(" [X, 0.00 l, 0.00 cm]");
            } else {
               sb.append(" ").append(vegetable);
            }
         }
         sb.append("\n");
      }
      return sb.toString();
   }
}
