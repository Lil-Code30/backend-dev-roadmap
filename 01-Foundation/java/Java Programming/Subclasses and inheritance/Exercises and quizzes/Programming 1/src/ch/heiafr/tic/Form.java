package ch.heiafr.tic;

public class Form {
   private int edgesNumber;
   private int size;

   public Form(int edgesNumber, int size) {
      this.edgesNumber = edgesNumber;
      this.size = size;
   }

   /* Write modifier */ int getEdgesNumber() {
      return edgesNumber;
   }

   /* Write modifier */ int getSize() {
      return size;
   }

   public void print() {
      System.out.printf("Form of %d edges with size %d%n", edgesNumber, size);
   }
}
