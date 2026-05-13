package ch.heifr.tic;

// Generic class
public class Box<T> {
   private T obj;

   public T get() {
      return obj;
   }

   public void set(T obj) {
      this.obj = obj;
   }


   // static generic method
   public static <T> boolean contains(Box<T> box, T value) {
      return box.get().equals(value);
   }
   // non-static generic method
   public <T> boolean contains(T value) {
      return obj.equals(value);
   }
}
