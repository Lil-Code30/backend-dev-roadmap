public class Library {
   Book[] books;

   public Library() {
      this.books = new Book[0];
   }

   /* Write the method hasBooks() */

   /* Write method numberOfBooks() */

/* Write the method addBook(String name, String author) */

   public String toString() {
      if(!hasBooks()) {
         return "The library doesn't have books\n";
      }
      StringBuilder s = new StringBuilder("The library contains :\n");
      for(Book b : books) {
         s = s.append(b.toString());
         s = s.append("\n");
      }
      return s.toString();
   }
}
