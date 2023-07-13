class GardenTester{
	public static void main(String flower[]){
	  Garden.createFlower("Rose");
	  Garden.createFlower("Jasmine");
	  Garden.createFlower("Lotus");
	  Garden.createFlower("Tulip");
	  Garden.createFlower("Marigold");
	 
  Garden.getAllFlowerNames();
  
  boolean isUpdated = Garden.updateFlower("Tulip" , "Hibiscus");
	 System.out.println("Is Flower updated " + isUpdated);
	 Garden.getAllFlowerNames();
	 
	 int newLength = Garden.deleteFlower("Rose");
		System.out.println("Calling getAllFlowerNamesPostDeletion");
		Garden.getAllFlowerNamesPostDeletion(newLength);
}

}