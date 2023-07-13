class Metro{
  static String stationNames[] = {null,null,null,null,null,null,null};
  static int index;
 
  public static boolean createStation(String station){
  boolean isCreated = false;
  if(stationNames.length > index){                       
	  if(station != null && station.length() > 0){
	  
	 stationNames[index] = station;
	index++;
	isCreated = true;
	
  System.out.println("Station created" + isCreated);
		   }else{
		  System.out.println("station name cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add station anymore");
	  }
  return isCreated;
 }
 
 
 public static void getAllStationNames(){
 
  System.out.println("Invoking getAllStationNames");
	  
  /*for(int station=0; station<stationNames.length; station++){
		  String reference = stationNames[station];
		  System.out.println("Accessing station " + reference + " at " + station);
	   }    */
	  
      System.out.println("List of stationNames Available are : ");
	  for(String station : stationNames){
		  System.out.println(station);
	  }   
	   
	 System.out.println("end of getAllStationNames");
	   
 }

     public static boolean updateStation(String existingStation, String updatedStation){
		boolean isUpdated = false;
		for(int stationIndex = 0; stationIndex < stationNames.length; stationIndex++){ 
 
          if(stationNames[stationIndex].equals(existingStation)){
			     stationNames[stationIndex] = updatedStation;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

public static int deleteStation(String deletedStation){
	      System.out.println("Invoking deletedStation");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int stationIndex;
		  int noOfElements = stationNames.length;
		  
		  for(stationIndex = 0 ; stationIndex < stationNames.length; stationIndex++){
			  if(stationNames[stationIndex].equals(deletedStation)){
				  System.out.println("Station name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(stationIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newStationIndex = stationIndex ; newStationIndex < noOfElements ; newStationIndex++){
			  //logic to remove deleted data from the array
			  stationNames[newStationIndex] = stationNames[newStationIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllStationNamesPostDeletion(int newLength){
		  for(int stationIndex = 0; stationIndex < newLength; stationIndex++){
			  System.out.println(stationNames[stationIndex]);
		  }
		  
	  }
  
}

