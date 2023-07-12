class StationaryTester{
	
	public static void main(String tester[]){
		//Create,save,edit
		Stationary.addStationaryItems("Books");
		Stationary.addStationaryItems("Pencil");
		Stationary.addStationaryItems("Pen");
		Stationary.addStationaryItems("Crayons");
		Stationary.addStationaryItems("Scale");
		Stationary.addStationaryItems("Sharpner");
		Stationary.addStationaryItems("Eraser");
		Stationary.addStationaryItems("Sketch pens");
		
		//read,get,fetch
		Stationary.getAllStationaryItems();
		
	    //read , //searching one specific item name
		String sName = Stationary.searchStationaryItemByName("Crayons");
		System.out.println("The searched item name is : " + sName);
		
		//update,edit
		Stationary.editStationaryItemName("CardBoard Sheets" , "Sharpner");
		Stationary.getAllStationaryItems();
		
		//delete
	int newLength =	Stationary.deleteStationaryItemName("Eraser");
		System.out.println("Calling getAllStationaryItemsPostDeletion");
		Stationary.getAllStationaryItemsPostDeletion(newLength);
	}
}