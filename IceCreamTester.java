class IceCreamTester{
	public static void main(String flavorname[]){
	  IceCream.createFlavor("Vanilla");
	  IceCream.createFlavor("Strawberry");
	  IceCream.createFlavor("Chocolate");
	  IceCream.createFlavor("Pista");
	  IceCream.createFlavor("Kesar");
	  IceCream.createFlavor("Mango");
	  IceCream.createFlavor("Black current");
  
  IceCream.getAllFlavors();
  
  boolean isUpdated = IceCream.updateFlavorName("Kesar" , "Chocolate chip");
	 System.out.println("Is Flavor name updated " + isUpdated);
	 IceCream.getAllFlavors();
	 
	 int newLength = IceCream.deleteFlavorName("Vanilla");
		System.out.println("Calling getAllFlavorsPostDeletion");
		IceCream.getAllFlavorsPostDeletion(newLength);
}

}