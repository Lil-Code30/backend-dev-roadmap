package ch.heiafr.tic;

public class ClockException extends IllegalArgumentException {
   public ClockException() {
      super();
   }

   public ClockException(String message) {
      super(message);
   }
}
