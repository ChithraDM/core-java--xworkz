class MedicineStore {
 static String medicineNames[] = {null,null,null,null,null,null,null,null,null};
  static int index;
 
  public static boolean createMedicine(String medicine){
  boolean isCreated = false;
  if(medicineNames.length > index){                       
	  if(medicine != null && medicine.length() > 0){ 
      medicineNames[index] = medicine;
	  index++;
	  isCreated = true;
	System.out.println("Medicine created" + isCreated);
		   }else{
		  System.out.println("medicine name cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add medicine anymore");
	  }
  return isCreated;
 }
 
 
 public static void getAllMedicineNames(){
 
  System.out.println("Invoking getAllMedicineNames");
	  
  /*for(int medicine=0; medicine<medicineNames.length; medicine++){
		  String reference = medicineNames[medicine];
		  System.out.println("Accessing medicine " + reference + " at " + medicine);
	   }*/
	
	System.out.println("List of medicineNames Available are : ");
	  for(String medicine : medicineNames){
		  System.out.println(medicine);
	  }   
	   
	 System.out.println("end of getAllMedicineNames");
	   
 }

     public static boolean updateMedicine(String existingMedicine, String updatedMedicine){
		boolean isUpdated = false;
		for(int medicineIndex = 0; medicineIndex < medicineNames.length; medicineIndex++){ 
 
          if(medicineNames[medicineIndex].equals(existingMedicine)){
			     medicineNames[medicineIndex] = updatedMedicine	;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

public static int deleteMedicine(String deletedMedicine){
	      System.out.println("Invoking deletedMedicine");
		  System.out.println("No of Parameter : 1 , type of parameter : String");
		  boolean isDeleted = false;
		  int medicineIndex;
		  int noOfElements = medicineNames.length;
		  
		  for(medicineIndex = 0 ; medicineIndex < medicineNames.length; medicineIndex++){
			  if(medicineNames[medicineIndex].equals(deletedMedicine)){
				  System.out.println("Medicine name to be deleted is matched");
				break;  
				  
			  }
		  }
		  if(medicineIndex < noOfElements){
		  noOfElements = noOfElements-1;
		  for(int newMedicineIndex = medicineIndex ; newMedicineIndex < noOfElements ; newMedicineIndex++){
			  //logic to remove deleted data from the array
			  medicineNames[newMedicineIndex] = medicineNames[newMedicineIndex+1];
		  }
	}
	  System.out.println(noOfElements);
		  return noOfElements;
	  
  }
	  
	  public static void getAllMedicineNamesPostDeletion(int newLength){
		  for(int medicineIndex = 0; medicineIndex < newLength; medicineIndex++){
			  System.out.println(medicineNames[medicineIndex]);
		  }
		  
	  }
  
}


