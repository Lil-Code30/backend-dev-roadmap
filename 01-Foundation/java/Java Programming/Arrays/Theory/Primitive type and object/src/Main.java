public class Main {
   public static void main(String[] args) {
      int valueType = 0;

      byte[] objectType1 = {1, 2, 3};
      byte[] objectType2 = {4, 5, 6};

      System.out.println("Value type contains their value " + valueType);
      // This return the reference for example [B@41a4555e
      // The number after the @ can be different from people to people because
      // it can be stored to a different place in memory
      System.out.println("Object type 1 contains the reference " + objectType1);
      // Different reference for different object
      System.out.println("Object type 2 contains the reference " + objectType2);

      // Assignation of the reference of objectType1 to objectType2. Now they
      // both have the same reference
      objectType2 = objectType1;
      System.out.println();
      System.out.println("After assignation :");
      System.out.println("Object type 1 contains the reference " + objectType1);
      System.out.println("Object type 2 contains the reference " + objectType2);

      // SIDE EFFECT
      // As they both share the same reference, a modification in one array
      // modifies the other array as well
      objectType2[0] = 10;
      System.out.println();
      System.out.println("After assigning 10 to objectType2[0] :");
      System.out.println("Object type 1 [0] is " + objectType1[0]);
      System.out.println("Object type 2 [0] is " + objectType2[0]);
   }
}