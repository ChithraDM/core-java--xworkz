class MetroTester{
	public static void main(String station[]){
	  Metro.createStation("Kengeri");
	  Metro.createStation("Vijaynagar");
	  Metro.createStation("Attiguppe");
	  Metro.createStation("Pattanagere");
	  Metro.createStation("Jnanabharathi");
	  Metro.createStation("Rajarajeswari Nagar");
	  Metro.createStation("Kengeri Bus Terminal");
	  Metro.createStation("Pantharapalya - Nayandanahalli");
	 
  Metro.getAllStationNames();
  
  boolean isUpdated = Metro.updateStation("Attiguppe" , "Manuvana");
	 System.out.println("Is Station updated " + isUpdated);
	 Metro.getAllStationNames();
	 
	 int newLength = Metro.deleteStation("Pattanagere");
		System.out.println("Calling getAllStationNamesPostDeletion");
		Metro.getAllStationNamesPostDeletion(newLength);
}

}