/**
 * TaxPayer.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class TaxPayer
{
   //instance variables
   private boolean married;
   private double taxableIncome;

   //constructors
   //This is a default constructor. It sets default values in case the user forgets to.
   public TaxPayer()
   {
      married = false;
      taxableIncome = 0;
   }
   public TaxPayer(String status, double income)
   {
      //Trim the given status to ensure there are no leading characters.
      status = /*ToDo*/
      /*If status holds "married" (in upper or lowercase), married should be set to true.
       If status holds "single" (in upper or lowercase), married should be set to false.*/
      if(/*ToDo*/)
      {
         /*ToDo*/
      }
      else if(/*ToDo*/)
      {
         /*ToDo*/
      }
      //If status holds anything else, the program will automatically quit.
      else
      {
         System.out.println("You did not enter a valid marital status. Please rerun the program.");
         System.exit(1);
      }
      //Set taxable income.
      /*ToDo*/
      //If taxableIncome is less than zero, the program will automatically quit.
      if(taxableIncome < 0)
      {
         System.out.println("You did not enter a valid taxable income. Please rerun the program.");
         System.exit(1);
      }
   }


   //getter methods
   public /*ToDo*/ getMaritalStatus()
   {
      /*ToDo*/
   }

   public /*ToDo*/ getIncome()
   {
      /*ToDo*/
   }


   //calculator methods

   //Use the given table to code a method that calculates and returns the tax on a TaxPayer with single status
   private /*ToDo*/ calcSingleTax()
   {
      /*ToDo*/
   }

   //Use the given table to code a method that calculates and returns the tax on a TaxPayer with married status
   private /*ToDo*/ calcMarriedTax()
   {
      /*ToDo*/
   }

   /*Uses calcSingleTax() and calcMarriedTax() to calculate and return the appropriate tax value
    */
   public /*ToDo*/ calcTax()
   {
      /*ToDo*/
   }

}
