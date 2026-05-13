package ch.heiafr.tic;

// Generic class implementing generic interface
public class Box<T> implements Packager<T> {
   private T object;

   @Override
   public T get() {
      return object;
   }

   @Override
   public void set(T obj) {
      this.object = obj;
   }
}
