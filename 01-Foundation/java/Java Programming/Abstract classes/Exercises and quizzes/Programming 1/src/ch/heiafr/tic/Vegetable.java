package ch.heiafr.tic;

/* Fill class declaration */ Vegetable {
   /* Add modifier */ double literOfWater;   // Quantity of water in pot [liter]
   /* Add modifier */ double size;           // Current plant's size [cm]

   public Vegetable(double literOfWater, double size) {
      this.literOfWater = literOfWater;
      this.size = size;
   }

/* Write method water() */
   public abstract void plant(Vegetable[][] garden);

/* Write method grow() */
}
