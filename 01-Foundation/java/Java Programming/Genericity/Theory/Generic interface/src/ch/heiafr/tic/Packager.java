package ch.heiafr.tic;

// Generic interface
public interface Packager<T> {
   public T get();

   public void set(T object);
}
