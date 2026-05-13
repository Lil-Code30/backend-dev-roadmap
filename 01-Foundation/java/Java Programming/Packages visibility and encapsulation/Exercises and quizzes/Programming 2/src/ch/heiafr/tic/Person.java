package ch.heiafr.tic;

public class Person {
   /* Write modifier */ String name;
   /* Write modifier */ Watch watch;

/* Write first constructor */

/* Write second constructor */

/* Write hasWatch() method */

/* Write setWatch() method */

   public String toString() {
      if(!hasWatch()) {
         return String.format("%s doesn't wear a watch", this.name);
      } else {
         return String.format("%s watch's displays %s", this.name, this.watch);
      }
   }
}
