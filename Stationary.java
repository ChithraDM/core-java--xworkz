class Stationary{
  static String stationaryItems[] = {null,null,null,null,null,null,null,null};
  static int index = 0;
  //create
  public static boolean addStationaryItems(String itemName){
  
  System.out.println("Invoking addStationaryItems");
  System.out.println("No of Parameters : 1, type of parameter : String");
  boolean isAdded = false;
  if(itemName!=null){
	  if(index < stationaryItems.length){
	  stationaryItems[index++] = itemName;
	  isAdded = true;
	  }else{
	  System.out.println("Oh....Illi jaaga full agide");
  }
  }else{
	  System.out.println("itemName cannot be null");
  }
  return isAdded;
  }
  //read
  public static void getAllStationaryItems(){
	  System.out.println("List of items are: ");
	  for(String itemName : stationaryItems){
		  System.out.println(itemName);
	  }
  }
  //update
  public static boolean editStationaryItemName(String updatedItemName, String existingItemName){
	  
	  System.out.println("Invoking editStationaryItemName");
	  System.out.println("No of Parametes : 2 , type of parameter : String, String");
	  boolean isUpdated = false;
	  for(int itemIndex = 0; itemIndex < stationaryItems.length; itemIndex++){
		  //stationaryItems[0]
		  if(stationaryItems[itemIndex].equals(existingItemName)){
			  stationaryItems[itemIndex] = updatedItemName;
			  isUpdated = true;
		  }
	  }
	  
	  return isUpdated;
  }
  //delete
  public static int deleteStationaryItemName(String deletedItemName){
	      System.out.println("Invoking deleteStationaryItemName");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int itemIndex;
		  int noOfElements = stationaryItems.length;
		  //itemIndex=0
		  //0<8
		  for(itemIndex = 0 ; itemIndex < stationaryItems.length; itemIndex++){
			  //"Books".equals("Books");
			  if(stationaryItems[itemIndex].equals(deletedItemName)){
				  System.out.println("Item name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(itemIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newItemIndex = itemIndex ; newItemIndex < noOfElements ; newItemIndex++){
			  //logic to remove deleted data from the array
			  stationaryItems[newItemIndex] = stationaryItems[newItemIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllStationaryItemsPostDeletion(int newLength){
		  for(int itemIndex = 0; itemIndex < newLength; itemIndex++){
			  System.out.println(stationaryItems[itemIndex]);
		  }
		  
	  }
	  
	  //returns specific item name(String)
	  public static String searchStationaryItemByName(String itemName) {
		  System.out.println("Invoking searchStationaryItemByName");
		  System.out.println("No of parameter:1 , type:String");
		  String sName = null;
		  for(String name : stationaryItems){
			  //"Crayons".equals("Crayons")
			  if(name.equals(itemName)) {
				  sName = name;
				  System.out.println("Item name found");
			  }
			  
		  }
		 return sName; 
	  }
  
}