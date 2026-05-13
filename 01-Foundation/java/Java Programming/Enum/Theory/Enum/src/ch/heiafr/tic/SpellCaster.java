package ch.heiafr.tic;

public interface SpellCaster {
   public enum SPELL {
      ACCIO,
      ALOHOMORA,
      BOMBARDO,
      EXPELLIARMUS
   }

   // WILL BE MODIFIED IN NEXT STEP WITH ENUM METHODS
   default String castSpell() {
      // int spell = ThreadLocalRandom.current().nextInt(0, SPELLS.length);
      // return SPELLS[spell];
      return null;
   }
}
