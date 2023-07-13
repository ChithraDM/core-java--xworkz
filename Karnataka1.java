class Karnataka1{

//array has limitation - size is fixed
   static String cityNames[] = {null,null,null,null,null,null,null,null,null,null};
   static int index;
  public static boolean addCityName(String cityName){
	  boolean isAdded = false;
	  //validate cityName
	  if(cityNames.length > index){                       //To avoid exception : if we give more values to add than cityNames(here there are 10 null, but if we give 11 values in tester) also it should not throw error
	  if(cityName != null && cityName.length() > 0){         
		cityNames[index] = cityName; 
        index++;
		isAdded = true;	
		System.out.println("City added" + isAdded);
		   }else{
		  System.out.println("City name cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add city anymore");
	  }
	  return isAdded;
  }
   
  public static void getAllCityNames(){
	  System.out.println("Invoking getAllCityNames");
	  System.out.println("List of cityNames Available are : ");
	  for(String cityName : cityNames){
		  System.out.println(cityName);
	  }
	
	//for(int city=0; city<cityNames.length; city++){
	//	  String reference = cityNames[cityName];
	//	  System.out.println("Accessing cityName " + reference + " at " + cityName);
	//   }
	  
	  System.out.println("end of getAllCityNames");
  }
    
	//Update Bangalore as Bengaluru
	public static boolean updateCityName(String existingCityName, String updatedCityName){
		boolean isUpdated = false;
		for(int cityIndex = 0; cityIndex < cityNames.length; cityIndex++){
			//cityNames[0]-"Udupi".equals("Bangalore")   = False,So it will compare with next index
			////cityNames[9]-"Bangalore".equals("Bangalore")  = True,So it will update Bangalore as Bengaluru
			
			if(cityNames[cityIndex].equals(existingCityName)){
				//cityNames[9] = "Bengaluru";
			     cityNames[cityIndex] = updatedCityName	;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
	}
  


public static int deleteCityName(String deletedCityName){
	      System.out.println("Invoking deletedCityName");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int cityIndex;
		  int noOfElements = cityNames.length;
		  
		  for(cityIndex = 0 ; cityIndex < cityNames.length; cityIndex++){
			  if(cityNames[cityIndex].equals(deletedCityName)){
				  System.out.println("City name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(cityIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newCityIndex = cityIndex ; newCityIndex < noOfElements ; newCityIndex++){
			  //logic to remove deleted data from the array
			  cityNames[newCityIndex] = cityNames[newCityIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllCityNamesPostDeletion(int newLength){
		  for(int cityIndex = 0; cityIndex < newLength; cityIndex++){
			  System.out.println(cityNames[cityIndex]);
		  }
		  
	  }
  
}
