class MedicineStoreTester{

public static void main(String medicine[]){
	  MedicineStore.createMedicine("Dolo 650");
	  MedicineStore.createMedicine("Cetrizine");
	  MedicineStore.createMedicine("Dart");
	  MedicineStore.createMedicine("Pan D");
	  MedicineStore.createMedicine("Sarridon");
	  MedicineStore.createMedicine("Ibuprofen");
	  MedicineStore.createMedicine("Diclofenac");
	  MedicineStore.createMedicine("Omeprazole");
	  MedicineStore.createMedicine("Atenolol");
	  MedicineStore.createMedicine("Aspirin");
	 
  MedicineStore.getAllMedicineNames();
 
   boolean isUpdated = MedicineStore.updateMedicine("Atenolol" , "Acetaminophen");
	 System.out.println("Is Medicine updated " + isUpdated);
	 
     MedicineStore.getAllMedicineNames();
	 
	 int newLength = MedicineStore.deleteMedicine("Sarridon");
		System.out.println("Calling getAllMedicineNamesPostDeletion");
		MedicineStore.getAllMedicineNamesPostDeletion(newLength);
  
  }

}