package ch.heifr.tic;

import java.util.function.Supplier;

public class MyRandom implements Supplier<Double> {
   @Override
   public Double get() {
      return Math.random();
   }
}
