package ch.heiafr.tic;

public class Page {
   /* Write season attribute */
   /* Write month attribute */

   public Page(Season season, Month month) {
      this.season = season;
      this.month = month;
   }

   public Season getSeason() {
      return season;
   }

   public Month getMonth() {
      return month;
   }

   @Override
   public String toString() {
      return month + " of " + season;
   }
}
