package ch.heiafr.tic;

import java.util.concurrent.ThreadLocalRandom;

public interface SpellCaster {
   public enum SPELL {
      ACCIO,
      ALOHOMORA,
      BOMBARDO,
      EXPELLIARMUS
   }

   // MODIFIED
   default String castSpell() {
      int length = SPELL.values().length;
      int spell = ThreadLocalRandom.current().nextInt(0, length);
      return SPELL.values()[spell].name();
   }
}
