class TeleComm{
 static String sim[] = {null,null,null,null,null};

 static int index;
 
  public static boolean createSim(String simcard){
  boolean isCreated = false;
  if(sim.length > index){                       
	  if(simcard != null && simcard.length() > 0){
	  
	 sim[index] = simcard;
	index++;
	isCreated = true;
	
  System.out.println("Sim card created" + isCreated);
		   }else{
		  System.out.println("sim cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add sim anymore");
	  }
  return isCreated;
 }
 
 public static void getAllSim(){
 
  System.out.println("Invoking getAllSim");
	  
  /*for(int simcard=0; simcard<sim.length; simcard++){
		  String reference = sim[simcard];
		  System.out.println("Accessing sim " + reference + " at " + simcard);
	   }  */
	   
	   System.out.println("List of sim Available are : ");
	  for(String simcard : sim){
		  System.out.println(simcard);
	  }   
	   
	 System.out.println("end of getAllSim");
	   
 }

     public static boolean updateSimCard(String existingSimCard, String updatedSimCard){
		boolean isUpdated = false;
		for(int simcardIndex = 0; simcardIndex < sim.length; simcardIndex++){ 
 
          if(sim[simcardIndex].equals(existingSimCard)){
			     sim[simcardIndex] = updatedSimCard;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

    public static int deleteSimCard(String deletedSimCard){
	      System.out.println("Invoking deletedSimCard");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int simcardIndex;
		  int noOfElements = sim.length;
		  
		  for(simcardIndex = 0 ; simcardIndex < sim.length; simcardIndex++){
			  if(sim[simcardIndex].equals(deletedSimCard)){
				  System.out.println("Simcard name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(simcardIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newSimCardIndex = simcardIndex ; newSimCardIndex < noOfElements ; newSimCardIndex++){
			  //logic to remove deleted data from the array
			  sim[newSimCardIndex] = sim[newSimCardIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllSimPostDeletion(int newLength){
		  for(int simcardIndex = 0; simcardIndex < newLength; simcardIndex++){
			  System.out.println(sim[simcardIndex]);
		  }
		  
	  }
  
}