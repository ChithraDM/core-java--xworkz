class Printer{
	
	/*public Printer() {
		System.out.println("Printer Constructor is invoked");
	}*/

  String brand;
  String warranty;
  int itemWeightInKg;
  String operatingSystem;
  
  public Printer(String brand , String warranty , int itemWeightInKg , String operatingSystem){   
	   this.brand = brand ;
	   this.warranty = warranty;
	   this.itemWeightInKg = itemWeightInKg;
	   this.operatingSystem = operatingSystem;
	   System.out.println("Parameterized Printer constructor is invoked");
   }
   
  public void toPrintPages(){
  System.out.println("Printer is used to take xerox and to print pages");
  }
}