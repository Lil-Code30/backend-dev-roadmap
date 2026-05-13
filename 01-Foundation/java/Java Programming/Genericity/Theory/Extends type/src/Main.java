public class Main {
   public static class NumberBox<T extends Number> { }

   public static class IntegerBox<T extends Integer> { }

   public static class ComparableBox<T extends Comparable> { }

   public static void main(String[] args) {
      NumberBox<Integer> nb1 = new NumberBox<>();
      NumberBox<Double> nb2 = new NumberBox<>();
      NumberBox<Number> nb3 = new NumberBox<>();
      // NumberBox<Comparable> nb4 = new NumberBox<>();

      IntegerBox<Integer> ib1 = new IntegerBox<>();
      // IntegerBox<Double> ib2 = new IntegerBox<>();
      // IntegerBox<Number> ib3 = new IntegerBox<>();
      // IntegerBox<Comparable> ib4 = new IntegerBox<>();

      ComparableBox<Integer> cb1 = new ComparableBox<>();
      ComparableBox<Double> cb2 = new ComparableBox<>();
      // ComparableBox<Number> cb3 = new ComparableBox<>();
      ComparableBox<Comparable> cb4 = new ComparableBox<>();
   }
}