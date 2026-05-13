package ch.heifr.tic;

import java.awt.*;

/* Write Player class definition */ {
   private String name;
   private Point position;

   public Player(String name) {
      this(name, new Point(0, 0));
   }

   public Player(String name, Point position) {
      this.name = name;
      this.position = position;
   }

/* Write getPosition() method */

/* Write move() method */

   @Override
   public String toString() {
      return String.format("%s (%d, %d)", name, position.x, position.y);
   }
}
