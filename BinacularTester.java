class BinacularTester{
   public static void main(String binaculars[]){
   Binacular binacular = new Binacular("convex", "Canon");
   /*binacular.typeOfLens = "convex";
   binacular.brandName = "Sony";     //If we give Sony before printing statements , it will take Sony instead of Canon because the value overrides 
   binacular.price = 10000.00;*/
   //Binacular binacular = new Binacular(10000.00);
   
   System.out.println(binacular.typeOfLens + " " + binacular.brandName + " " + binacular.price);
   }
}