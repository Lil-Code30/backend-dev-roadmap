package ch.heiafr.tic;

public interface AbleToCompare {
   public boolean isSmallerThan(Object v);

   public boolean isBiggerThan(Object v);

   default public boolean isEquals(Object v) {
      return !isSmallerThan(v) && !isBiggerThan(v);
   }
}
