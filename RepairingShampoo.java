class RepairingShampoo{
   //static variable
   static String appliedFor; //declaration
   static String hairType;
  public static void main(String shampoo[]){
   //local variable , creation of data(create operation)
   
     appliedFor = "Damage Repair"; //initialization
	 hairType = "All Hair Types";
	 String containerType = "Bottle";
	 String idealFor = "Men & Women";
	 int packOf = 1;
   //using the variable in the later stages of the program,read operation
	 System.out.println("It is been applied for " + appliedFor);
	 System.out.println("Used for hair types like " + hairType);
	 System.out.println("The container type is " + containerType);
	 System.out.println("It is ideal for " + idealFor);
	 System.out.println("It has a pack of " + packOf);
	 
  
  }
}