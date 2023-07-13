class Garden {

  static String flowerNames[] = {null,null,null,null};
  static int index;
 
  public static boolean createFlower(String flower){
  boolean isCreated = false;
  if(flowerNames.length > index){                       
	  if(flower != null && flower.length() > 0){
	  
	 flowerNames[index] = flower;
	index++;
	isCreated = true;
	
  System.out.println("Flower created" + isCreated);
		   }else{
		  System.out.println("flower name cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add flower anymore");
	  }
  return isCreated;
 }
 
 
 public static void getAllFlowerNames(){
 
  System.out.println("Invoking getAllFlowerNames");
	  
  /*for(int flower=0; flower<flowerNames.length; flower++){
		  String reference = flowerNames[flower];
		  System.out.println("Accessing flower " + reference + " at " + flower);
	   }  */
	   
    System.out.println("List of flowerNames Available are : ");
	  for(String flower : flowerNames){
		  System.out.println(flower);
	  }   
	   
	 System.out.println("end of getAllFlowerNames");
	   
 }

     public static boolean updateFlower(String existingFlower, String updatedFlower){
		boolean isUpdated = false;
		for(int flowerIndex = 0; flowerIndex < flowerNames.length; flowerIndex++){ 
 
          if(flowerNames[flowerIndex].equals(existingFlower)){
			     flowerNames[flowerIndex] = updatedFlower;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

    public static int deleteFlower(String deletedFlower){
	      System.out.println("Invoking deletedFlower");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int flowerIndex;
		  int noOfElements = flowerNames.length;
		  
		  for(flowerIndex = 0 ; flowerIndex < flowerNames.length; flowerIndex++){
			  if(flowerNames[flowerIndex].equals(deletedFlower)){
				  System.out.println("Flower name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(flowerIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newFlowerIndex = flowerIndex ; newFlowerIndex < noOfElements ; newFlowerIndex++){
			  //logic to remove deleted data from the array
			  flowerNames[newFlowerIndex] = flowerNames[newFlowerIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllFlowerNamesPostDeletion(int newLength){
		  for(int flowerIndex = 0; flowerIndex < newLength; flowerIndex++){
			  System.out.println(flowerNames[flowerIndex]);
		  }
		  
	  }
  
}


