class TeleCommTester{
	
	public static void main(String simcard[]){
	  TeleComm.createSim("Vodafone");
	  TeleComm.createSim("Idea");
	  TeleComm.createSim("Airtel");
	  TeleComm.createSim("Jio");
	  TeleComm.createSim("Reliance");
	  TeleComm.createSim("Moto G");
  
  TeleComm.getAllSim();
  
  boolean isUpdated = TeleComm.updateSimCard("Vodafone" , "BSNL");
	 System.out.println("Is Sim card updated " + isUpdated);
	 TeleComm.getAllSim();
	 
  int newLength = TeleComm.deleteSimCard("Reliance");
		System.out.println("Calling getAllSimPostDeletion");
		TeleComm.getAllSimPostDeletion(newLength);
	 
}	
	
}