package ch.heiafr.tic;

/* Write class declaration */ {
   public static final String[] HOUSES = {
         "Gryffindor",
         "Hufflepuff",
         "Ravenclaw",
         "Slytherin"
   };

   private String house;
   private String followed;

   public Wizard(String first_name, String last_name, String house) {
      super(first_name, last_name);
      this.house = house;
      this.followed = "";
   }

/* Write the follows() method */

/* Write the isFollowing() method */

   @Override
   public String toString() {
      if (followed.isEmpty())
         return super.toString() + String.format(" (house : %s)", house);
      else
         return super.toString() +
               String.format(" (house : %s, following : %s)", house, followed);
   }
}
