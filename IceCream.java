class IceCream{
  static String flavors[] = {null,null,null,null,null,null};
  static int index;
 
  public static boolean createFlavor(String flavorname){
  boolean isCreated = false;
  if(flavors.length > index){                       
	  if(flavorname != null && flavorname.length() > 0){
	  
	 flavors[index] = flavorname;
	index++;
	isCreated = true;
	
  System.out.println("Flavor name created" + isCreated);
		   }else{
		  System.out.println("flavors cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add medicine anymore");
	  }
  return isCreated;
 }
 
 
 public static void getAllFlavors(){
 
  System.out.println("Invoking getAllFlavors");
	  
  /*for(int flavorname=0; flavorname<flavors.length; flavorname++){
		  String reference = flavors[flavorname];
		  System.out.println("Accessing flavorname " + reference + " at " + flavorname);
	   } */
	   
	   
	   System.out.println("List of flavors Available are : ");
	  for(String flavorname : flavors){
		  System.out.println(flavorname);
	  }   
	   
	 System.out.println("end of getAllFlavors");
	   
 }

     public static boolean updateFlavorName(String existingFlavorName, String updatedFlavorName){
		boolean isUpdated = false;
		for(int flavornameIndex = 0; flavornameIndex < flavors.length; flavornameIndex++){ 
 
          if(flavors[flavornameIndex].equals(existingFlavorName)){
			     flavors[flavornameIndex] = updatedFlavorName;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

public static int deleteFlavorName(String deletedFlavorName){
	      System.out.println("Invoking deletedFlavorName");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int flavornameIndex;
		  int noOfElements = flavors.length;
		  
		  for(flavornameIndex = 0 ; flavornameIndex < flavors.length; flavornameIndex++){
			  if(flavors[flavornameIndex].equals(deletedFlavorName)){
				  System.out.println("Flavor name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(flavornameIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newFlavorNameIndex = flavornameIndex ; newFlavorNameIndex < noOfElements ; newFlavorNameIndex++){
			  //logic to remove deleted data from the array
			  flavors[newFlavorNameIndex] = flavors[newFlavorNameIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllFlavorsPostDeletion(int newLength){
		  for(int flavornameIndex = 0; flavornameIndex < newLength; flavornameIndex++){
			  System.out.println(flavors[flavornameIndex]);
		  }
		  
	  }
  
}


