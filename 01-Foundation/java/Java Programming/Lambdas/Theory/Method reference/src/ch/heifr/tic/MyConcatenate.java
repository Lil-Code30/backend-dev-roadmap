package ch.heifr.tic;

import java.util.function.BiFunction;

public class MyConcatenate implements BiFunction<String, String, String> {
   @Override
   public String apply(String s1, String s2) {
      return s1 + " " + s2;
   }
}
