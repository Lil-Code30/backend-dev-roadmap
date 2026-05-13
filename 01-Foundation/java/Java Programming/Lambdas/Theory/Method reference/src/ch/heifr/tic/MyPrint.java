package ch.heifr.tic;

import java.util.function.Consumer;

public class MyPrint implements Consumer<String> {

   @Override
   public void accept(String s) {
      System.out.println(s);
   }
}
