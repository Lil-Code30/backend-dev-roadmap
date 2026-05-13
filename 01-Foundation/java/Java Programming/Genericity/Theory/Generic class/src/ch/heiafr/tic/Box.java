package ch.heiafr.tic;

public class Box<T> {
   private T obj;

   public T get() {
      return obj;
   }

   public void set(T obj) {
      this.obj = obj;
   }
}
