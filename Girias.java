class Girias {

  public static void main(String girias[]){
  System.out.println("Main started");
  String electronicDevices[] = {"refrigerator", "Washing Machine", "Television", "LED", "Grinder", "Ac", "IronBox", "Microwave"};
  System.out.println("List of Electronic Devices are: ");
  //for
  for(int devsIndex=0; devsIndex<electronicDevices.length;devsIndex++){    //0<8(length)
	  System.out.println(electronicDevices[devsIndex]);
	 }
	 for(String electronicDevice : electronicDevices) {
		  System.out.println(electronicDevice);
	  }
		
  
  System.out.println("Main ended");
  }
}