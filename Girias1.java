class Girias1 {

  public static void main(String girias[]){
  System.out.println("Main started");
  String electronicDevices[] = {"refrigerator", "Washing Machine", "Television", "LED", "Grinder", "Ac", "IronBox", "Microwave"};
  double priceOfElectronicDevices[] = {50000.00 , 40000.00 , 75000.00 , 15000.89 , 8000.65 , 45000.70 , 0.0 , 6000.45};
  System.out.println("List of Electronic Devices are: ");
  //for
  for(int devsIndex=0; devsIndex<electronicDevices.length;devsIndex++){    //0<8(length)
	  System.out.println(electronicDevices[devsIndex] + "  " + "Price is  " + priceOfElectronicDevices[devsIndex]);
  }	
//foreach  
  for(String electronicDevice : electronicDevices){    
	  System.out.println(electronicDevice);
  }
  for(double priceOfElectronicDevice: priceOfElectronicDevices){
	  System.out.println(priceOfElectronicDevice);
  }
  
  System.out.println("Main ended");
  
}
}