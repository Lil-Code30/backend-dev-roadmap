public class Pair<K, V> {
  /* Implement the class so that main() compiles and runs as expected */

  public static void main(String[] args) {
    Pair<Integer, String> pair = Pair.of(1, "hello");
    Integer key = pair.getKey(); // 1
    String value = pair.getValue(); // "hello"

    Pair<Integer, String> otherPair = Pair.of(1, "hello");
    boolean mustBeTrue = pair.equals(otherPair); // true

    Pair<Integer, Integer> nextPair = Pair.of(1, 2);
    boolean mustBeFalse = nextPair.equals(otherPair); // false
  }

}