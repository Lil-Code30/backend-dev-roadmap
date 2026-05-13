package ch.heiafr.tic;

// Concrete class implementing generic interface
public class IntegerBox implements Packager<Integer> {

   private Integer value;

   @Override
   public Integer get() {
      return value;
   }

   @Override
   public void set(Integer object) {
      value = object;
   }
}
