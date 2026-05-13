import ch.heifr.tic.Box;

public class Main {
   public static void main(String[] args) {
      Box<Integer> box = new Box<>();
      box.set(2);
      // Use the generic method contains without specifying the generic type.
      System.out.println(Box.contains(box, 2));
      // The syntax specifying the generic type is rarely necessary because the
      // generic parameter is inferred from the context.
      System.out.println(Box.<Integer>contains(box, 4));

      // Other examples.
      Box<Float> floatBox = new Box<>();
      floatBox.set(2.0f);

      // returns true because 2.0f is a float value and is equal to the value
      // contained in floatBox
      System.out.println(floatBox.contains(2.0f));

      // returns true because 2.0f is a float value and is equal to the value
      // contained in floatBox
      System.out.println(Box.contains(floatBox, 2.0f));

      // returns false because 2 is an integer value (not float -> equals
      // returns false). Note that the generic type T passed to the generic
      // method (Integer) is different from the generic type of floatBox
      // (Float).
      System.out.println(floatBox.contains(2));

      // returns false because 2.0 is a double value (not float -> equals
      // returns false)
      System.out.println(floatBox.contains(2.0));

      // does not compile because in this case, the generic types must be
      // identical (Float vs double).
      // System.out.println(Box.contains(floatBox, 2.0));
   }
}